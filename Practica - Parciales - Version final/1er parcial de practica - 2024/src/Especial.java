import java.util.ArrayList;

public class Especial extends Carta {

    private ArrayList<String> habilidades_especiales;

    public Especial (String nombre, String club, String pais) {
        super(nombre, club, pais);
        this.genero_stats_aleatorios(89, 99);
        this.habilidades_especiales = new ArrayList<>();
    }

    public void agregar_habilidad(String habilidad) {
        habilidades_especiales.add(habilidad);
    }

    public void muestro_carta() {

        super.muestro_carta();
        System.out.println("Habilidades especiales: ");

        int i = 0;

        for (String habilidad_aux: habilidades_especiales) {
            i++;
            System.out.println("Habilidad nro" + i + ": " + habilidad_aux);
        }
    }

    @Override
    protected  int genero_aleatorios(int val_min, int val_max) {
        int val = super.genero_aleatorios(val_min, val_max);
        
        int val_aumentado = val;
        val_aumentado += 0.02;

        if (val_aumentado <= 99) {
            val = val_aumentado;
        }

        return val;
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
    public int calcular_quimica(String pais_favorito, String equipo_favorito) {

        int quimica = 100;
        return quimica;
    }


}
