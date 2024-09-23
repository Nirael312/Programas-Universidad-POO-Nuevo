
import java.util.Random;

public class Tipo_agua2 extends Pokemon {

    public Tipo_agua2(String nombre) {
        super(nombre);
        this.tipo = "Agua";
        this.debilidad = "Hierva";
    }

    public void ataque(Pokemon pokemon_atacado, Pokemon pokemon_atacante) {

        int daño_inflijido = pokemon_atacante.ataque(pokemon_atacado);
        if (pokemon_atacado.debilidad == "Hierva") {
                daño_inflijido += daño_inflijido*0.70;
        }
        pokemon_atacado.vida -= daño_inflijido;
    }

    @Override
    public void defensa(Pokemon pokemon_atacante, Pokemon pokemon_atacado) {
        Random random = new Random();

        int daño_recibido = 0;

        if (pokemon_atacado.velocidad >= 50) {
            if (random.nextDouble() < 0.50) {
                daño_recibido = 0;
            } 
        } else {
                daño_recibido = pokemon_atacante.ataque(pokemon_atacado);
        }

        pokemon_atacado.vida -= daño_recibido;
        
    }

}