public class Persona {
    
    private String nombre;
    private int edad;
    private char sexo;
    private boolean estudia;
    private boolean trabaja;
    private String ocupacion;
    private String puesto;

    public Persona(String nombre, int edad, char sexo, boolean estudia, boolean trabaja, String puesto) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
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

        this.puesto = puesto;
    }

    public void muestro() {
        System.out.println("nombre: " + nombre + ", edad: " + edad + ", sexo: " + sexo + ", ocupacion: " + ocupacion + ", puesto: " + puesto);
    }

}
