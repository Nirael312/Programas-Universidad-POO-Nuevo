public class Mago extends Personaje {
    private int inteligencia;
    
    public Mago(int nivelAtaque, int nivelDefensa, int inteligencia) {
        this.vida = 100;
        this.nivelAtaque = nivelAtaque;
        this.nivelDefensa = nivelDefensa;
        this.inteligencia = inteligencia;
    }

    public int atacar(Personaje personaje) {
        int val = super.atacar(personaje);
        return val * inteligencia;
    }

    public int defender(Personaje personaje) {
        return 
    }
}
