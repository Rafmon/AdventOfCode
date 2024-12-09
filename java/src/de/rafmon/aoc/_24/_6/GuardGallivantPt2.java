package de.rafmon.aoc._24._6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import de.rafmon.aoc.util.InputHelper;

/**
 * expected input: 2008
 */
public class GuardGallivantPt2 {

	private static ExecutorService executor;
	private static int obstacles;

	public static void main(String[] args) {
		char[][] landscape = InputHelper.convertInputToMatrix(GuardGallivantInput.INPUT);
		executor = Executors.newFixedThreadPool(10);
		

		int starty = 90; 
		int startx = 91;
		
		for(int y = 0; y < landscape.length; y++) {
			for(int x = 0; x < landscape[0].length; x++) {
				if(landscape[y][x] != 'X' && landscape[y][x] != '^') {
					char[][] landscapeCopy = deepCopy(landscape);
					landscapeCopy[y][x] = '#';
					move(landscapeCopy, starty, startx, Direction.NORTH);
				}
			}			
		}
		
		System.out.println("found loops: " + obstacles);
		executor.shutdown();

	}

	private static void move(char[][] landscape, int startY, int startX, Direction direction) {
		int walkingDistance = 0;
		
		while (true) {
			int newY = direction.getNextY(startY);
			int newX = direction.getNextX(startX);

			if (newY < 0 || newY >= landscape.length || newX < 0 || newX >= landscape[0].length) {
				return;
			}			
			if (walkingDistance > 10000) {
				obstacles++;
				return;
			}
			if (landscape[newY][newX] == '#') {
				direction = direction.nextClockwise();
			}  else {
				startY = newY;
				startX = newX;
			}
			walkingDistance++;
		}
	}



	public static char[][] deepCopy(char[][] input) {
		char[][] copy = new char[input.length][];
		for (int i = 0; i < input.length; i++) {
			copy[i] = input[i].clone();
		}
		return copy;
	}
}
