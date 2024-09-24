import java.util.Random;

public class Tipo_hierba extends Pokemon {

    public Tipo_hierba(String nombre) {
        super(nombre);
        this.tipo = "Hierba";
        this.debilidad = "Fuego";
    }

    public void defensa(int daño_recibido) {

        Random random = new Random();

        if (velocidad > 50) {
            if (random.nextDouble() <= 0.50) {
                daño_recibido = 0;
            }
        }

        this.recibir_daño(daño_recibido);
    }
}
