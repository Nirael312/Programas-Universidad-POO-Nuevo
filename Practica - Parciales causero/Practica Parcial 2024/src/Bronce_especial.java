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

    public void genero_stats() {
        
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
