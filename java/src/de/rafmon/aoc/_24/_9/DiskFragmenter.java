package de.rafmon.aoc._24._9;

public class DiskFragmenter {

	public static void main(String[] args) {
		String decompressed = generateCecompresseDiscMap(DiskFragmenterInput.INPUT);
		String gapsRemoved = removeGaps(decompressed);
		System.out.println(gapsRemoved);
		long checkSum = generateChecksum(gapsRemoved);
		System.out.println("Checksum: " + checkSum);
		
		//TODO für den fix in int array umbauen
	}

	private static String generateCecompresseDiscMap(String input) {
		StringBuilder decompressedDiscMap = new StringBuilder();
		boolean decompModeSwitch = true;
		long id = 0;
		for (int i = 0; i < input.length(); i++) {
			if (decompModeSwitch) { // fill with the specified amount of IDs
				decompress(decompressedDiscMap, "" + id, Character.getNumericValue(input.charAt(i)));
				id++;
			} else { // fill with the specified amount of blanks('.')
				decompress(decompressedDiscMap, ".", Character.getNumericValue(input.charAt(i)));
			}
			decompModeSwitch = !decompModeSwitch;
		}
		return decompressedDiscMap.toString();
	}

	private static void decompress(StringBuilder decompressedDiscMap, String s, int amount) {
		for (int j = 0; j < amount; j++) {
			decompressedDiscMap.append(s);
		}
	}

	private static String removeGaps(String decompressed) {
		StringBuilder removedGaps = new StringBuilder();
		int end = decompressed.length()-1;
		for (int i = 0; i <= end; i++) {
			if (decompressed.charAt(i) == '.') {
				while(decompressed.charAt(end) == '.') {
					end--;
				}
				removedGaps.append(decompressed.charAt(end));
				end--;
			}else {
				removedGaps.append(decompressed.charAt(i));
			}
		}

		return removedGaps.toString();
	}
	
	private static long generateChecksum(String gapsRemoved) {
		long CheckSum = 0L;
		long id = 0;
		for(int i = 0; i < gapsRemoved.length(); i++) {
			CheckSum += Character.getNumericValue(gapsRemoved.charAt(i)) * id;
			id++;
		}
		return CheckSum;
	}

}
