package guiComponents;

import javax.swing.*;

public class frameClass extends JFrame {
    frameClass(){
        panelClass panel = new panelClass();
        panel.setSize(900,700);

        this.add(panel);

        this.setTitle("pingPong Game");
        this.setBounds(250, 20 , 900, 700);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
