import java.util.ArrayList;
import java.util.List;

public class Especial extends Carta {
    private List<String> habilidades_especiales;

    public Especial(String nombre, String equipo, String pais) {
        super(nombre, equipo, pais);
        this.habilidades_especiales = habilidades_especiales;
        this.habilidades_especiales = new ArrayList<>();
    }

    public void agregarHabilidad(String habilidad_nueva) {
        habilidades_especiales.add(habilidad_nueva);
    }

    public void imprimo_carta() {
        super.imprimo_carta();
        int val = 0;

        System.out.println(" -- Las habilidades de la carta son -- ");

        for (String habilidad: habilidades_especiales) {
            System.out.println("Habilidad especial nro " + val + ": " + habilidad);
            val++;
        }
    }

    public void genero_stats() {

    }

}
