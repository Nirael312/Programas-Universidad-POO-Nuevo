public class App {
    
    public static void main(String[] args) {
        
        Empresa empresa = new Empresa("Nintendo JP", "Tokio, Akihabara, calle 494, 1622");
        
        Puesto puesto1 = new Puesto("Administrativo");
        Puesto puesto2 = new Puesto("Gerente");
        Puesto puesto3 = new Puesto("Tesorero");

        Persona empleado1 = new Persona("Ariel Zerna Rodriguez", 24, 'M', true, true, puesto1.getNombre_puesto());
        Persona empleado2 = new Persona("Kadir", 23, 'M', true, true, puesto1.getNombre_puesto());
        Persona empleado3 = new Persona("Dahi", 22, 'F', true, true, puesto1.getNombre_puesto());
        Persona empleado4 = new Persona("Sepulveda Matias Gabriel", 24, 'M', true, true, puesto2.getNombre_puesto());
        Persona empleado5 = new Persona("Carlos Lang", 55, 'M', true, true, puesto3.getNombre_puesto());

        empresa.agregarEmpleado(empleado1);
        empresa.agregarEmpleado(empleado2);
        empresa.agregarEmpleado(empleado3);
        empresa.agregarEmpleado(empleado4);
        empresa.agregarEmpleado(empleado5);

        empresa.muestroEmpleados();

    }
}
