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

    public int cantidad_personas() {
        int nro = 0;

        for (Persona persona_aux: familia) {
            nro ++;
        }

        return nro;
    }

    public int edad_total() {
        int edad = 0;

        for (Persona persona_aux: familia) {
            edad += persona_aux.getEdad();
        }

        return edad;
    }

    public int canti_trabajando() {
        int canti = 0;

        for (Persona persona_aux: familia) {
            if (persona_aux.getTrabaja()) {
                canti ++;
            }
        }

        return canti;
    }

}
