import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class App {
    
    public static void main(String[] args) {
        
        List<String> habilidades = List.of("Ataque", "Pase", "Defensa");
        List<String> clubes = List.of("Arsenal", "Montevideo City Torque", "Inter Miami", "Manchester City");
        List<String> paises = List.of("Argentina", "Inglaterra", "Holanda", "Japón");

        Jugador jugador1 = new Jugador("Jofre", "Japon", "Arsenal");
        Jugador jugador2 = new Jugador("Bonifacio", "Argentina", "Inter Miami");
        
        ArrayList<Carta> mazo = new ArrayList<>();

        Random rnd = new Random();
        int canti = 0;
        for (int i = 0; i < 22; i++) {
            

            Integer claseAleatoria = rnd.nextInt(0,2);
            String nombreIncremental = "nombre" + i;
            String paisAlteatorio = paises.get(rnd.nextInt(0,3));
            String clubAleatorio = clubes.get(rnd.nextInt(0,3));
            String habilidadAleatoria = habilidades.get(rnd.nextInt(0,2));

            // Especial carta1;
            // Oro carta2;
            // Bronce_especial carta3;


            switch (claseAleatoria) {
                case 0:
                    Especial carta1 = new Especial(nombreIncremental, clubAleatorio, paisAlteatorio);
                    carta1.agregarHabilidad(habilidadAleatoria);
                    habilidadAleatoria= habilidades.get(rnd.nextInt(0,3));
                    carta1.agregarHabilidad(habilidadAleatoria); //Agrego 2 habilidades
                    carta1.genero_stats();
                    mazo.add(carta1);
                    canti ++;
                    break;
                case 1:
                    Oro carta2 = new Oro(nombreIncremental, clubAleatorio, paisAlteatorio);
                    carta2.genero_stats();
                    mazo.add(carta2);
                    canti++;
                    break;
                case 2:
                    Bronce_especial carta3 = new Bronce_especial(nombreIncremental, clubAleatorio, paisAlteatorio, habilidadAleatoria);
                    carta3.genero_stats();
                    mazo.add(carta3);
                    canti++;
                    break;
                default:
                    break;
            }
        }

                Collections.shuffle(mazo);

                System.out.println("canti: " + canti);

                boolean turno = true; // Inicializar con true para empezar con jugador1
                int cont1 = 0;
                int cont2 = 0;
                for (Carta carta : mazo) {
                    if (turno) {
                        jugador1.agregarCarta(carta);
                        cont1++;
                    } else {
                        jugador2.agregarCarta(carta);
                        cont2++;
                    }
                    turno = !turno; // Alternar el valor de turno
                }

                System.out.println("jugador 1 tiene: " + cont1 + "cartas");

                jugador1.muestro_cartas();

                System.out.println(" ");
                
                System.out.println("jugador 2 tiene: " + cont2 + "cartas");

                jugador2.muestro_cartas();

                System.out.println(" ");

    }
}
