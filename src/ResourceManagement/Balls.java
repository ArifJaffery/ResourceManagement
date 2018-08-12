package ResourceManagement;
import java.util.*;
import java.util.Collections;

public class Balls extends ArrayList<Ball> implements IOperations {
	public Balls() {
	}
	
	public boolean Search(Ball ball) {
		boolean defaultValue = false;
		Iterator<Ball> iterator = iterator();
		while (iterator.hasNext()) {
			Ball item = (Ball) iterator.next();
			if (item.equals(ball)) {
				return true;
			}
		}
		return defaultValue;
	}
	
	public Balls(int[] balls) {
		for (int size: balls)
			add(new Ball(size));
	}
	public void Add(Ball ball) {
		add(ball);
	}
	public void Add(int size) {
		Ball newBall= new Ball(size);
		add(newBall);
	}
	public void Print() {
		Iterator<Ball> iterator = iterator();
		while (iterator.hasNext()) {
			Ball ball = (Ball) iterator.next();
			System.out.print(ball.getSize());			
		}
	}	
	
	public boolean equals(Balls balls) {
		boolean defaultValue=true;
		
		Iterator<Ball> iterator = balls.iterator();
		while (iterator.hasNext()) {
			Ball ball = iterator.next();
			boolean search = Search(ball); 
			if (!search)
				return false;
		}		
		return defaultValue;		
	}	
}
