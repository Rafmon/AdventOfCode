package de.rafmon.aoc._24._5;

import java.util.HashSet;

import de.rafmon.aoc.util.InputHelper;

public class PrintQueue {
	private static final String PAGE_SEPERATOR = "|";
	private int fixedPagesAccumulatedPageNumbers = 0;
	private int accumulatedPageNumbers = 0;

	public static void main(String[] args) {
		PrintQueue printQueue = new PrintQueue();
		printQueue.runPrintQueue();
	}

	private void runPrintQueue() {
		String[] inputSplit = PrintQueueInput.INPUT.split("\r\n\r\n");

		HashSet<String> rulebook = createRuleBook(inputSplit);

		calculateAccumulatedPagesSum(InputHelper.convertToStringArray(inputSplit[1]), rulebook);

		System.out.println("Accumulated middle page numbers: " + accumulatedPageNumbers);
		System.out.println("Fixed pages accumulated page numbers: " + fixedPagesAccumulatedPageNumbers);
	}

	private void calculateAccumulatedPagesSum(String[] allPageGroups, HashSet<String> rulebook) {
		for (String pageGroup : allPageGroups) {
			accumulatedPageNumbers += validateAndCheckPages(pageGroup.split(","), rulebook);
		}
	}

	private HashSet<String> createRuleBook(String[] inputSplit) {
		int estimatedRulebookSize = 1200;
		HashSet<String> rulebook = new HashSet<>(estimatedRulebookSize);

		for (String rule : InputHelper.convertToStringArray(inputSplit[0])) {
			rulebook.add(rule);
		}
		return rulebook;
	}

	private int validateAndCheckPages(String[] pages, HashSet<String> rulebook) {
		if (!arePagesValid(pages, rulebook)) {
			fixedPagesAccumulatedPageNumbers += fixInvalidPages(pages, rulebook);
		}
		return extractMiddlePageNumber(pages);
	}

	private boolean arePagesValid(String[] pages, HashSet<String> rulebook) {
		for (int i = 0; i < pages.length - 1; i++) {
			if (!accordingToRules(pages[i], pages[i+1], rulebook)) {
				return false;
			}
		}
		return true;

	}

	private Integer extractMiddlePageNumber(String[] pages) {
		return Integer.valueOf(pages[(pages.length / 2)]);
	}

	// solution for pt2
	private int fixInvalidPages(String[] pages, HashSet<String> rulebook) {
		while (true) {
			boolean isInvalid = false;
			for (int pageIndex = 0; pageIndex < pages.length - 1; pageIndex++) {
				if (!accordingToRules(pages[pageIndex], pages[pageIndex + 1], rulebook)) {
					swapPages(pages, pageIndex);
					isInvalid = true;
				}
			}
			if (!isInvalid) {
				return extractMiddlePageNumber(pages);
			}
		}

	}

	private void swapPages(String[] pages, int i) {
		String temp = pages[i];
		pages[i] = pages[i + 1];
		pages[i + 1] = temp;
	}

	private static boolean accordingToRules(String x, String y, HashSet<String> rulebook) {
		return (rulebook.contains(x + PAGE_SEPERATOR + y));

	}
}
