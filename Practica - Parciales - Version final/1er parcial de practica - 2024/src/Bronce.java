public class Bronce extends Carta {

    private String habilidad_especial;

    public Bronce(String nombre, String club, String pais, String habilidad_especial) {
        super(nombre, club, pais);
        this.genero_stats_aleatorios(45, 66);
        this.habilidad_especial = habilidad_especial;
    }

    public void muestro_carta() {

        super.muestro_carta();
        System.out.println("Habilidad especial: "+ habilidad_especial);
    }

    private void genero_stats_aleatorios(int val_min, int val_max) {

        this.velocidad = genero_aleatorios(val_min, val_max) + 2;
        this.tiro = genero_aleatorios(val_min, val_max) + 2;
        this.regate = genero_aleatorios(val_min, val_max) + 2; 
        this.pase = genero_aleatorios(val_min, val_max) + 2;
        this.fisico = genero_aleatorios(val_min, val_max) + 2;
        this.defensa = genero_aleatorios(val_min, val_max) + 2;
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
