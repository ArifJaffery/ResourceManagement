package ResourceManagement;
import java.util.*;

public class AssignedBallsHoles extends ArrayList<AssignedBallHole> {
	public AssignedBallsHoles() {		
	}
	
	public AssignedBallsHoles(ArrayList<AssignedBallHole> assignedBallsHoles) {		
		super(assignedBallsHoles);
	}
	
	public void Print(String banner) {
		System.out.println(banner);
		Iterator<AssignedBallHole> iterator = iterator();
		while (iterator.hasNext()) {
			AssignedBallHole ballholeSinglePair = (AssignedBallHole) iterator.next();
			Ball ball = ballholeSinglePair.getBall();
			Hole hole = ballholeSinglePair.getHole();
			System.out.print("(Ball,Hole)= ("+ball.getSize() + "," + hole.getSize() + ") " );
		}		
	}
	
	public boolean Search(AssignedBallHole assignedBallHole) {
		boolean defaultValue = false;
		
		Iterator<AssignedBallHole> iterator = iterator();
		while (iterator.hasNext()) {
			AssignedBallHole item = iterator.next();
			if (item.getBall().getSize() == assignedBallHole.getBall().getSize() &&
					item.getHole().getSize() == assignedBallHole.getHole().getSize()) {
				return true;
			}
		}		
		return defaultValue;
	}
	
	public boolean equals(AssignedBallsHoles assignedBallsHoles) {
		boolean defaultValue = true;
		
		Iterator<AssignedBallHole> iterator = assignedBallsHoles.iterator();
		while (iterator.hasNext()) {
			AssignedBallHole item = iterator.next();
			boolean search = Search(item);
			if (!search)
				return false;
		}
		
		return defaultValue;
	}
	
}
