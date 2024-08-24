import java.util.ArrayList;
import java.util.List;

public class Comuna {
    private List<Familia> comuna;

    public Comuna() {
        this.comuna = new ArrayList<>();
    }

    public void agregoFamilia(Familia familia) {
        comuna.add(familia);
    }

    public void muestro_comuna() {
        int cont = 1;

        System.out.println("");
        for (Familia fam_aux: comuna) {
            System.out.println(" -------- Familia nro " + cont + " -------- ");
            fam_aux.muestro_familia();
            System.out.println("");
            cont += 1;
        }
    }

}