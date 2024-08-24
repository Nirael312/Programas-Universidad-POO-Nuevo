public class Persona {
    private String nombre;
    private String descripcion;
    
    public Persona(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void muestro() {
        System.out.println("nombre: " + nombre + ", desc: " + descripcion);
    }
    
}
