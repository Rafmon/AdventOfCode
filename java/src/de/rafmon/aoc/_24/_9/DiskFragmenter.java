package de.rafmon.aoc._24._9;

import java.util.Arrays;

public class DiskFragmenter {

	public static void main(String[] args) {
		int[] diskMap = generateCecompresseDiscMap(DiskFragmenterInput.INPUT);
		removeGaps(diskMap);
		long checkSum = generateChecksum(diskMap);
		System.out.println("Checksum: " + checkSum);

	}

	private static int[] generateCecompresseDiscMap(String input) {
		int[] decompressedDiscMap = new int[input.length() * 10];
		Arrays.fill(decompressedDiscMap, -1);
		boolean decompModeSwitch = true;
		int id = 0;
		int arrayIndex = 0;
		for (int i = 0; i < input.length(); i++) {
			if (decompModeSwitch) { // fill with the specified amount of IDs
				int amount = Character.getNumericValue(input.charAt(i));
				for (int a = 0; a < amount; a++) {
					decompressedDiscMap[arrayIndex] = id;
					arrayIndex++;
				}
				id++;
			} else { // fill with the specified amount of blanks('.')
				int amount = Character.getNumericValue(input.charAt(i));
				for (int a = 0; a < amount; a++) {
					decompressedDiscMap[arrayIndex] = -1;
					arrayIndex++;
				}
			}
			decompModeSwitch = !decompModeSwitch;
		}
		return decompressedDiscMap;
	}

	private static int[] removeGaps(int[] decompressed) {
		int end = decompressed.length - 1;
		for (int i = 0; i <= end; i++) {
			if (decompressed[i] == -1) {
				while (decompressed[end] == -1) {
					end--;
				}
				decompressed[i] = decompressed[end];
				decompressed[end] = -1;
				end--;
			}
		}

		return decompressed;
	}

	private static long generateChecksum(int[] gapsRemoved) {
		long CheckSum = 0L;
		long id = 0;
		for (int i = 0; i < gapsRemoved.length; i++) {
			if (gapsRemoved[i] != -1) {
				CheckSum += gapsRemoved[i] * id;
				id++;
			}
		}
		return CheckSum;
	}

}
