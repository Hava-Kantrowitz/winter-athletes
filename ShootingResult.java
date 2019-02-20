import java.util.LinkedList;

public class ShootingResult implements IEvent {
	
	LinkedList<ShootingRound>rounds;
	
	/**
	 * creates a shooting result object
	 */
	public ShootingResult (LinkedList<ShootingRound> rounds){
		this.rounds = rounds;
	}
	
	/**
	 * Calculates the points earned during the shooting event
	 * @return double : the points earned by the athlete
	 */
	public double pointsEarned() {
		double runningSum = 0;
		for (ShootingRound n : rounds) {
			runningSum = runningSum + n.targetsHit;
		}
		
		return runningSum;
	}
	
	/**
	 * Calculates the points taken off due to penalties during the shooting event
	 * @return double : the points to be subtracted due to penalties
	 */
	public double getPenalties() {
		return (20 - this.pointsEarned())*60;
	}
	
	/**
	 * Determines what the best round of either standing or prone shooting is
	 * @param typeRound : the type of shooting round, either standing (true) or prone (false)
	 * @return ShootingRound : the best round of shooting of the given type
	 */
	public ShootingRound bestRoundByType(boolean typeRound) {
		ShootingRound bestRound;
		bestRound = new ShootingRound(0,false);
		ShootingRound bestRoundTest;
		bestRoundTest = new ShootingRound(0,false);
		for (ShootingRound n : rounds) {
			if (typeRound == n.isStanding && n.targetsHit >= bestRound.targetsHit) {
				bestRound = n;
			}
			
		}
		
		if(bestRound == bestRoundTest) {
			bestRound = null;
			return bestRound;
		}
		else {
		return bestRound;
		}
	}
	

}
