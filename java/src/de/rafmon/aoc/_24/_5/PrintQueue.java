package de.rafmon.aoc._24._5;

import java.util.HashSet;

import de.rafmon.aoc.util.InputHelper;

public class PrintQueue {
	private static int fixedPagesAccumulatedPageNumbers;
	
	public static void main(String[] args) {
		String[] inputSplit = PrintQueueInput.INPUT.split("\r\n\r\n");
		
		InputHelper.convertToStringArray(inputSplit[0]);
		HashSet<String> rulebook = new HashSet<>(1200);
	
		for(String rule : InputHelper.convertToStringArray(inputSplit[0])) {
			rulebook.add(rule);
		}
		int accumulatedPageNumbers = 0;
		
		for (String string : InputHelper.convertToStringArray(inputSplit[1])) {
			accumulatedPageNumbers += check(string.split(","), rulebook);
		}
		
		System.out.println("Accumulated middle page numbers: " + accumulatedPageNumbers);
		System.out.println("Fixed pages accumulated page numbers: " + fixedPagesAccumulatedPageNumbers);
	}

	
	private static int check(String[] pages, HashSet<String> rulebook) {
		for(int i = 0; i < pages.length; i++) {
			for(int j = i+1;  j < pages.length; j++) {
				if(!accordingToRules(pages[i],pages[j], rulebook)) {
					fixedPagesAccumulatedPageNumbers += fixPages(pages,rulebook);
				}
			}
		}
		return Integer.valueOf(pages[(pages.length/2)]);
	}

	//solution for pt2
	private static int fixPages(String[] pages, HashSet<String> rulebook) {
		while(true) {
			boolean foundFault = false;
			for(int i = 0; i < pages.length-1; i++) {
				if(!accordingToRules(pages[i],pages[i+1], rulebook)) {
					String temp = pages[i];
					pages[i] = pages[i+1];
					pages[i+1] = temp;
					foundFault = true;
				}
			}
			if(!foundFault) {
				return Integer.valueOf(pages[(pages.length/2)]);
			}
		}
		
	}

	private static boolean accordingToRules(String x, String y, HashSet<String> rulebook) {
		return (rulebook.contains(x + "|" + y));
		
	}
}
