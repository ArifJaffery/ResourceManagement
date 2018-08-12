package ResourceManagement;

import java.util.*;

public class ResourceManager {
	private Balls balls;
	private Holes holes;

	public ResourceManager(Balls balls,Holes holes) {
		this.balls = balls;
		this.holes = holes;
	}	
	public ResourceResponse AssignBallsToHoles(){
		AssignedBallsHoles assigedballsholes =  new AssignedBallsHoles();		
		
		Iterator<Hole> holeIterator = holes.iterator();
		while (holeIterator.hasNext()) {
			Hole hole = holeIterator.next();
			Iterator<Ball> ballIterator = balls.iterator();
			while (ballIterator.hasNext()) {
				Ball ball = ballIterator.next();
				if (ball.getSize() <= hole.getSize()) {
					AssignedBallHole assignedballhole =  new AssignedBallHole(ball,hole);
					assigedballsholes.add(assignedballhole);
					ballIterator.remove();
					holeIterator.remove();
					break;
				}
			}
		}
		ResourceResponse response =new ResourceResponse(balls,holes,assigedballsholes);			
		return response;
	} 

}
