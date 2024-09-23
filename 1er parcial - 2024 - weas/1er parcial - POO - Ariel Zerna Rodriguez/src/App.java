
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        ArrayList<Pokemon> Pokemones = new ArrayList<>();
        Random random = new Random();

        Tipo_fuego charmander = new Tipo_fuego("Charmander");
        charmander.genero_stats();

        Entrenador entrenador = new Entrenador("Ariel Zerna Rodriguez", charmander);

        int tipo_aleatorio = random.nextInt(1,3);

        for (int i = 0; i < 10; i++) {

            String nombre_numerico = "nombre" + i;

            switch (tipo_aleatorio) {
                case 1: 
                Tipo_fuego pokemon_fuego = new Tipo_fuego(nombre_numerico);
                pokemon_fuego.genero_stats();
                Pokemones.add(pokemon_fuego);
                break;

                case 2:
                Tipo_agua pokemon_agua = new Tipo_agua(nombre_numerico);
                pokemon_agua.genero_stats();
                Pokemones.add(pokemon_agua);
                break;

                case 3: 
                Tipo_hierba pokemon_hierba = new Tipo_hierba(nombre_numerico);
                Pokemones.add(pokemon_hierba);
                break;

                default:
                    break;
            }

            Collections.shuffle(Pokemones);

            for (Pokemon pokemon: Pokemones) {
                entrenador.atrapar_pokemon(pokemon);
            }

            entrenador.muestro_datos();
            entrenador.muestro_pokemones();

        }

    }
}
