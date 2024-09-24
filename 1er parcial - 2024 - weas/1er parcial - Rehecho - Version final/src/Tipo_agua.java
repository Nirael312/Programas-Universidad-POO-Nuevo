
public class Tipo_agua extends Pokemon {

    public Tipo_agua(String nombre) {
        super(nombre);
        this.tipo = "Agua";
        this.debilidad = "hierba";
    }

    public void defensa(int daño_recibido) {
        this.recibir_daño(daño_recibido);
    }
}
