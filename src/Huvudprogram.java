import javax.swing.*;
import java.awt.*;

public class Huvudprogram extends JFrame {

    JPanel huvudpanel = new JPanel();

    JPanel buttonPanel = new JPanel();
    JButton startNewGameButton = new JButton("Starta nytt spel");
    JButton testVictoryButton = new JButton("Testa vinst");

    JPanel gamePanel = new JPanel();
    JButton b1 = new JButton("B1");
    JButton b2 = new JButton("B2");
    JButton b3 = new JButton("B3");
    JButton b4 = new JButton("B4");
    JButton b5 = new JButton("B5");
    JButton b6 = new JButton("B6");
    JButton b7 = new JButton("B7");
    JButton b8 = new JButton("B8");
    JButton b9 = new JButton("B9");
    JButton b10 = new JButton("B10");
    JButton b11 = new JButton("B11");
    JButton b12 = new JButton("B12");
    JButton b13 = new JButton("B13");
    JButton b14 = new JButton("B14");
    JButton b15 = new JButton("B15");
    JButton b16 = new JButton("B16");

    JPanel messagePanel = new JPanel();
    JLabel messageLabel = new JLabel("test", JLabel.CENTER);

    Huvudprogram() {
        this.add(huvudpanel);
        huvudpanel.setLayout(new BorderLayout());

        huvudpanel.add(buttonPanel, BorderLayout.NORTH);
        buttonPanel.setLayout(new GridLayout(1, 2));
        buttonPanel.setPreferredSize(new Dimension(200, 50));
        buttonPanel.add(startNewGameButton);
        buttonPanel.add(testVictoryButton);


        huvudpanel.add(gamePanel, BorderLayout.CENTER);
        gamePanel.setLayout(new GridLayout(4, 4));
        gamePanel.setPreferredSize(new Dimension(500, 500));
        gamePanel.add(b1);
        gamePanel.add(b2);
        gamePanel.add(b3);
        gamePanel.add(b4);
        gamePanel.add(b5);
        gamePanel.add(b6);
        gamePanel.add(b7);
        gamePanel.add(b8);
        gamePanel.add(b9);
        gamePanel.add(b10);
        gamePanel.add(b11);
        gamePanel.add(b12);
        gamePanel.add(b13);
        gamePanel.add(b14);
        gamePanel.add(b15);
        gamePanel.add(b16);

        huvudpanel.add(messagePanel, BorderLayout.SOUTH);
        messagePanel.setLayout(new GridLayout(1, 1));
        messagePanel.setPreferredSize(new Dimension(500, 200));
        messagePanel.add(messageLabel);

        setTitle("15-spel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        //setSize(500, 600);
        setVisible(true);
        setLocationRelativeTo(null);

    }


    void main() {
    }
}




