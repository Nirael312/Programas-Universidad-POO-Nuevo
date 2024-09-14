public class Carta {

    protected String nombre;
    protected String equipo;
    protected String pais;
    protected int velocidad;
    protected int tiro;
    protected int regate;
    protected int defensa;
    protected int pase;
    protected String fisico;

    public Carta(String nombre, String equipo, String pais) {
        this.nombre = nombre;
        this.equipo = equipo; // esta wea es equipo, no joda
        this.pais = pais;
    }

    public void imprimo_carta() {
        System.out.println(" --  Informacion de la carta  --");
        System.out.println("Nombre: " + nombre + ",  Equipo: " + equipo);
        System.out.println("Pais: " + pais + ", Fisico: " + fisico);
        System.out.println("Tiro: " + tiro + ",  Regate: " + regate);
        System.out.println("Velocidad: " + velocidad + ",  Pase: " + pase);
    }

}