import java.util.Random;

public class Tipo_hierva extends Pokemon {

    public Tipo_hierva(String nombre) {
        super(nombre);
        this.tipo = "Hierva";
        this.debilidad = "Fuego";
    }

    public int atacar(Pokemon pokemon) {
        Random random = new Random();

        int daño_inflijido = super.atacar(pokemon);
        if (pokemon.debilidad == "Hierva") {
            if (random.nextDouble() < 0.70) {
                daño_inflijido += daño_inflijido*0.50;
            } 
        }

        return daño_inflijido;
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
                daño_recibido = pokemon_atacante.atacar(pokemon_atacado);
        }

        pokemon_atacado.vida -= daño_recibido;
        
    }

}