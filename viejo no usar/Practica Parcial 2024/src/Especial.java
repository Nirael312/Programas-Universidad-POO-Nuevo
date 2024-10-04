import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Especial extends Carta {
    private List<String> habilidades_especiales;

    public Especial(String nombre, String equipo, String pais) {
        super(nombre, equipo, pais);
        this.habilidades_especiales = new ArrayList<>();
    }

    public void agregarHabilidad(String habilidad_nueva) {
        habilidades_especiales.add(habilidad_nueva);
    }

    public void imprimo_carta() {
        super.imprimo_carta();
        int val = 0;
        System.out.println(" ");
        System.out.println(" -- Las habilidades de la carta son -- ");
        System.out.println(" ");

        for (String habilidad: habilidades_especiales) {
            val++;
            System.out.println("Habilidad especial nro " + val + ": " + habilidad);
            
        }
        System.out.println(" ");
        
    }

    public int genero_valores() {
        Random mi_Random = new Random();
        int val = super.genero_valores(89, 99, mi_Random);
        int val_acumulado = (int) (val * 0.02) * val;
        if (val_acumulado <= 99) {
            return val_acumulado;
        } else {
            return val;
        }
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
        int quimica = 100;
        return quimica;
    }

}

