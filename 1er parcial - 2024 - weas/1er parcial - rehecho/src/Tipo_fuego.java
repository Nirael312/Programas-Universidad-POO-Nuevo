import java.util.Random;

public class Tipo_fuego extends Pokemon {

    public Tipo_fuego(String nombre) {
        super(nombre);
        this.tipo = "Fuego";
        this.debilidad = "Agua";
    }

    @Override
    public int atacar(Pokemon pokemon_atacado) {

        Random random = new Random();

            
        int daño_inflijido = super.atacar(pokemon_atacado);
        if (pokemon_atacado.debilidad == "Fuego") {

            if (random.nextDouble() < 0.70) {
                daño_inflijido += daño_inflijido*0.50;
            }
        }
        return daño_inflijido;
    }

    @Override
    public void defensa(Pokemon pokemon_atacante) {

        int daño_recibido = pokemon_atacante.atacar(this);

        this.recibir_daño(daño_recibido);

    }
    
}
