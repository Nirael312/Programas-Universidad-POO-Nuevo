import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Entrenador {
    private String nombre;
    private int nivel_entrenador;
    private Pokemon pokemon_principal;
    private List<Pokemon> pokedex;

    public Entrenador(String nombre, Pokemon pokemon_principal) {
        this.nombre = nombre;
        this.pokemon_principal = pokemon_principal;
        this.pokedex = new ArrayList<>();
    }

    public void generar_nivel() {
        Random random = new Random();

        int val = random.nextInt(0,100);

        this.nivel_entrenador = val;

    }

    public void agregar_pokemon(Pokemon pokemon) {
        pokedex.add(pokemon);
    }

    public void atrapar_pokemon(Pokemon pokemon_salvaje) {

        int i = 0;
        int salvajismo_actual = pokemon_salvaje.getSalvajismo();

        pokemon_principal.muestro_stats();
        pokemon_salvaje.muestro_stats();

        while (i < 3 && pokemon_salvaje.vida > 0 && salvajismo_actual >= nivel_entrenador) {
            pokemon_salvaje.defensa(pokemon_principal, pokemon_salvaje);
    
            i++;
            salvajismo_actual -= salvajismo_actual*0.10;
        }

        if (pokemon_salvaje.getVida() == 0) {
            System.out.println("El pokemon fue derrotado, no se pudo capturar");
        } else {
            if (salvajismo_actual < nivel_entrenador) {
                System.out.println("Pokemon capturado, enhorabuena!");
                agregar_pokemon(pokemon_salvaje);
            }
        }

    }

    public void muestro_datos() {
        System.out.println("Entrenador: " + nombre + ", nivel: " + nivel_entrenador);
    }

    

    public void muestro_pokemones() {
        
        int i = 0;

        System.out.println(" ");
        for (Pokemon pokemon: pokedex) {
            System.out.println(" ");
            pokemon.muestro_stats();
            i++;
        }

        if (i == 0) {
            System.out.println("Ningun pokemon fue capturado");
        }

    }
}
