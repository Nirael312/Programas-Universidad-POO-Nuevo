import java.util.Random;

public abstract class Pokemon {
    protected String nombre, tipo, debilidad;
    protected int vida, ataque, defensa, velocidad, salvajismo;
    
    public Pokemon(String nombre) {
        this.nombre = nombre;
        this.vida = 100;
        this.ataque = stat_aleatorio();
        this.defensa = stat_aleatorio();
        this.velocidad = stat_aleatorio();
        this.salvajismo = stat_aleatorio();

    }

    private int stat_aleatorio() {
        Random random = new Random();
        int val = random.nextInt(1,101);
        return val;
    }

    public void recibir_daño(int daño_recibido) {
        if (daño_recibido > vida) {
            vida = 0;
        } else {
            vida -= daño_recibido;
        }
    }

    public void muestro_pokemon() {
        
        System.out.println("---------------------------------------");
        System.out.println("Los stats de " + nombre + " son: ");
        System.out.println("---------------------------------------");

        System.out.println("Vida: " + vida + ", ataque: " + ataque + ", defensa: " + defensa);
        System.out.println("Velocidad: " + velocidad + ", salvajismo: " + salvajismo);
        
    }

    public void ataque(Pokemon pokemon_atacado) {

        int daño_inflijido = ataque - pokemon_atacado.getDefensa();
        Random random = new Random();

        if (tipo == pokemon_atacado.getDebilidad()) {
            
            if (random.nextDouble() < 0.70) {
                daño_inflijido = (int) (+ daño_inflijido*0.5);
            }    
        }

        this.defensa(daño_inflijido);
    }

    public abstract void defensa (int daño_recibido);

    public int getDefensa() {
        return defensa;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public int getVida() {
        return vida;
    }

    public int getSalvajismo() {
        return salvajismo;
    }

}