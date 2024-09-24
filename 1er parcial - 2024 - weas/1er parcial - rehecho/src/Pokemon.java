
import java.util.Random;

public abstract class Pokemon {
    protected String nombre, debilidad, tipo;
    protected int vida, ataque, defensa, velocidad, salvajismo;

    public Pokemon(String nombre) {
        this.vida = 100;
        this.nombre = nombre;
        this.ataque = genero_stats();
        this.defensa = genero_stats();
        this.velocidad = genero_stats();
        this.salvajismo = genero_stats();
    }

    private int genero_stats() {
        Random random = new Random();

        int val = random.nextInt(1,101);
        return val;

    }

    public void muestro_stats() {

        System.out.println(" ");
        System.out.println("  - - - A continuacion, los stats del pokemon " + nombre + " - - -  ");
        System.out.println(" ");

        System.out.println("Vida: " + vida + ", ataque: " + ataque + ", defensa: " + defensa);
        System.out.println("velocidad: " + velocidad + ", salvajismo: " + salvajismo);
        
    }

    public int atacar(Pokemon pokemon) {

        int daño_inflijido = 0;

        if (ataque > pokemon.defensa) {
        daño_inflijido = ataque - pokemon.defensa;
        }

        return daño_inflijido;
    }

    public void recibir_daño(int daño) {

        if (daño < vida) {
            vida -=  daño;
        } else {
            vida = 0;
        }

    }

    public abstract void defensa(Pokemon pokemon_atacante);

    public int getVida() {
        return vida;
    }

    public int getSalvajismo() {
        return salvajismo;
    }

    public void setSalvajismo(int salvajismo) {
        this.salvajismo = salvajismo;
    }

}
