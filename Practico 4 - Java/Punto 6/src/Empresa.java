import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombre_empresa;
    private String direccion;
    private List<Persona> empleados;

    public Empresa(String nombre_empresa, String direccion) {
        this.nombre_empresa = nombre_empresa;
        this.direccion = direccion;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Persona empleado) {
        empleados.add(empleado);
    }

    public int numero_empleados() {
        int cantidad = 0;
        for (Persona empleado_aux: empleados) {
        cantidad++;
        }

        return cantidad;
    }

    public void muestroEmpleados() {
        int nro = 1;
        System.out.println(" ");
        System.out.println("Empresa: " + nombre_empresa);
        System.out.println("Direccion: " + direccion);
        System.out.println(" ");

        System.out.println("  -------- Empleados de la empresa --------");
        System.out.println(" ");
        for (Persona empleado_aux: empleados) {
            System.out.println("Empleado nro: " + nro);
            empleado_aux.muestro();
            System.out.println(" ");
            nro++;
        }

        System.out.println("  ------ Fin Empleados de la empresa ------");
        System.out.println(" ");
    }

}
