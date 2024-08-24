public class App {
    
    public static void main(String[] args) {
        
        Empresa empresa = new Empresa("Nintendo JP", "Tokio, Akihabara, calle 494, 1622");

        Persona empleado1 = new Persona("Ariel Zerna Rodriguez", 24, 'M', true, true);
        Persona empleado2 = new Persona("Kadir", 23, 'M', true, true);
        Persona empleado3 = new Persona("Dahi", 22, 'F', true, true);
        Persona empleado4 = new Persona("Sepulveda Matias Gabriel", 24, 'M', true, true);
        Persona empleado5 = new Persona("Carlos Lang", 55, 'M', true, true);

        empresa.agregarEmpleado(empleado1);
        empresa.agregarEmpleado(empleado2);
        empresa.agregarEmpleado(empleado3);
        empresa.agregarEmpleado(empleado4);
        empresa.agregarEmpleado(empleado5);

        empresa.muestroEmpleados();

    }
}
