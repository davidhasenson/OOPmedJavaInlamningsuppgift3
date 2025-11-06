import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestVictoryButtonListener implements ActionListener {


    private Huvudprogram huvudprogram;

    TestVictoryButtonListener(Huvudprogram huvudprogram) {
        this.huvudprogram = huvudprogram;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        huvudprogram.gamePanel.removeAll();

        for (int i = 0; i < 16; i++) {
            huvudprogram.gameTile[i] = new JButton(String.valueOf((i + 1)));
            huvudprogram.gameTile[i].addActionListener(huvudprogram);
        }
        huvudprogram.gameTile[15].setText("");
        huvudprogram.placeTilesOnBord();

        huvudprogram.gamePanel.revalidate();
        huvudprogram.gamePanel.repaint();
        huvudprogram.messageLabel.setText("Nytt test spel.");

    }
}



