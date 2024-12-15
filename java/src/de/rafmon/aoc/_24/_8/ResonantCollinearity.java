package de.rafmon.aoc._24._8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.rafmon.aoc.util.InputHelper;
import de.rafmon.aoc.util.Pair;
import de.rafmon.aoc.util.Vector.Vector2Int;

public class ResonantCollinearity {
	private static int boundsMaxX;
	private static int boundsMaxY;
	private static Set<Pair<Integer, Integer>> antinodeLocatations;

	public static void main(String[] args) {
		antinodeLocatations = new HashSet<>();

		String[] input = InputHelper.convertToStringArray(ResonantCollinearityInput.INPUT);
		boundsMaxY = input.length - 1;
		boundsMaxX = input[0].length() - 1;
		Map<Character, List<Pair<Integer, Integer>>> allTowerLocations = getTowerCoordinate(input);

		genereateTowerAntinodes(allTowerLocations);

		System.out.println("Individual Tower Antinode Locations: " + antinodeLocatations.size());
	}

	private static void genereateTowerAntinodes(Map<Character, List<Pair<Integer, Integer>>> allTowerLocations) {
		for (Map.Entry<Character, List<Pair<Integer, Integer>>> entry : allTowerLocations.entrySet()) {
			Character towerFreqency = entry.getKey();
			if (allTowerLocations.get(towerFreqency).size() > 1) {
				List<Pair<Integer, Integer>> towerLocations = entry.getValue();
				for (Pair<Integer, Integer> tower : towerLocations) {
					for (Pair<Integer, Integer> tower2 : towerLocations) {
						if (!tower2.equals(tower)) {
							generateAntinodes(tower, tower2);
						}
					}
				}
			} else {
				System.out.println("skipped freq: " + towerFreqency);
			}
		}
	}

	private static void generateAntinodes(Pair<Integer, Integer> tower1, Pair<Integer, Integer> tower2) {
		Vector2Int tower1V = new Vector2Int(tower1.getKey(), tower1.getValue());
		Vector2Int tower2V = new Vector2Int(tower2.getKey(), tower2.getValue());

		Vector2Int dist = tower2V.subtract(tower1V);
		Vector2Int antinode1 = tower1V.subtract(dist);
		Vector2Int antinode2 = tower2V.add(dist);

		if (checkBounds(antinode1)) {
			antinodeLocatations.add(Pair.of(antinode1.x, antinode1.y));
		}

		if (checkBounds(antinode2)) {
			antinodeLocatations.add(Pair.of(antinode2.x, antinode2.y));
		}

	}

	private static boolean checkBounds(Vector2Int v) {
		if (v.x < 0 || v.x > boundsMaxX) {
			return false;
		}

		if (v.y < 0 || v.y > boundsMaxY) {
			return false;
		}

		return true;
	}

	/**
	 * converts The input to a List of Tower Components for Each Character;
	 * 
	 * @param input
	 * @return A Map of towers where the key is the character/tower type and the
	 *         list contains all the Tower locations
	 */
	private static HashMap<Character, List<Pair<Integer, Integer>>> getTowerCoordinate(String[] input) {
		HashMap<Character, List<Pair<Integer, Integer>>> TowerLocations = new HashMap<>();

		for (int y = 0; y < input.length; y++) {
			char[] line = input[y].toCharArray();
			for (int x = 0; x < line.length; x++) {
				char c = line[x];
				if (c != '.') {
					TowerLocations.computeIfAbsent(c, k -> new ArrayList<Pair<Integer, Integer>>()).add(Pair.of(x, y));
				}
			}
		}
		return TowerLocations;
	}

}
