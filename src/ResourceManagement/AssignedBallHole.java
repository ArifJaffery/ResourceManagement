package ResourceManagement;

public class AssignedBallHole {
	private Ball ball;
	private Hole hole;
	
	public AssignedBallHole(Ball ball,Hole hole) {
		this.ball = ball;
		this.hole = hole;
	}	
	public Ball getBall() {
		return ball;
	}	
	public Hole getHole() {
		return hole;
	}
}
