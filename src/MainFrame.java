import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame(){


        this.setBounds(100, 100, 800, 600);
        //setSize(800, 600);
        this.setTitle("Antarctic Animal Tracking"); // title
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //this.setLayout(null);
        //setVisible(true);

        // JPanel
        Panel panel = new Panel();

        //this.setContentPane(panel);
        //panel.setLayout(new CardLayout(0,0));
        add(panel);
    }
}
