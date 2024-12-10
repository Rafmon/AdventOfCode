package de.rafmon.aoc._24._7;

import de.rafmon.aoc.util.InputHelper;

public class BridgeRepairPt2 {
	private static long calibrationResult = 0L;

	public static void main(String[] args) {
		String[] lines = InputHelper.convertToStringArray(BridgeRepairInput.INPUT);
		for (String equation : lines) {
			String[] eq = equation.split(": ");
			calibrationResult += checkEq(Long.valueOf(eq[0]), eq[1].split(" "));
		}
		System.out.println(calibrationResult);

	}

	/*
	 * same apporach as with pt one. Instead of binary we convert to tertiary to
	 * account for three operators
	 */
	private static long checkEq(long result, String[] eqParts) {
		int numOperators = eqParts.length - 1;

		int totalCombinations = (int) Math.pow(3, numOperators);

		for (int i = 0; i < totalCombinations; i++) {
			long intermediateResult = Long.valueOf(eqParts[0]);
			long current = i;

			for (int j = 0; j < numOperators; j++) {
				int operatorCode = (int) (current % 3);
				current /= 3;

				long nextNumber = Long.parseLong(eqParts[j + 1]);
				intermediateResult = applyOperator(intermediateResult, nextNumber, operatorCode);
			}

			if (intermediateResult == result) {
				return result;
			}
		}
		return 0L;
	}

	private static long applyOperator(long intermediateResult, long nextNumber, int operatorNumber) {
		switch (operatorNumber) {
		case 0: // +
			return intermediateResult + nextNumber;
		case 1: // *
			return intermediateResult * nextNumber;
		case 2: // concat ||
			return Long.valueOf("" + intermediateResult + nextNumber);
		default:
			throw new IllegalArgumentException("Invalid Operator: " + operatorNumber);
		}
	}

}
