import java.util.Random;

public class Tipo_hierba extends Pokemon {
    
    public Tipo_hierba(String nombre) {
        super(nombre);
        this.tipo = "Hierva";
        this.debilidad = "Fuego";
    }

    public int atacar(Pokemon pokemon_atacado, Pokemon pokemon_atacante) {

        Random random = new Random();

        int daño_inflijido = super.atacar(pokemon_atacado);
        if (pokemon_atacado.debilidad == "Hierba") {
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

        if (pokemon_atacado.velocidad > 50) {
            if (random.nextDouble() < 0.50) {
                daño_recibido = 0;
            }
        } else {
            daño_recibido = pokemon_atacante.atacar(pokemon_atacado);
        }
        
        pokemon_atacado.recibir_daño(daño_recibido);
    }
    
}