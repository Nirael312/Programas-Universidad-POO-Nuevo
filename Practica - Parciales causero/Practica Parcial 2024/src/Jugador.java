import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombre_jugador;
    private String pais_favorito;
    private String equipo_favorito;
    private List<Carta> plantel_cartas;

    public Jugador(String nombre_jugador, String pais_favorito, String equipo_favorito) {
        this.nombre_jugador = nombre_jugador;
        this.pais_favorito = pais_favorito;
        this.equipo_favorito = equipo_favorito;
        this.plantel_cartas = new ArrayList<>();
    }

    public void agregarCarta(Carta carta) {
        plantel_cartas.add(carta);
    }

    public void muestro_cartas() {

        System.out.println(" ");
        System.out.println("  - - -  Cartas del jugador: " + nombre_jugador + "  - - -  ");
        System.out.println();
        
        for (Carta carta: plantel_cartas) {
            carta.imprimo_carta();
        }
    }

    

}