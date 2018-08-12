package ResourceManagement;

public class Hole {
	private int size;
	
	public Hole(int size) {
		setSize(size);
	}	
	public int getSize() {
		return size;
	}	
	public void setSize(int size) {
		this.size = size;
	}
	
	public boolean equals(Hole hole) {
		return size == hole.getSize();
	}	
}
