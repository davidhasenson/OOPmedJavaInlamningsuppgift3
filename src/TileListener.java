import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TileListener implements ActionListener {

    private JLabel message;
    private JButton[] tiles;
    private JButton[] winningOrder;
    private JPanel gamePanel;

    TileListener(JLabel message, JButton[] tiles, JButton[] winningOrder, JPanel gamePanel) {
        this.message = message;
        this.tiles = tiles;
        this.winningOrder = winningOrder;
        this.gamePanel = gamePanel;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        JButton chosenTile = (JButton) ae.getSource();
        int indexOfChosenTile = -1;
        for (int i = 0; i < tiles.length; i++) {
            if (tiles[i] == chosenTile) {
                indexOfChosenTile = i;
            }
        }

        int indexOfEmptyTile = -1;
        for (int i = 0; i < tiles.length; i++) {
            if (tiles[i].getText().equals("")) {
                indexOfEmptyTile = i;
            }
        }

        if (new CheckMove(indexOfEmptyTile, indexOfChosenTile).allowedMove()) {
            new MoveTile(indexOfEmptyTile, indexOfChosenTile, tiles, gamePanel).move();
        }

        if (indexOfChosenTile != indexOfEmptyTile) {
            if (new ResultCheck().victoryCheck(tiles, winningOrder)) {
                message.setText("Du vann!");
            }
        }
    }
}
