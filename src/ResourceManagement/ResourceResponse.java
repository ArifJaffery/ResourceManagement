package ResourceManagement;

public class ResourceResponse {
	private Balls BallsNotAssigned;	
	private Holes HolesNotAssigned;
	private AssignedBallsHoles AssignedBallHoles;
	
	public ResourceResponse(Balls BallsNotAssigned,Holes HolesNotAssigned,AssignedBallsHoles AssignedBalls) {
		this.BallsNotAssigned = BallsNotAssigned;
		this.HolesNotAssigned = HolesNotAssigned;
		this.AssignedBallHoles = AssignedBalls;
	}
	
	public Balls getBallsNotAssigned() {
		return BallsNotAssigned;
	}
	
	public Holes getHolesNotAssigned() {
		return HolesNotAssigned;
	}
	
	public AssignedBallsHoles getAssignedBalls() {
		return AssignedBallHoles;
	}
	
}