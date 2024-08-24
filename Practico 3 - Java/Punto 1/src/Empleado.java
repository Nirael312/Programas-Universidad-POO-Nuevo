
public class Empleado extends Persona {
    
    private String puesto;
    private String horario;
    private String equipo;
    private int sueldo;

    public Empleado(String nombre, int dni, char sexo, String nacionalidad, String puesto, String horario, String equipo, int sueldo) {
        super(nombre, dni, sexo, nacionalidad);
        this.puesto = puesto;
        this.horario = horario;
        this.equipo = equipo;
        this.sueldo = sueldo;
    }

    public void muestroEmpleado() {
        super.muestro_info();
        System.out.println("Puesto: " + puesto + ", horario: " + horario + ", equipo: " + equipo);
        System.out.println("Sueldo: " + sueldo + " JPY");
        System.out.println("");
    }
}

