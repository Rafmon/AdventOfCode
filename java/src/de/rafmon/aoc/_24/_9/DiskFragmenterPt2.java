package de.rafmon.aoc._24._9;

import java.util.LinkedList;
import java.util.ListIterator;

import de.rafmon.aoc.util.HowCanThisEvenHappenException;

public class DiskFragmenterPt2 {

	public static void main(String[] args) {
		LinkedList<DFFile> diskMap = generateCecompresseDiscMap(DiskFragmenterInput.INPUT);
		removeGaps(diskMap);
		long checkSum = generateChecksum(diskMap);
		System.out.println("Checksum: " + checkSum);

	}

	private static LinkedList<DFFile> generateCecompresseDiscMap(String input) {
		LinkedList<DFFile> decompressedDiskMap = new LinkedList<DFFile>();
		boolean decompModeSwitch = true;
		int id = 0;
		for (int i = 0; i < input.length(); i++) {
			if (decompModeSwitch) { // fill with the specified file
				int amount = Character.getNumericValue(input.charAt(i));
				decompressedDiskMap.addLast(new DFFile(id, amount));
				id++;
			} else { // fill with an {@DFEmptyFile} placeholder
				int amount = Character.getNumericValue(input.charAt(i));
				decompressedDiskMap.addLast(new DFEmptyFile(amount));

			}
			decompModeSwitch = !decompModeSwitch;
		}
		return decompressedDiskMap;
	}

	private static void removeGaps(LinkedList<DFFile> diskMap) {
		LinkedList<DFFile> newDiscMap = new LinkedList<DFFile>();
		ListIterator<DFFile> backward = diskMap.listIterator(diskMap.size());
		DFFile back = backward.previous();
		for (ListIterator<DFFile> forward = diskMap.listIterator(); forward.nextIndex() < backward
				.previousIndex(); forward.hasNext()) {
			DFFile front = forward.next();
			if (front instanceof DFEmptyFile) {
				while (back instanceof DFEmptyFile || back.getSize() > front.getSize()) {
					back = backward.previous();
				}
				if (back.content == front.content) {
					var temp = front;
					forward.set(back);
					backward.set(temp);
				} else if (back.getSize() < front.getSize()) {
					int diff = front.getSize() - back.getSize();
					var temp = front;
					forward.set(back);
					forward.add(new DFEmptyFile(diff));
					backward.set(temp);
				} else {
					throw new HowCanThisEvenHappenException();
				}
			}
		}
	}

	private static long generateChecksum(LinkedList<DFFile> diskMap) {
		long CheckSum = 0L;
		long id = 0;
		for (DFFile dfFile : diskMap) {
			if (!(dfFile instanceof DFEmptyFile)) {
				for (int content : dfFile.content) {
					CheckSum += content * id;
					id++;
				}				
				
			}
		}
		return CheckSum;
	}

}
