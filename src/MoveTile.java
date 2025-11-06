import javax.swing.*;

public class MoveTile {

    private int indexOfEmptyTile;
    private int indexOfChosenTile;
    private JButton[] tiles;
    private JPanel gamePanel;

    MoveTile(int indexOfEmptyTile, int indexOfChosenTile, JButton[] tiles, JPanel gamePanel) {
        this.indexOfEmptyTile = indexOfEmptyTile;
        this.indexOfChosenTile = indexOfChosenTile;
        this.tiles = tiles;
        this.gamePanel = gamePanel;
    }

    public void move() {
        JButton temp = tiles[indexOfEmptyTile];
        tiles[indexOfEmptyTile] = tiles[indexOfChosenTile];
        tiles[indexOfChosenTile] = temp;

        gamePanel.removeAll();

        for (JButton tile : tiles) {
            gamePanel.add(tile);
        }

        gamePanel.revalidate();
        gamePanel.repaint();
    }
}
