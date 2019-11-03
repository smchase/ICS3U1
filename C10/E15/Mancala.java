import java.io.*;
import java.util.*;

public class Mancala
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int[] board = {3, 3, 3, 3, 3, 3, 0, 3, 3, 3, 3, 3, 3, 0};
		int player = 1, bin, stones;
		System.out.print(" __  __    __    _  _  ___    __    __      __   \n(  \\/  )  /__\\  ( \\( )/ __)  /__\\  (  )    /__\\  \n )    (  /(__)\\  )  (( (__  /(__)\\  )(__  /(__)\\ \n(_/\\/\\_)(__)(__)(_)\\_)\\___)(__)(__)(____)(__)(__)\nCreated by Simon Chase\n");
		while (!(board[0] == 0 && board[1] == 0 && board[2] == 0 && board[3] == 0 && board[4] == 0 && board[5] == 0) && !(board[7] == 0 && board[8] == 0 && board[9] == 0 && board[10] == 0 && board[11] == 0 && board[12] == 0)) {
			System.out.printf("\n           A  B  C  D  E  F\nP1-> [%2d] %2d %2d %2d %2d %2d %2d\n          %2d %2d %2d %2d %2d %2d [%2d] <-P2\nPlayer %d's turn: ", board[6], board[5], board[4], board[3], board[2], board[1], board[0], board[7], board[8], board[9], board[10], board[11], board[12], board[13], player);
			if (player == 1) {
				bin = -((int)sc.next().toUpperCase().charAt(0)-70);
				while (bin < 0 || bin > 5 || board[bin] == 0) {
					System.out.printf("INVALID\nPlayer %d's turn: ", player);
					bin = -((int)sc.next().toUpperCase().charAt(0)-70);
				}
			} else {
				bin = (int)sc.next().toUpperCase().charAt(0)-58;
				while (bin < 7 || bin > 12 || board[bin] == 0) {
					System.out.printf("INVALID\nPlayer %d's turn: ", player);
					bin = (int)sc.next().toUpperCase().charAt(0)-58;
				}
			}
			stones = board[bin];
			board[bin] = 0;
			for (int i = 1; i <= stones; i++) {
				if ((player == 1 && (bin+i)%14 == 13) || (player == 2 && (bin+i)%14 == 6)) {
					i--;
				} else {
					board[(bin+i)%14]++;
					if (i == stones && ((bin+i)%14 == 6 || (bin+i)%14 == 13)) {
						player = player%2+1;
					}
				}
				if (i == stones && board[(bin+i)%14] == 1) {
					if (player == 1 && (bin+i)%14 < 6) {
						board[6] += board[12-(bin+i)%14];
						board[12-(bin+i)%14] = 0;
					}
					if (player == 2 && (bin+i)%14 > 6 && (bin+i)%14 < 13) {
						board[13] += board[12-(bin+i)%14];
						board[12-(bin+i)%14] = 0;
					}
				}
			}
			player = player%2+1;
		}
		System.out.printf("\nP1: %d\nP2: %d\n", board[6], board[13]);
		if (board[6] > board[13]) {
			System.out.print("Player 1 wins!\n");
		} else if (board[13] > board[6]) {
			System.out.print("Player 2 wins!\n");
		} else {
			System.out.print("It's a tie!\n");
		}
	}
}
