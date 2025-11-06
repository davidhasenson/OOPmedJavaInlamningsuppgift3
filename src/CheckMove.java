public class CheckMove {

    int indexOfEmptyTile;
    int indexOfChosenTile;

    CheckMove(int indexOfEmptyTile, int indexOfChosenTile) {
        this.indexOfEmptyTile = indexOfEmptyTile;
        this.indexOfChosenTile = indexOfChosenTile;
    }

    public boolean allowedMove() {
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
