import java.util.ArrayList;
import java.util.Random;

public class App {
    
    public static void main(String[] args) {

        ArrayList<Pokemon> Pokemones = new ArrayList<>();
        Random random = new Random();

        Cosa cosa = new Cosa(10);

        if (cosa.getCosa() == 10) {
            System.out.println("cosa");
        }

        Tipo_fuego charmander = new Tipo_fuego("Charmander");

        Entrenador entrenador = new Entrenador("Ariel Zerna Rodriguez", charmander);
        entrenador.agregar_pokemon(charmander);

        for (int i = 0; i < 10; i++) {

            int tipo_aleatorio = random.nextInt(1,4);

            switch (tipo_aleatorio) {
                case 1: 
                Tipo_fuego pokemon_fuego = new Tipo_fuego("Tipo fuego " + i);
                Pokemones.add(pokemon_fuego);
                break;

                case 2:
                Tipo_agua pokemon_agua = new Tipo_agua("Tipo agua" + i);
                Pokemones.add(pokemon_agua);
                break;

                case 3: 
                Tipo_hierba pokemon_hierba = new Tipo_hierba("Tipo hierba" + i);
                Pokemones.add(pokemon_hierba);
                break;

                default:
                    break;
            }

            System.out.println("------------------------- Fase de peleas -------------------------");

            for (Pokemon pokemon: Pokemones) {
                entrenador.atrapar_pokemon(pokemon);
            }

            entrenador.muestro_entrenador();
            

        }
    
    }
}