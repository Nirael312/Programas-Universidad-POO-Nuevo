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

    public void muestro_informe() {
        int val = 0;
        int edad_final = 0;
        double promedio;
        int personas_trabajando = 0;
        int cant_familias = 0;

        for (Familia fam_aux: comuna) {
        val = val + fam_aux.cantidad_personas();
        edad_final += fam_aux.edad_total();
        personas_trabajando += fam_aux.canti_trabajando();
        cant_familias ++;
        }
        System.out.println(" --------  INFORME  -------- ");

        System.out.println("La cantidad de familias censadas fue de: " + cant_familias);
        System.out.println("La cantidad de personas censadas fue de: " + val);
        System.out.println("La cantidad de personas que trabajan es de: " + personas_trabajando);
        promedio = edad_final/val;
        System.out.println("El promedio de edad es de: " + promedio);

        System.out.println(" ------  FIN INFORME  ------ ");
        System.out.println(" ");
    }

}