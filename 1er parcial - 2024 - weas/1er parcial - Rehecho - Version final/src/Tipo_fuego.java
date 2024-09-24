import java.util.Random;

public class Tipo_fuego extends Pokemon {

    public Tipo_fuego(String nombre) {
        super(nombre);
        this.tipo = "Fuego";
        this.debilidad = "Agua";
    }

    @Override
    public void ataque(Pokemon pokemon_atacado) {

        int daño_inflijido = ataque - pokemon_atacado.getDefensa();
        Random random = new Random();

        if (tipo == pokemon_atacado.getDebilidad()) {
            daño_inflijido = (int) (+ daño_inflijido*0.7);
        }

        this.defensa(daño_inflijido);
    }

    public void defensa(int daño_recibido) {

        Random random = new Random();

        if (random.nextDouble() <= 0.30) {
            daño_recibido = (int) (-daño_recibido*0.5);
        }

        this.recibir_daño(daño_recibido);
    }
}
