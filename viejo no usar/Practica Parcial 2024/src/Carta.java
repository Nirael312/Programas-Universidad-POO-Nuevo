

import java.util.Random;

public abstract class Carta {

    protected String nombre, pais, equipo;
    protected int velocidad, tiro, regate, defensa, pase, fisico;

    public Carta(String nombre, String equipo, String pais) {
        this.nombre = nombre;
        this.equipo = equipo; // esta wea es equipo, no joda
        this.pais = pais;
    }

    public int genero_valores(int inferior, int superior, Random val_Random) {

        //int val = inferior + val_Random.nextInt(superior);
        int val = val_Random.nextInt(superior - inferior + 1) + inferior;

        return val;
    }

    public void imprimo_carta() {
        System.out.println(" --  Informacion de la carta  --");
        System.out.println("Nombre: " + nombre + ",  Equipo: " + equipo);
        System.out.println("Pais: " + pais + ", Fisico: " + fisico);
        System.out.println("Tiro: " + tiro + ",  Regate: " + regate);
        System.out.println("Velocidad: " + velocidad + ",  Pase: " + pase);
    }

    public abstract int devuelvo_quimica(String pais_favorito, String equipo_favorito);
}