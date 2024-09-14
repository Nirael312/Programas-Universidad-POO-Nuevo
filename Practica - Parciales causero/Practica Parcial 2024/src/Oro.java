import java.util.Random;

public class Oro extends Carta {

    public Oro(String nombre, String equipo, String pais) {
        super(nombre, equipo, pais);
    }

    public int genero_valores() {
        Random mi_Random = new Random();
        int val = super.genero_valores(74, 90, mi_Random);
        return (int) (val + (val*0.05));
    }
    public void genero_stats() {
        this.defensa = genero_valores();
        this.fisico = genero_valores();
        this.pase = genero_valores();
        this.regate = genero_valores();
        this.tiro = genero_valores();
        this.velocidad = genero_valores();
    }

    public int devuelvo_quimica(String pais_favorito, String equipo_favorito) {
        int quimica = 0;

        if (pais == pais_favorito && equipo == equipo_favorito) {
            quimica = 100;
        } else {if (pais == pais_favorito || equipo == equipo_favorito) {
            quimica = 80;
        }

        }
        return quimica;
    }


}