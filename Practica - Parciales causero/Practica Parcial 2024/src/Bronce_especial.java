
import java.util.Random;

public class Bronce_especial extends Carta {
    private String habilidad_especial;

    public Bronce_especial(String nombre, String equipo, String pais, String habilidad_especial) {
        super(nombre, equipo, pais);
        this.habilidad_especial = habilidad_especial;
    }

    public void imprimo_carta() {
        super.imprimo_carta();
        System.out.println("Habilidad especial: " + habilidad_especial);
    }

    public void genero_stats() { // version obsoleta, la dejo para que quede constancia de la diferencia con la version nueva(en los demas se ve)

        Random mi_Random = new Random();

        this.defensa = genero_valores(49, 65, mi_Random)+2;
        this.fisico = genero_valores(49, 65, mi_Random)+2;
        this.pase = genero_valores(49, 65, mi_Random)+2;
        this.regate = genero_valores(49, 65, mi_Random)+2;
        this.tiro = genero_valores(49, 65, mi_Random)+2;
        this.velocidad = genero_valores(49, 65, mi_Random)+2;
        
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
