import java.util.ArrayList;
import java.util.List;

public class Familia {
    private List<Persona> familia;

    public Familia() {
        this.familia = new ArrayList<>();
    }

    public void agregoMiembros(Persona persona) {
        familia.add(persona);
    }

    public void muestro_familia() {
        int nro = 1;
        for (Persona persona_aux: familia) {
            System.out.println("Persona nro" + nro + "de la familia");
            persona_aux.muestro();
            nro += 1;
        }
    }

}
