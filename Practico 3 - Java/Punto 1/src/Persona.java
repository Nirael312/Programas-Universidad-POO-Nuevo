public class Persona {
    protected String nombre;
    protected int dni;
    protected char sexo;
    protected String nacionalidad;

    public Persona(String nombre, int dni, char sexo, String nacionalidad) {
        this.nombre = nombre;
        this.dni = dni;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
    }

    public void muestro_info() {
        System.out.print("Nombre: " + nombre + ", sexo: " + sexo + ", nacionalidad: " + nacionalidad);
        System.out.println(", Dni: " + dni);
    }

}
