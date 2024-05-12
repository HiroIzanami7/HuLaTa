package game.HuLaTa;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class HuLaTa extends JFrame {

    public static void main(String[] args) {
        
        
        
        SwingUtilities.invokeLater(() -> {
            Start start = new Start();
            start.setVisible(true); 
        });   
    }
}
