import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame(){

        this.setBounds(100, 100, 700, 300);
        //setSize(800, 600);
        this.setTitle("Antarctic Animal Tracking"); // title
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // JPanel
        Panel panel = new Panel();

        add(panel);
    }
}
