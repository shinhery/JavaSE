package test

public class AiTest01 {
	import java.util.Scanner;

	public class LightGame {
	    private boolean[][] lights;
	    private int rows;
	    private int cols;

	    public LightGame(int rows, int cols) {
	        this.rows = rows;
	        this.cols = cols;
	        this.lights = new boolean[rows][cols];
	    }

	    public void toggle(int row, int col) {
	        if (isValidPosition(row, col)) {
	            lights[row][col] = !lights[row][col];
	            toggleAdjacentLights(row, col);
	        }
	    }

	    private boolean isValidPosition(int row, int col) {
	        return row >= 0 && row < rows && col >= 0 && col < cols;
	    }

	    private void toggleAdjacentLights(int row, int col) {
	        toggleLight(row - 1, col);
	        toggleLight(row + 1, col);
	        toggleLight(row, col - 1);
	        toggleLight(row, col + 1);
	    }

	    private void toggleLight(int row, int col) {
	        if (isValidPosition(row, col)) {
	            lights[row][col] = !lights[row][col];
	        }
	    }

	    public boolean isGameCompleted() {
	        for (boolean[] row : lights) {
	            for (boolean light : row) {
	                if (!light) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }

	    public void printGrid() {
	        System.out.println("Current Grid:");
	        for (boolean[] row : lights) {
	            for (boolean light : row) {
	                System.out.print(light ? "O " : "X ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of rows: ");
	        int rows = scanner.nextInt();
	        System.out.print("Enter the number of columns: ");
	        int cols = scanner.nextInt();

	        LightGame game = new LightGame(rows, cols);
	        game.printGrid();

	        int moves = 0;
	        while (!game.isGameCompleted()) {
	            System.out.print("Enter the row and column to toggle (e.g., 1 2): ");
	            int row = scanner.nextInt() - 1;
	            int col = scanner.nextInt() - 1;

	            game.toggle(row, col);
	            moves++;

	            game.printGrid();
	        }

	        System.out.println("Congratulations! You solved the puzzle in " + moves + " moves.");
	        scanner.close();
	    }
	}
}