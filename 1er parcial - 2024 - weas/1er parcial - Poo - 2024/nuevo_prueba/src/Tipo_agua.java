import java.util.Random;

public class Tipo_agua extends Pokemon {
    
    public Tipo_agua(String nombre) {
        super(nombre);
        this.tipo = "Agua";
        this.debilidad = "Hierva";
    }

    public void ataque(Pokemon pokemon_atacado, Pokemon pokemon_atacante) {

        int daño_inflijido = pokemon_atacante.atacar(pokemon_atacado);
        if (pokemon_atacado.debilidad == "Agua") {
                daño_inflijido += daño_inflijido*0.70;
        }
        pokemon_atacado.vida -= daño_inflijido;
    }

    @Override
    public void defensa(Pokemon pokemon_atacante, Pokemon pokemon_atacado) {
        
        Random random = new Random();

        int daño_recibido = pokemon_atacante.atacar(pokemon_atacado);

        if (random.nextDouble() < 0.30) {
            daño_recibido -= daño_recibido*0.50;
        }

        pokemon_atacado.vida -= daño_recibido;

    }
    
}
