import java.util.ArrayList;

public class Plantel {
    private String usuario, pais_favorito, equipo_favorito;
    private ArrayList<Carta> mazo;

    public Plantel(String usuario, String pais_favorito, String equipo_favorito) {
        this.usuario = usuario;
        this.pais_favorito = pais_favorito;
        this.equipo_favorito = equipo_favorito;
        this.mazo = new ArrayList<>();
    }

    public void agregar_carta(Carta carta) {
        mazo.add(carta);
    }

    public void muestro_info_usuario() {

        System.out.println("Las cartas que posee el jugador " + usuario + " son: " );
        int i = 0;
        int quimica_total = 0;

        for (Carta carta_aux: mazo) {
            i++;
            System.out.println("Carta nro " + i + ": ");
            carta_aux.muestro_carta();
            quimica_total += carta_aux.calcular_quimica(pais_favorito, equipo_favorito);

        }

        System.out.println("    ----------------------------------- ");

        System.out.println("Todo el equipo del jugador, posee una quimica total de: " + quimica_total);
    }

}
