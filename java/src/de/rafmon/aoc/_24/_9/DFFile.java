package de.rafmon.aoc._24._9;

import java.util.ArrayList;
import java.util.List;

public class DFFile {
	
	public List<Integer> content;
	public DFFile(int contentPart, int amount) {
		this.content = new ArrayList<>();
		if(amount > 1) {
			for (int a = 0; a < amount; a++) {
				content.add(contentPart);
			}
		}else {
			this.content = List.of(contentPart);
		}
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    DFFile other = (DFFile) obj;
	    return content == other.content && getSize() == other.getSize();
	}
	
	public int getSize() {
		return content.size();
	}

	public List<Integer> getContent() {
		return content;
	}
	
	
}
