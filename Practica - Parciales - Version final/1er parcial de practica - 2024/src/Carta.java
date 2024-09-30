import java.util.Random;

public abstract class Carta {
    protected String nombre, club, pais;
    protected int velocidad, tiro, regate, defensa, pase, fisico;

    public Carta(String nombre, String club, String pais) {
        this.nombre = nombre;
        this.club = club;
        this.pais = pais;
    }

    protected int genero_aleatorios(int val_min, int val_max) {
        Random random = new Random();

        int val = random.nextInt(val_min, val_max);
        return val;

    }

    public void muestro_carta() {

        System.out.println("           -----------  Datos de la carta  --------------");
        System.out.println("Nombre: " + nombre + ", velocidad: " + velocidad + ", tiro: " + tiro);
        System.out.println("Defensa: " + defensa + ", regate: " + regate + ", pase: " + pase + ", fisico:" + fisico);
    }

    public abstract int calcular_quimica(String pais_favorito, String equipo_favorito);


}