import java.util.Random;

public abstract class Pokemon {
    protected String nombre, tipo, debilidad;
    protected int vida, ataque, defensa, velocidad, salvajismo;

    public Pokemon(String nombre) {
        this.nombre = nombre;
        this.ataque = genero_stats();
        this.defensa = genero_stats();
        this.velocidad = genero_stats();
        this.salvajismo = genero_stats();
    }

    public int genero_stats() {

        Random val_random = new Random();
        int val = val_random.nextInt(0, 100);
        return val;
    }

    public void muestro_stats() {

        System.out.println(" ");
        System.out.println("  - - - A continuacion, los stats del pokemon " + nombre + " - - -  ");
        System.out.println(" ");

        System.out.println("Vida: " + vida + ", ataque: " + ataque + ", defensa: " + defensa);
        System.out.println("velocidad: " + velocidad + ", salvajismo: " + salvajismo);

        System.out.println(" ");
        System.out.println("  - - - fin de los stats del pokemon " + nombre + " - - -  ");
        System.out.println(" ");

    }

    public int atacar(Pokemon pokemon) {
        return pokemon.defensa - ataque;
    }

    public abstract void defensa(Pokemon pokemon_atacante, Pokemon pokemon_atacado);

}
