import java.io.*;
import java.util.*;

public class TickTackToe
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] grid = new char[3][3];
		for (int i = 0; i < 9; i++) {
			grid[i/3][i%3] = '-';
		}
		int player = 1, r, c;
		while (true) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(grid[i][j]+" ");
				}
				System.out.println();
			}
			if ((grid[0][0] == 'X' && grid[0][1] == 'X' && grid[0][2] == 'X') || (grid[1][0] == 'X' && grid[1][1] == 'X' && grid[1][2] == 'X') || (grid[2][0] == 'X' && grid[2][1] == 'X' && grid[2][2] == 'X') || (grid[0][0] == 'X' && grid[1][0] == 'X' && grid[2][0] == 'X') || (grid[0][1] == 'X' && grid[1][1] == 'X' && grid[2][1] == 'X') || (grid[0][2] == 'X' && grid[1][2] == 'X' && grid[2][2] == 'X') || (grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2] == 'X') || (grid[0][2] == 'X' && grid[1][1] == 'X' && grid[2][0] == 'X')) {
				System.out.println("Player 1 (X) Wins!");
				break;
			}
			if ((grid[0][0] == 'X' && grid[0][1] == 'X' && grid[0][2] == 'X') || (grid[1][0] == 'X' && grid[1][1] == 'X' && grid[1][2] == 'X') || (grid[2][0] == 'X' && grid[2][1] == 'X' && grid[2][2] == 'X') || (grid[0][0] == 'X' && grid[1][0] == 'X' && grid[2][0] == 'X') || (grid[0][1] == 'X' && grid[1][1] == 'X' && grid[2][1] == 'X') || (grid[0][2] == 'X' && grid[1][2] == 'X' && grid[2][2] == 'X') || (grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2] == 'X') || (grid[0][2] == 'X' && grid[1][1] == 'X' && grid[2][0] == 'X')) {
				System.out.println("Player 2 (O) Wins!");
				break;
			}
			System.out.println("Player " + player);
			System.out.print("Row: ");
			r = Integer.parseInt(br.readLine());
			System.out.print("Column: ");
			c = Integer.parseInt(br.readLine());
			while (grid[r-1][c-1] != '-') {
				System.out.print("INVALID\nRow: ");
				r = Integer.parseInt(br.readLine());
				System.out.print("Column: ");
				c = Integer.parseInt(br.readLine());
			}
			System.out.println();
			grid[r-1][c-1] = player==1?'X':'O';
			player = player%2+1;
		}
	}
}
