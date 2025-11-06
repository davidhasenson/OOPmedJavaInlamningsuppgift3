public class CheckMove {

    CheckMove() {
    }

    public boolean allowedMove(int indexOfEmptyTile, int indexOfChosenTile) {
        if (indexOfChosenTile != indexOfEmptyTile) {
            if (indexOfChosenTile == indexOfEmptyTile + 1 ||
                    indexOfChosenTile == indexOfEmptyTile - 1 ||
                    indexOfChosenTile == indexOfEmptyTile + 4 ||
                    indexOfChosenTile == indexOfEmptyTile - 4) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
