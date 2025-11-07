public class CheckMove {

    int indexOfEmptyTile;
    int indexOfChosenTile;

    CheckMove(int indexOfEmptyTile, int indexOfChosenTile) {
        this.indexOfEmptyTile = indexOfEmptyTile;
        this.indexOfChosenTile = indexOfChosenTile;
    }

    public boolean allowedMove() {
        int checkChosenTileRow = indexOfChosenTile / 4;
        int checkChosenTileCol = indexOfChosenTile % 4;
        int checkEmptyTileRow = indexOfEmptyTile / 4;
        int checkEmptyTileCol = indexOfEmptyTile % 4;
        if (indexOfChosenTile != indexOfEmptyTile) {
            if ((indexOfChosenTile == indexOfEmptyTile + 1 ||
                    indexOfChosenTile == indexOfEmptyTile - 1 ||
                    indexOfChosenTile == indexOfEmptyTile + 4 ||
                    indexOfChosenTile == indexOfEmptyTile - 4) &&
                    (checkChosenTileRow == checkEmptyTileRow || checkChosenTileCol == checkEmptyTileCol)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}