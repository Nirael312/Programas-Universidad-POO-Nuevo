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

        Random random = new Random();

        this.nivel_entrenador = random.nextInt(1, 101);
    }

    public void agregar_pokemon(Pokemon pokemon) {
        pokedex.add(pokemon);
    }

    public void atrapar_pokemon(Pokemon pokemon_salvaje) {

        int i = 0;

        System.out.println(" ");
        pokemon_salvaje.muestro_stats();

        int salvajismo_actual = pokemon_salvaje.getSalvajismo();
        pokemon_salvaje.defensa(pokemon_principal);

        while ( i < 3 && pokemon_salvaje.getVida() > 0 && salvajismo_actual >= nivel_entrenador) {
            salvajismo_actual -= salvajismo_actual*0.10;
            i++;
        }

        pokemon_salvaje.setSalvajismo(salvajismo_actual);
        System.out.println(" ");

        if (pokemon_salvaje.getVida() == 0) {
            System.out.println("El pokemon fue derribado, no se capturo");
        } else {
            if (nivel_entrenador > salvajismo_actual) {
                System.out.println("El pokemon fue capturado, enhorabuena!");
                this.agregar_pokemon(pokemon_salvaje);
            } else {
                System.out.println("El pokemon escapo");
            }
        }
    }

    public void muestro_entrenador() {

        System.out.println(" ------------------------------------------------------------------------------------------------------------------------ ");
        System.out.println("Nombre: " + nombre + ", nivel: " + nivel_entrenador);
        System.out.println(" ------------------------------------------------------------------------------------------------------------------------ ");


        System.out.println("Los pokemones que tiene en su pokedex son: ");
        System.out.println(" ");

        for (Pokemon pokemon_actual: pokedex) {
            pokemon_actual.muestro_stats();
        }

        System.out.println(" ");
    }

}
