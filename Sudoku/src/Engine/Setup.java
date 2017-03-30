package Engine;

/**
 * Created by School_Jeffrey on 3/28/2017.
 */
public class Setup {

    private int grid[][];

    public Setup(){
        this.grid = setGrid();
    }

    public int[][] setGrid() {
        // positie cell?


        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                grid[row][col] = (int) (Math.random() * 10);
            }
            // waarde cell?
            System.out.println(grid);
            // controle geldig begin
        }
        return grid;
    }

    public void resetGrid() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++)
                grid[row][col] = 0;
        }
    }
}
