import java.util.Random;

public class Tipo_hierba extends Pokemon {

    public Tipo_hierba(String nombre) {
        super(nombre);
        this.tipo = "Hierba";
        this.debilidad = "Fuego";
    }

    @Override
    public int atacar(Pokemon pokemon_atacado) {

        Random random = new Random();

        int daño_inflijido = super.atacar(pokemon_atacado);
        if (pokemon_atacado.debilidad == "Hierba") {
            if (random.nextDouble() < 0.70)
            daño_inflijido += daño_inflijido*0.50;
        }
        return daño_inflijido;
    }

    @Override
    public void defensa(Pokemon pokemon_atacante) {

        Random random = new Random();
        
        int daño_recibido = 0;

        if (velocidad <= 50) {
            daño_recibido = pokemon_atacante.atacar(this);
        } else {
            if (random.nextDouble() <= 0.50) {
                daño_recibido = 0;
            } else {
                daño_recibido = pokemon_atacante.atacar(this);
            }
        }

        this.recibir_daño(daño_recibido);
    }
    
}