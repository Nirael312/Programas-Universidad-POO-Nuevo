public class Persona {
    
    private String nombre;
    private int edad;
    private boolean estudia;
    private boolean trabaja;
    private String ocupacion;

    public Persona(String nombre, int edad, boolean estudia, boolean trabaja) {
        this.nombre = nombre;
        this.edad = edad;
        this.estudia = estudia;
        this.trabaja = trabaja;
        if (trabaja) {
            this.ocupacion = "Trabaja/";
        }else {
                this.ocupacion = "No trabaja/";
            }

        if (estudia) {
            this.ocupacion = ocupacion + "Estudia";
        } else {
            this.ocupacion = ocupacion + "No estudia";
        }
    }

    public void muestro() {
        System.out.println("nombre: " + nombre + ", edad: " + edad + ", ocupacion: " + ocupacion);
    }

}
