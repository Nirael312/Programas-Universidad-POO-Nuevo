public class Oro extends Carta {

    public Oro(String nombre, String club, String pais) {
        super(nombre, club, pais);
        this.genero_stats_aleatorios(74, 91);
    }

    private void genero_stats_aleatorios(int val_min, int val_max) {
        
        this.velocidad = genero_aleatorios(val_min, val_max);
        this.tiro = genero_aleatorios(val_min, val_max);
        this.regate = genero_aleatorios(val_min, val_max);
        this.pase = genero_aleatorios(val_min, val_max);
        this.fisico = genero_aleatorios(val_min, val_max);
        this.defensa = genero_aleatorios(val_min, val_max);
    }

    @Override
    protected int genero_aleatorios(int val_min, int val_max) {
        int val = super.genero_aleatorios(val_min, val_max);
        val += 0.02;
        return val;
    }

    @Override
    public int calcular_quimica(String pais_favorito, String equipo_favorito) {

        int quimica = 0;

        if (pais_favorito == pais && equipo_favorito == club) {
            quimica = 100;
        } else {
            if (pais_favorito == pais || equipo_favorito == club) {
                quimica = 80;
            }
        }

        return quimica;
    }


}
