import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;

public class StartNewGame {
    private JLabel message;
    private JButton[] tiles;
    private JButton[] winningOrder;
    private JPanel gamePanel;

    StartNewGame(JLabel message, JButton[] tiles, JButton[] winningOrder, JPanel gamePanel) {
        this.message = message;
        this.tiles = tiles;
        this.winningOrder = winningOrder;
        this.gamePanel = gamePanel;
    }

    public void newGame() {

        gamePanel.removeAll();

        for (int i = 0; i < 16; i++) {
            tiles[i] = new JButton(String.valueOf((i + 1)));
            tiles[i].addActionListener(new TileListener(message, tiles, winningOrder, gamePanel));
        }
        tiles[15].setText("");

        Collections.shuffle(Arrays.asList(tiles));

        for (JButton tile : tiles) {
            gamePanel.add(tile);
        }

        gamePanel.revalidate();
        gamePanel.repaint();

        message.setText("Nytt spel.");
    }
}
