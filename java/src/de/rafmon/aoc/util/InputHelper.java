package de.rafmon.aoc.util;

public class InputHelper {

	/**
	 * converts a Input string into a Character Matrix.
	 * 
	 * @param aInput the input to be converted
	 * @return
	 */
	public static char[][] convertInputToMatrix(String aInput) {
		String splitRegex = "";
		if (aInput.contains("\r\n")) {
			splitRegex = "\n";
		} else {
			splitRegex = "\n";
		}

		String[] input = aInput.split(splitRegex);
		char[][] matrix = new char[input.length][input[0].length()];

		for (int i = 0; i < input.length; i++) {
			matrix[i] = input[i].toCharArray();
		}

		return matrix;

	}

}
