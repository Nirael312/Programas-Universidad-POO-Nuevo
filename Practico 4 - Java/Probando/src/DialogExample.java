import javax.swing.JOptionPane;

public class DialogExample {
    public static void main(String[] args) {
        // Mostrar un cuadro de diálogo con un mensaje
        JOptionPane.showMessageDialog(null, "¡Bienvenido a mi programa!");
        
        // Pedir al usuario que ingrese su nombre
        String name = JOptionPane.showInputDialog("¿Cómo te llamas?");
        
        // Mostrar un mensaje de confirmación
        JOptionPane.showMessageDialog(null, "Hola, " + name + "!");
    }
}