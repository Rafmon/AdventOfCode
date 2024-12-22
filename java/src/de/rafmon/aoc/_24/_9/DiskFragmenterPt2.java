package de.rafmon.aoc._24._9;

import java.util.ArrayList;
import java.util.List;

public class DiskFragmenterPt2 {

	public static void main(String[] args) {
		List<DFFile> diskMap = generateCecompresseDiscMap(DiskFragmenterInput.INPUT);
		removeGaps(diskMap);
		long checkSum = generateChecksum(diskMap);
		System.out.println("Checksum: " + checkSum);

	}

	private static List<DFFile> generateCecompresseDiscMap(String input) {
		List<DFFile> decompressedDiskMap = new ArrayList<DFFile>(input.length());
		boolean decompModeSwitch = true;
		int id = 0;
		for (int i = 0; i < input.length(); i++) {
			if (decompModeSwitch) { // fill with the specified file
				int amount = Character.getNumericValue(input.charAt(i));
				decompressedDiskMap.add(new DFFile(id, amount));
				id++;
			} else { // fill with an {@DFEmptyFile} placeholder
				int amount = Character.getNumericValue(input.charAt(i));
				decompressedDiskMap.add(new DFEmptyFile(amount));

			}
			decompModeSwitch = !decompModeSwitch;
		}
		return decompressedDiskMap;
	}

	private static void removeGaps(List<DFFile> diskMap) {
		for (int i = diskMap.size() - 1; 0 <= i; i--) {
			DFFile back = diskMap.get(i);
			if (back.getClass() == DFFile.class) {
				for (int j = 0; j < i; j++) {
					DFFile front = diskMap.get(j);
					if (front.getClass() == DFEmptyFile.class) {
						if (front.getSize() == back.getSize()) {
							diskMap.set(j, back);
							diskMap.set(i, front);
							break;
						} else if (front.getSize() > back.getSize()) {
							int fileSizeDiff = front.getSize() - back.getSize();
							diskMap.set(j, back);
							diskMap.add(j + 1, new DFEmptyFile(fileSizeDiff));
							diskMap.set(i, front);
							i++;
							break;
						}
					}
				}
			}
		}
	}

	private static long generateChecksum(List<DFFile> diskMap) {
		long CheckSum = 0L;
		for (DFFile dfFile : diskMap) {
			if (!(dfFile instanceof DFEmptyFile)) {
				CheckSum += dfFile.getId() * dfFile.getAmount();

			}
		}
		return CheckSum;
	}

}