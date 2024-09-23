import javax.swing.JOptionPane;

public class App {
    
    public static void main(String[] args) {
        
        String nombre = JOptionPane.showInputDialog("Buenas, ingrese su nombre pls no como hace 2 dias: ");

        if (nombre != null && !nombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Buenas " + nombre + ", un gusto!");

            int respuesta = JOptionPane.showConfirmDialog(null, "Entonces " + nombre + ", juegas Arknights?");

            if (respuesta == JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(null, "Pasa id pa agregaste jsjs, Dobermann/Skadi bestos monas");
            } else { 
                if (respuesta != JOptionPane.OK_CANCEL_OPTION) { // esta wea es para que lo mande si le diste a no
                    JOptionPane.showMessageDialog(null, "F, dale una hojeada si puedes jsjs, esta bueno, al principio parece mrd pq es tower defense");
                } else {
                    JOptionPane.showMessageDialog(null, "Que malparido te vas nomas jsjs, ojala tu peso se devalue");
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "No se ingreso un nombre, bye desconocido (te voy a  matar)");
        }

    }

}