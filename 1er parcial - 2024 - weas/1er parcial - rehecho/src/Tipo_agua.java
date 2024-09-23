import java.util.Random;

public class Tipo_agua extends Pokemon {

    public Tipo_agua(String nombre) {
        super(nombre);
        this.tipo = "Agua";
        this.debilidad = "Hierba";
    }

    @Override
    public int atacar(Pokemon pokemon_atacado) {

        int daño_inflijido = super.atacar(pokemon_atacado);
        if (pokemon_atacado.debilidad == "Agua") {
            daño_inflijido += daño_inflijido*0.70;
        }
        return daño_inflijido;
    }

    @Override
    public void defensa(Pokemon pokemon_atacante) {

        Random random = new Random();

        int daño_recibido = pokemon_atacante.atacar(this);

        if (random.nextDouble() < 0.30) {
            daño_recibido -= daño_recibido*0.50;
        }

        this.recibir_daño(daño_recibido);
    }
    
}