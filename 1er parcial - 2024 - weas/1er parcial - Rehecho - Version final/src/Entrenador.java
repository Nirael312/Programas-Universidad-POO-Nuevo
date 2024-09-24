import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Entrenador {
    private String nombre;
    private int nivel_entrenador;
    private Pokemon pokemon_principal;
    private List<Pokemon> pokedex;

    public Entrenador(String nombre, Pokemon pokemon_principal) {

        Random random = new Random();

        this.nombre = nombre;
        this.nivel_entrenador = random.nextInt(1,101);
        this.pokemon_principal = pokemon_principal;
        this.pokedex = new ArrayList<>();

    }

    public void agregar_pokemon(Pokemon pokemon) {
        pokedex.add(pokemon);
    }

    public void atrapar_pokemon(Pokemon pokemon_salvaje) {
        int vida_actual = pokemon_principal.getVida();
        int vida_actual_salvaje = pokemon_salvaje.getVida();
        int salvajismo_actual = pokemon_salvaje.getSalvajismo();
        int i = 0;

        while (i < 3 && salvajismo_actual > nivel_entrenador && vida_actual > 0 && vida_actual_salvaje > 0) {
            
            pokemon_principal.ataque(pokemon_salvaje);
            pokemon_salvaje.ataque(pokemon_principal);
            salvajismo_actual -= salvajismo_actual*0.10;

            i++;
        }

        if (vida_actual_salvaje == 0) {
            System.out.println("El pokemon salvaje fue derribado, no se pudo capturar...");
        } else {
            if (vida_actual == 0) {
                System.out.println("Tu pokemon fue derrotado, el pokemon salvaje escapo...");
            } else {
                if (salvajismo_actual < nivel_entrenador) {
                    this.agregar_pokemon(pokemon_salvaje);
                    System.out.println("El pokemon salvaje fue capturado, enhorabuena!");
                } else {
                    System.out.println("El pokemon salvaje escapo...");
                }
            }
        }
    }

    public void muestro_entrenador() {
        
        System.out.println("Nombre: " + nombre + ", nivel de entrenador: " + nivel_entrenador);
        System.out.println("Los pokemones que posee el entrenador son: ");

        for (Pokemon pokemon_aux: pokedex) {
            pokemon_aux.muestro_pokemon();
        }
    }


}
