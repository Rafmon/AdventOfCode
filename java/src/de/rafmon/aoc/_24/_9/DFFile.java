package de.rafmon.aoc._24._9;

import java.util.ArrayList;
import java.util.List;

public class DFFile {
	private int id;
	private List<Integer> content;
	private int amount =0;
	public DFFile(int id, int amount) {
		this.content = new ArrayList<>();
		this.id = id;
		this.amount = amount;
		if(amount > 1) {
			for (int a = 0; a < amount; a++) {
				content.add(id);
			}
		}else {
			this.content = List.of(id);
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
	
	public int getId() {
		return id;
	}
	
	public int getAmount() {
		return amount;
	}
	
}
