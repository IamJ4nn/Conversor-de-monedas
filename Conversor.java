import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class Conversor extends JFrame {
    public static void main(String[] args) {
        // Se cambia la configuración estética de los paneles
        UIManager.put("OptionPane.background", new ColorUIResource(36, 36, 36));
        UIManager.put("Panel.background", new ColorUIResource(36, 36, 36));
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(250, 250, 250));
        UIManager.put("OptionPane.font", new Font("Cantarell", Font.PLAIN, 18));
        // UIManager.put("OptionPane.messageFont", new Font("Cantarell", Font.PLAIN, 14));
        UIManager.put("OptionPane.buttonFont", new Font("Cantarell", Font.BOLD, 14));

        String texto = JOptionPane.showInputDialog("Seleccione una opción de conversión");
        JOptionPane.showMessageDialog(null, "Hola " + texto);

    }
}
