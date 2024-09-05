public class LifeOfGame {

    private static final int ROWS = 10;
    private static final int COLUMNS = 10;

    private int[][] grid;

    public LifeOfGame() {
        grid = new int[ROWS][COLUMNS];
        initializeRandomly();
    }

    private void initializeRandomly() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                grid[i][j] = Math.random() < 0.5 ? 1 : 0;
            }
        }
    }

    public void printGrid() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void nextGeneration() {
        int[][] newGrid = new int[ROWS][COLUMNS];

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                int liveNeighbors = countLiveNeighbors(i, j);

                if (grid[i][j] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    newGrid[i][j] = 0;
                } else if (grid[i][j] == 0 && liveNeighbors == 3) {
                    newGrid[i][j] = 1;
                } else {
                    newGrid[i][j] = grid[i][j];
                }
            }
        }

        grid = newGrid;
    }

    private int countLiveNeighbors(int i, int j) {
        int liveNeighbors = 0;

        for (int x = i - 1; x <= i + 1; x++) {
            for (int y = j - 1; y <= j + 1; y++) {
                if (x >= 0 && x < ROWS && y >= 0 && y < COLUMNS && grid[x][y] == 1) {
                    liveNeighbors++;
                }
            }
        }

        return liveNeighbors;
    }

    public static void main(String[] args) {
        LifeOfGame game = new LifeOfGame();

        game.printGrid();
        game.nextGeneration();
        game.printGrid();
    }


}
