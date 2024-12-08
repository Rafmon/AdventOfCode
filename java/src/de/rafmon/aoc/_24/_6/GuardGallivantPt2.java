package de.rafmon.aoc._24._6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import de.rafmon.aoc.util.InputHelper;

/**
 *
 */
public class GuardGallivantPt2 {

	private static ExecutorService executor;
	private static List<CompletableFuture<Boolean>> branches;

	public static void main(String[] args) {
		char[][] landscape = InputHelper.convertInputToMatrix(GuardGallivantInput.INPUT);
		executor = Executors.newFixedThreadPool(10);
		branches = new ArrayList<>();

		int starty = 90;
		int startx = 91;

		move(landscape, starty, startx, Direction.NORTH, true);

		CompletableFuture<Void> done = CompletableFuture.allOf(branches.toArray(new CompletableFuture[0]));

		done.join();

		long successfulLoops = branches.stream().filter(f -> !f.isCompletedExceptionally()).map(CompletableFuture::join)
				.filter(result -> result).count();

		System.out.println("found loops: " + successfulLoops);

		executor.shutdown();

	}

	private static boolean move(char[][] landscape, int startY, int startX, Direction direction,
			boolean createBranches) {
		while (true) {
			landscape[startY][startX] = direction.getSymbol();

			int newY = direction.getNextY(startY);
			int newX = direction.getNextX(startX);

			if (newY < 0 || newY >= landscape.length || newX < 0 || newX >= landscape[0].length) {
				return false;
			}

			if (landscape[newY][newX] == '#') {
				direction = direction.nextClockwise();
			} else if (!createBranches && landscape[newY][newX] == direction.getSymbol()) {
				return true;
			} else {
				if (createBranches) {
					createBranch(landscape, startY, startX, direction);
				}

				startY = newY;
				startX = newX;
			}
		}
	}

	private static void createBranch(char[][] landscape, int startY, int startX, Direction direction) {
		char[][] landscapeCopy = deepCopy(landscape);
		landscapeCopy[direction.getNextY(startY)][direction.getNextX(startX)] = '#';
		CompletableFuture<Boolean> future = CompletableFuture.supplyAsync(() -> {
			return move(landscape, startY, startX, direction, false);
		}, executor);

		branches.add(future);

	}

	public static char[][] deepCopy(char[][] input) {
		char[][] copy = new char[input.length][];
		for (int i = 0; i < input.length; i++) {
			copy[i] = input[i].clone();
		}
		return copy;
	}
}
