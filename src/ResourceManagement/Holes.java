package ResourceManagement;

import java.util.*;

public class Holes extends ArrayList<Hole> implements IOperations {

	public Holes() {
		
	}	
	public Holes(int[] holes) {
		for (int size: holes)
			Add(size);
	}	
	public boolean Search(Hole hole) {
		boolean defaultValue = false;
		Iterator<Hole> iterator = iterator();
		while (iterator.hasNext()) {
			Hole item = (Hole) iterator.next();
			if (item.equals(hole)) {
				return true;
			}
		}
		return defaultValue;
	}	
	
	public void Add(Hole hole) {
		add(hole);
	}	
	public void Add(int size) {
		Hole newHole= new Hole(size);
		add(newHole);
	}
	public void Print() {
		Iterator<Hole> iterator = iterator();
		while (iterator.hasNext()) {
			Hole hole = (Hole) iterator.next();
			System.out.print(hole.getSize());			
		}
	}		
	public boolean equals(Holes holes) {
		boolean defaultValue=true;
		
		Iterator<Hole> iterator = holes.iterator();
		while (iterator.hasNext()) {
			Hole hole = iterator.next();
			boolean search = Search(hole); 
			if (!search)
				return false;
		}		
		return defaultValue;		
	}	
	
}
