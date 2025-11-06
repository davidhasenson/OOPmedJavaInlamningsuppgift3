import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Huvudprogram extends JFrame {

    JPanel huvudpanel = new JPanel();

    JPanel buttonPanel = new JPanel();
    JButton startNewGameButton = new JButton("Starta nytt spel");
    JButton testVictoryButton = new JButton("Testa vinst");

    JPanel gamePanel = new JPanel();

    JPanel messagePanel = new JPanel();
    JLabel messageLabel = new JLabel("test", JLabel.CENTER);

    JButton[] gameTile = new JButton[16];
    JButton[] winningOrder = new JButton[16];


    public void placeTilesOnBord() {
        for (JButton tile : gameTile) {
            gamePanel.add(tile);
        }
    }

    /*public void moveTile(int indexOfEmptyTile, int indexOfChosenTile) {
        JButton temp = gameTile[indexOfEmptyTile];
        gameTile[indexOfEmptyTile] = gameTile[indexOfChosenTile];
        gameTile[indexOfChosenTile] = temp;

        gamePanel.removeAll();

        for (JButton tile : gameTile) {
            gamePanel.add(tile);
        }

        gamePanel.revalidate();
        gamePanel.repaint();
    }
*/

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

        for (int i = 0; i < 16; i++) {
            gameTile[i] = new JButton(String.valueOf((i + 1)));
        }
        gameTile[15].setText("");
        placeTilesOnBord();

        huvudpanel.add(messagePanel, BorderLayout.SOUTH);
        messagePanel.setLayout(new GridLayout(1, 1));
        messagePanel.setPreferredSize(new Dimension(500, 200));
        messagePanel.add(messageLabel);


        startNewGameButton.addActionListener(new StartNewGameListener(messageLabel, gameTile, winningOrder, gamePanel));
        testVictoryButton.addActionListener(new TestVictoryButtonListener(this));
        for (JButton tile : gameTile) {
            tile.addActionListener(new TileListener(messageLabel, gameTile, winningOrder, gamePanel));
        }

        setTitle("15-spel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        //setSize(500, 600);
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




