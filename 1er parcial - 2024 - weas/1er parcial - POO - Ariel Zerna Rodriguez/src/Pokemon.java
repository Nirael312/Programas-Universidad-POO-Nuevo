import java.util.Random;

public abstract class Pokemon {
    protected String nombre, tipo, debilidad;
    protected int vida, ataque, defensa, velocidad, salvajismo;

    public Pokemon(String nombre) {
        this.vida = 100;
        this.nombre = nombre;
        this.ataque = genero_stats();
        this.defensa = genero_stats();
        this.velocidad = genero_stats();
        this.salvajismo = genero_stats();
    }

    

    public int genero_stats() {

        Random val_random = new Random();
        int val = val_random.nextInt(1,100);
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
        int daño_inflijido = 0;

        if (ataque > pokemon.defensa) {
            daño_inflijido = ataque - pokemon.defensa;
        } 

        return daño_inflijido;
    }

    public void recibir_daño(int daño) {
        int daño_recibido = 0;

        if (daño > defensa) {
            daño_recibido = daño - defensa;
        }

        if (daño < vida) {
            vida -= daño_recibido;
        } else {
            vida = 0;
        }
        
    }

    public abstract void defensa (Pokemon pokemon_atacante, Pokemon pokemon_atacado);

    public int getSalvajismo() {
        return salvajismo;
    }

    public int getVida() {
        return vida;
    }

}