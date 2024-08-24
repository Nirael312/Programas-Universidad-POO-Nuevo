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
        System.out.println("");
        
        for (Persona persona_aux: familia) {
            System.out.println("Persona nro " + nro);
            persona_aux.muestro();
            System.out.println(" ");
            nro += 1;
        }
    }

}
