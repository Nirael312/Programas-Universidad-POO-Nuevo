import java.util.Random;

public class Tipo_fuego extends Pokemon {

    public Tipo_fuego(String nombre) {
        super(nombre);
        this.tipo = "Fuego";
        this.debilidad = "Agua";
    }

    public void ataque(Pokemon pokemon_atacado, Pokemon pokemon_atacante) {

        int daño_inflijido = pokemon_atacante.atacar(pokemon_atacado);
        if (pokemon_atacado.debilidad == "Fuego") {
                daño_inflijido += daño_inflijido*0.70;
        }
        pokemon_atacado.vida -= daño_inflijido;
    }

    @Override
    public void defensa(Pokemon pokemon_atacante, Pokemon pokemon_atacado) 

        int daño_recibido = pokemon_atacante.atacar(pokemon_atacado);

    }
