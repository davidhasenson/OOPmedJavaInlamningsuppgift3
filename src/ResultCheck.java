import javax.swing.*;

public class ResultCheck {

    public boolean victoryCheck(JButton[] gameArray, JButton[] winningOrderArray) {

        boolean victory = false;
        for (int i = 0; i < 16; i++) {
            if (!gameArray[i].getText().equals(winningOrderArray[i].getText())) {
                return false;
            } else {
                victory = true;
            }
        }
        return victory;
    }
}
