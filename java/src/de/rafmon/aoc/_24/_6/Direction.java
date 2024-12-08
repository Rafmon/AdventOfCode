package de.rafmon.aoc._24._6;

enum Direction {
	NORTH(-1, 0, '^'), EAST(0, 1, '>'), SOUTH(1, 0, 'v'), WEST(0, -1, '<');

	private final int dY;
	private final int dX;
	private final char symbol;

	Direction(int dY, int dX, char symbol) {
		this.dY = dY;
		this.dX = dX;
		this.symbol = symbol;
	}

	public int getNextY(int y) {
		return y + dY;
	}

	public int getNextX(int x) {
		return x + dX;
	}

	public char getSymbol() {
		return symbol;
	}

	public Direction nextClockwise() {
		return values()[(this.ordinal() + 1) % values().length];
	}
}