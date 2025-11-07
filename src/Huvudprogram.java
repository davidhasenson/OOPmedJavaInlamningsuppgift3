import javax.swing.*;
import java.awt.*;

public class Huvudprogram extends JFrame {

    JPanel huvudpanel = new JPanel();

    JPanel buttonPanel = new JPanel();
    JButton startNewGameButton = new JButton("Starta nytt spel");
    JButton testVictoryButton = new JButton("Testa vinst");

    JPanel gamePanel = new JPanel();

    JPanel messagePanel = new JPanel();
    JLabel messageLabel = new JLabel("test", JLabel.CENTER );

    JButton[] gameTile = new JButton[16];
    JButton[] winningOrder = new JButton[16];

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

        huvudpanel.add(messagePanel, BorderLayout.SOUTH);
        messagePanel.setLayout(new GridLayout(1, 1));
        messagePanel.setPreferredSize(new Dimension(500, 200));
        messagePanel.add(messageLabel);

        new StartNewGame(messageLabel, gameTile, winningOrder, gamePanel).newGame();

        startNewGameButton.addActionListener(new StartNewGameListener(messageLabel, gameTile, winningOrder, gamePanel));
        testVictoryButton.addActionListener(new TestVictoryButtonListener(messageLabel, gameTile, winningOrder, gamePanel));

        setTitle("15-spel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);

        for (int i = 0; i < 16; i++) {
            winningOrder[i] = new JButton(String.valueOf((i + 1)));
        }
        winningOrder[15].setText("");
    }

    void main() {
    }

}




