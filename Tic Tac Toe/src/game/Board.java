package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Board {
	private List<Cell> emptyCell;
	private Scanner scanner;
	private Player[][] board;
	private List<Cell> rootValues;

	public Board() {
		initializeBoard();
	}

	private void initializeBoard() {
		this.rootValues = new ArrayList<>();
		this.scanner = new Scanner(System.in);
		this.board = new Player[Constants.BOARD_SIZE][Constants.BOARD_SIZE];

	}

	public boolean isRunning() {
		if (isWinning(Player.COMPUTER))
			return false;
		if (isWinning(Player.USER))
			return false;
		if (getEmptyCells().isEmpty())
			return false;

		return true;

	}

	public List<Cell> getEmptyCells() {

		emptyCell = new ArrayList<>();
		for (int i = 0; i < Constants.BOARD_SIZE; i++) {
			for (int j = 0; j < Constants.BOARD_SIZE; j++) {
				if (board[i][j] == Player.NONE) {
					emptyCell.add(new Cell(i, j));
				}
			}
		}
		return emptyCell;
	}

	public boolean isWinning(Player player) {

		if (board[0][0] == player && board[1][1] == player
				&& board[2][2] == player) {
			return true;
		}

		if (board[0][2] == player && board[1][1] == player
				&& board[2][0] == player) {
			return true;
		}

		for (int i = 0; i < board.length; i++) {
			if (board[i][0] == player && board[i][1] == player
					&& board[i][2] == player) {
				return true;
			}
			if (board[0][i] == player && board[1][i] == player
					&& board[2][i] == player) {
				return true;
			}
		}
		return false;
	}

	public void move(Cell cell, Player player) {
		this.board[cell.getX()][cell.getY()] = player;
	}

	public Cell getBestMove() {
		int max = Integer.MIN_VALUE;
		int best = Integer.MIN_VALUE;

		for (int i = 0; i < rootValues.size(); i++) {
			if (max < rootValues.get(i).getMinMaxValue()) {
				max = rootValues.get(i).getMinMaxValue();
				best = i;
			}

		}

		return rootValues.get(best);
	}

	public void makeUserInput() {
		System.out.println("User's Move");
		System.out.print("In \"x\" axis : ");
		int x = scanner.nextInt();
		System.out.print("In \"y\" axis : ");
		int y = scanner.nextInt();
		Cell cell = new Cell(x, y);
		move(cell, Player.USER);
	}

	public void displayBoard() {
		System.out.println();
		for (int i = 0; i < Constants.BOARD_SIZE; i++) {
			for (int j = 0; j < Constants.BOARD_SIZE; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public int returnMin(List<Integer> list) {
		int index = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < min) {
				min = list.get(i);
				index = i;
			}
		}
		return list.get(index);
	}

	public int returnMax(List<Integer> list) {
		int index = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < max) {
				max = list.get(i);
				index = i;
			}
		}
		return list.get(index);
	}

	public void callMinmax(int depth, Player player) {
		rootValues.clear();
		minMax(depth, player);

	}

	private int minMax(int depth, Player player) {
		if (isWinning(Player.COMPUTER)) {
			System.out.print("+1"+"  ");
			return +1;
		}
		if (isWinning(Player.USER)) {
			System.out.print("-1"+"  ");
			return -1;
		}

		List<Cell> availableCells = getEmptyCell();
		if (availableCells.isEmpty()) {
			System.out.print("0"+"  ");
			return 0;
		}

		List<Integer> scores = new ArrayList<>();

		for (int i = 0; i < availableCells.size(); i++) {

			Cell point = availableCells.get(i);
			
			
			if (player == Player.COMPUTER) {
				move(point, Player.COMPUTER);
				int currentScore = minMax(depth + 1, Player.USER);
				System.out.println("computer");
				scores.add(currentScore);

				if (depth == 0) {
					point.setMinMaxValue(currentScore);
					rootValues.add(point);
				}
			}

			else if (player == Player.USER) {
				move(point, Player.USER);
				scores.add(minMax(depth + 1, Player.COMPUTER));
				System.out.println("user");
			}

			board[point.getX()][point.getY()] = Player.NONE;
		}

		if (player == Player.COMPUTER) {
			return returnMax(scores);
		}

		return returnMin(scores);
	}

	public void setupBoard() {
		for (int i = 0; i < Constants.BOARD_SIZE; i++) {
			for (int j = 0; j < Constants.BOARD_SIZE; j++) {
				board[i][j] = Player.NONE;
			}

		}
	}

	public List<Cell> getEmptyCell() {
		return emptyCell;
	}

	public void setEmptyCell(List<Cell> emptyCell) {
		this.emptyCell = emptyCell;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public Player[][] getBoard() {
		return board;
	}

	public void setBoard(Player[][] board) {
		this.board = board;
	}

	public List<Cell> getRootValues() {
		return rootValues;
	}

	public void setRootValues(List<Cell> rootValues) {
		this.rootValues = rootValues;
	}

}
