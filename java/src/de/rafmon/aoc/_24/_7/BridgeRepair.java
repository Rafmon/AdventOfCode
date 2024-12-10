package de.rafmon.aoc._24._7;

import de.rafmon.aoc.util.InputHelper;

public class BridgeRepair {
	private static long calibrationResult = 0L;

	public static void main(String[] args) {
		String[] lines = InputHelper.convertToStringArray(BridgeRepairInput.INPUT);
		for (String equation : lines) {
			String[] eq = equation.split(": ");
			checkEq(Long.valueOf(eq[0]), eq[1].split(" "));
		}
		System.out.println(calibrationResult);

	}

	/*
	 * using binary representation of i to where 0 = + and 1 = *. This will give us
	 * all possible variations for the operators
	 */
	private static void checkEq(long result, String[] eqParts) {
		int numOperators = eqParts.length - 1;

		int runs = (int) Math.pow(2, numOperators);

		for (int i = 0; i < runs; i++) {
			long testResult = Long.valueOf(eqParts[0]);
			String binaryI = Integer.toBinaryString(i);

			// add missing zeroes.
			while (binaryI.length() < numOperators) {
				binaryI = "0" + binaryI;
			}

			System.out.println("eqParts: " + eqParts.length + " i: " + i + " binary: " + binaryI);

			char[] binaryICharArray = binaryI.toCharArray();

			for (int j = 0; j < binaryICharArray.length; j++) {
				if (binaryICharArray[j] == '0') {
					testResult += Long.valueOf(eqParts[j + 1]);

				} else {
					testResult *= Long.valueOf(eqParts[j + 1]);

				}
			}
			if (testResult == result) {
				calibrationResult += result;
				System.out.println("found Result");
				return;
			}
		}
		System.out.println("done without result");
	}

}
