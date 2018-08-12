package ResourceManagement;

public class Ball {
	private int size;
	
	public Ball(int size) {
		setSize(size);
	}
	
	public int getSize() {
		return size;
	}	
	public void setSize(int size) {
		this.size = size;
	}
	
	public boolean equals(Ball ball) {
		return size == ball.getSize();
	}
}
