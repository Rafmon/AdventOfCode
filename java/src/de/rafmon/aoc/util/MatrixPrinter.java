package de.rafmon.aoc.util;

public class MatrixPrinter {

	public static void printMatrix(char[][] matrix) {
		for (char[] row : matrix) {
			for (char ch : row) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}
}
