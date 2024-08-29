public abstract class Personaje {
    protected int vida;
    protected int nivelAtaque;
    protected int nivelDefensa;

    public int atacar(Personaje personaje) {
        return personaje.nivelDefensa - nivelAtaque;
    }

    public abstract int defender(Personaje personaje);
}