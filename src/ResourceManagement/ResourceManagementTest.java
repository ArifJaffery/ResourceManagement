package ResourceManagement;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ResourceManagementTest {

	@Test
	void AllBallAndHoleAssigned() {	
		//Test Data
		ArrayList<AssignedBallHole> assignedBallsHolesArrayList = new ArrayList<AssignedBallHole>();
		AssignedBallHole firstPair = new AssignedBallHole(new Ball(1),new Hole(1));
		AssignedBallHole secondPair = new AssignedBallHole(new Ball(2),new Hole(2));
		AssignedBallHole thirdPair = new AssignedBallHole(new Ball(3),new Hole(3));
		AssignedBallHole fourPair = new AssignedBallHole(new Ball(4),new Hole(4));
		assignedBallsHolesArrayList.add(firstPair);
		assignedBallsHolesArrayList.add(secondPair);
		assignedBallsHolesArrayList.add(thirdPair );
		assignedBallsHolesArrayList.add(fourPair);
		AssignedBallsHoles StaticResult  = new AssignedBallsHoles(assignedBallsHolesArrayList);
		StaticResult.Print("Expected Value");
		
		//Manipulating results through program
		Balls balls = new Balls(new int[] {1,2,3,4});
		Holes holes = new Holes(new int[] {1,2,3,4});
		ResourceManager manager = new ResourceManager(balls,holes);
		ResourceResponse response = manager.AssignBallsToHoles();
		AssignedBallsHoles ProgramManipulatedResults = response.getAssignedBalls();
		ProgramManipulatedResults.Print("\nActual Value");
		
		//Comparing 
		boolean comparison = StaticResult.equals(ProgramManipulatedResults);
		assertEquals(comparison,true);
	}

}
