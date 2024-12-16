package de.rafmon.aoc._24._9;

public class DFEmptyFile extends DFFile{

	int size;
	public DFEmptyFile(int size) {
		super(-1, 0);
		this.size = size;
	}
	
	@Override
	public int getSize() {
		return size;
	}

}
