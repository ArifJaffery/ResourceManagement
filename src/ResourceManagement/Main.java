package ResourceManagement;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		int[] iballs = new int[] {4,5,6,7,9};
		int[] iholes = new int[] {4,5,6,7,8};
		
		Balls balls = new Balls(iballs);
		Holes holes = new Holes(iholes);
		ResourceManager manager = new ResourceManager(balls,holes);
		ResourceResponse response = manager.AssignBallsToHoles();
		Balls BallsNotAssigned = response.getBallsNotAssigned();
		Holes HolesNotAssigned = response.getHolesNotAssigned();
		AssignedBallsHoles AssignedBallHoles = response.getAssignedBalls();
		Iterator assignedBallHoleIterator = AssignedBallHoles.iterator();
		System.out.println("Results: Ball/Hole Assigment");
		while (assignedBallHoleIterator.hasNext()) {
			AssignedBallHole ballholeSinglePair = (AssignedBallHole) assignedBallHoleIterator.next();
			Ball ball = ballholeSinglePair.getBall();
			Hole hole = ballholeSinglePair.getHole();
			System.out.print("(Ball,Hole)= ("+ball.getSize() + "," + hole.getSize() + ") " );
		}
		if (BallsNotAssigned.size() > 0 ) {
			System.out.println("\nResults: Balls not assigned");
			Iterator BallsNotAssignedIterator = BallsNotAssigned.iterator();
			while (BallsNotAssignedIterator.hasNext()) {
				Ball ball = (Ball) BallsNotAssignedIterator.next();
				System.out.print(ball.getSize()+" ");
			}
		}
		else
		{
			System.out.println("\nResults: All Balls are assigned");			
		}
		
		if (HolesNotAssigned.size() > 0 ) {
			System.out.println("\nResults: Holes not assigned");
			Iterator HolesNotAssignedIterator = HolesNotAssigned.iterator();
			while (HolesNotAssignedIterator.hasNext()) {
				Hole hole = (Hole) HolesNotAssignedIterator.next();
				System.out.print(hole.getSize()+" ");
			}
		}
		else
		{
			System.out.println("\nResults: All Holes are assigned");			
		}			
	}
}
