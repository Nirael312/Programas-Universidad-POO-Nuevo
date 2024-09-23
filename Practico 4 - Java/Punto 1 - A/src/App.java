import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        // Mostrar cuadro de diálogo de confirmación
        int response = JOptionPane.showConfirmDialog(
            null, "¿Está seguro que quiere dar de baja al usuario?", 
            "Confirmación", JOptionPane.OK_CANCEL_OPTION
        );

        // Verificar la respuesta del usuario
        if (response == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(null, "El usuario ha sido dado de baja.");
        } else {
            JOptionPane.showMessageDialog(null, "Operación cancelada.");
        }
    }
}