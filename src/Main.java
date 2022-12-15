import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // how to launch MainFrame from main
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    MainFrame frame = new MainFrame();
                    frame.setVisible(true);
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

    }
}