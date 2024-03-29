import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame{
    final int windowWidth = 1024;
    final int windowHeight = 768;
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public GameWindow(GameArea gameArea) {
        super();
        setSize(windowWidth, windowHeight);
        setLocation((screenSize.width- windowWidth)/2, (screenSize.height- windowHeight)/2);
        setUndecorated(true);
        setLayout(null); // bez tego setBounds dla GameArea sie nie ustawi
        Menu menu = new Menu();
        add(menu);
        add(gameArea);
        setVisible(true);
    }
}
