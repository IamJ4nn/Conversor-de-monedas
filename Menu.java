import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Menu extends JFrame {
    public static void main(String[] args) {
        // MainFrame myWindow = new MainFrame();
        // myWindow.initialize();
        String texto = JOptionPane.showInputDialog("Seleccione una opción de conversión");
        JOptionPane.showMessageDialog(null, "Hola " + texto);

    }
}
