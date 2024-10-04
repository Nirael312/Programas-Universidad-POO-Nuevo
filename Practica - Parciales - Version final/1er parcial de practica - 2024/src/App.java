import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<String> habilidades = List.of("Ataque", "Pase", "Defensa");
        List<String> clubes = List.of("Arsenal", "Montevideo City Torque", "Inter Miami", "Manchester City");
        List<String> paises = List.of("Argentina", "Inglaterra", "Holanda", "Japón");

        Plantel jugador1 = new Plantel("Jofre", "Japon", "Arsenal");
        Plantel jugador2 = new Plantel("Bonifacio", "Argentina", "Inter Miami");
        
        ArrayList<Carta> mazo = new ArrayList<>();
        
        Random random = new Random();
        int val_random = 0;

        for (int i = 1; i < 23; i++) {

            val_random = random.nextInt(1,4);
            
            String paisAlteatorio = paises.get(random.nextInt(0,3));
            String clubAleatorio = clubes.get(random.nextInt(0,3));
            String habilidadAleatoria = habilidades.get(random.nextInt(0,2));


            switch (val_random) {

                case 1:
                    
                    Bronce bronce = new Bronce("Bronce" + i, clubAleatorio, paisAlteatorio, habilidadAleatoria);
                    mazo.add(bronce);
                    break;

                case 2:

                    Oro oro = new Oro("Oro " + i, clubAleatorio, paisAlteatorio);
                    mazo.add(oro);
                    break;

                case 3:

                    Especial especial = new Especial("Especial " + i, clubAleatorio, paisAlteatorio);

                    for (String habilidad_aux: habilidades) {
                        habilidad_aux = habilidades.get(random.nextInt(0,3));
                        especial.agregar_habilidad(habilidad_aux);
                    }

                    mazo.add(especial);
                    break;

                default:

                    break;

                }
        }

        Collections.shuffle(mazo);

        boolean turno = true;

        for (Carta carta_aux: mazo) {
            if (turno == true) {
                jugador1.agregar_carta(carta_aux);
            } else {
                jugador2.agregar_carta(carta_aux);
            }

            turno = !turno;
        }

        System.out.println("--------------------------------------------------------------------");
        jugador1.muestro_info_usuario();
        System.out.println("------------------------------------");
        jugador2.muestro_info_usuario();
        System.out.println("--------------------------------------------------------------------");

    }
}
