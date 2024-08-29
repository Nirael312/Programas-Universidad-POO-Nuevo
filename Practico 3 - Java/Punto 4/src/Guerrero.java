public class Guerrero extends Personaje {
    private int fuerza;

    public Guerrero(int nivelAtaque, int nivelDefensa, int fuerza) {
        this.vida = 200;
        this.nivelAtaque = nivelAtaque;
        this.nivelDefensa = nivelDefensa;
        this.fuerza = fuerza;
    }

    public int atacar(Personaje personaje) {
        int val = super.atacar(personaje);
        return val * fuerza;
    }

    public int defender(Personaje personaje) {
        return atacar(personaje) / 2;
    }
}
