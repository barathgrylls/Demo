package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTocToe {
	
	 static List<Integer> playerPositions =  new ArrayList<>();
	 static List<Integer> cpuPositions =  new ArrayList<>();


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char [][]  gameBoard= {{' ','|',' ','|',' '},
							   {'-','+','-','+','-'},
							   {' ','|',' ','|',' '},
							   {'-','+','-','+','-'},
							   {' ','|',' ','|',' '}};
		
		
		//print the gameBoard
		gameBoard(gameBoard);
		
		
		while (true) {

			String result = " ";

			int playerPosition = getPlayerPosition();
			if (playerPosition >= 1 && playerPosition <= 9) {
				char userSymbol = 'X';
				playerPositions.add(playerPosition);

				// method to position the input for based on user or CPU
				boardPostioniong(gameBoard, playerPosition, userSymbol);
				
				// gameBoard(gameBoard);
				result = getWinningResult();
				
				if (!result.isEmpty()) {
					gameBoard(gameBoard);
					System.out.println(result);
					break;
				}
			}
			

			int cpuPosition = getCpuPosition();
			if (cpuPosition >= 1 && cpuPosition <= 9) {
				cpuPositions.add(cpuPosition);
				char cpuSymbol = '0';

				// method to position the input for based on user or CPU
				boardPostioniong(gameBoard, cpuPosition, cpuSymbol);

				// setValues to the board
				gameBoard(gameBoard);

				// method returns win/tie
				result = getWinningResult();

				System.out.println(result);
				if (!result.isEmpty()) {
					break;
				}
			}

		}

	}
	
	
	private static int getPlayerPosition() {
		System.out.println("Please enter the Postion to Place :");
		Scanner scanner = new Scanner(System.in);
		int playerPosition = scanner.nextInt();

		if (playerPositions.contains(playerPosition) || cpuPositions.contains(playerPosition)) {
			System.out.println("ALready Placed in that position");
			Scanner scanner1 = new Scanner(System.in);
			playerPosition = getPlayerPosition();
		}

		return playerPosition;
	}


	private static int getCpuPosition() {
		Random random = new Random();
		int low = 1, high = 10;
		int cpuPosition = random.nextInt(high - low) + low;
		if (!playerPositions.contains(cpuPosition) && !cpuPositions.contains(cpuPosition)) {
			return cpuPosition;
		} else {
			return cpuPosition = getCpuPosition();

		}
	}


	private static String getWinningResult() {
		// TODO Auto-generated method stub

		List<Integer> topRow = Arrays.asList(1, 2, 3);
		List<Integer> midRow = Arrays.asList(4, 5, 6);
		List<Integer> botRow = Arrays.asList(7, 8, 9);

		List<Integer> leftColumn = Arrays.asList(1, 4, 7);
		List<Integer> midColumn = Arrays.asList(2, 5, 6);
		List<Integer> rightColumn = Arrays.asList(3, 8, 9);

		List<Integer> rightToLeftDiag = Arrays.asList(3, 5, 7);
		List<Integer> LeftToRightDiag = Arrays.asList(1, 5, 9);

		List<List> lists = new ArrayList<List>();

		lists.add(topRow);
		lists.add(midRow);
		lists.add(botRow);

		lists.add(leftColumn);
		lists.add(midColumn);
		lists.add(rightColumn);

		lists.add(rightToLeftDiag);
		lists.add(LeftToRightDiag);

		for (List l : lists) {

			if (playerPositions.containsAll(l)) {

				return "U won";

			} else if (cpuPositions.containsAll(l)) {

				return "CPU won";

			} else if (cpuPositions.size() + playerPositions.size() == 9) {

				return "TIE";

			}

		}

		return "";
	}


	private static void boardPostioniong(char[][] gameBoard, int position, char symbol) {
		// TODO Auto-generated method stub

		switch (position) {
		case 1:
			gameBoard[0][0] = symbol;
			break;
		case 2:
			gameBoard[0][2] = symbol;
			break;
		case 3:
			gameBoard[0][4] = symbol;
			break;
		case 4:
			gameBoard[2][0] = symbol;
			break;
		case 5:
			gameBoard[2][2] = symbol;
			break;
		case 6:
			gameBoard[2][4] = symbol;
			break;
		case 7:
			gameBoard[4][0] = symbol;
			break;
		case 8:
			gameBoard[4][2] = symbol;
			break;
		case 9:
			gameBoard[4][4] = symbol;
			break;

		default:
			break;
		}
	}


	public static void gameBoard(char[][] gameBoard) {

		for (char[] row : gameBoard) {
			for (char chr : row) {
				if (chr == 'X') {
					System.out.print((char) 27 + "[31m" + "X");
				} else if (chr == '0') {
					System.out.print((char) 27 + "[32m" + "0");

				} else {
					System.out.print(chr);

				}
			}
			System.out.println();
		}
	}

}
