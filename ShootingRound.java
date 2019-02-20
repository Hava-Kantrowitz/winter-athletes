

public class ShootingRound {
	
	int targetsHit;
	boolean isStanding;
	
	/**
	 * creates a shooting round object
	 * @param targetsHit : the number of targets hit within the round
	 * @param isStanding : whether or not the shooting was done while standing 
	 */
	public ShootingRound (int targetsHit, boolean isStanding){
		this.targetsHit = targetsHit;
		this.isStanding = isStanding;
	}

}
