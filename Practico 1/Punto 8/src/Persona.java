public class Persona {
    
    private String nombre;
    private int edad;
    private boolean estudia;
    private boolean trabaja;

    public Persona(String nombre, int edad, boolean estudia, boolean trabaja) {
        this.nombre = nombre;
        this.edad = edad;
        this.estudia = estudia;
        this.trabaja = trabaja;
    }

    public void muestro() {
        System.out.println("nombre: " + nombre + ", edad: " + edad);
    }

}
