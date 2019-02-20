import java.util.LinkedList;

public class Competition {
	
	int numShootingRounds;
	LinkedList<Athlete>athletes = new LinkedList<Athlete>();
	
	/**
	 * Creates a competition with a limit of shooting rounds in the shooting event
	 * and a list of athletes to compete
	 * @param numShootingRounds : the number of shooting rounds in the shooting event
	 */
	
	public Competition (int numShootingRounds, LinkedList<Athlete>athletes) {
		this.numShootingRounds = numShootingRounds;
		this.athletes = athletes;
	}
	
	/**
	 * Determines which athletes in the competition still need to finish their shooting rounds
	 * @return LinkedList<Athlete> : the list of athletes which still have shooting rounds to finish
	 */
	public LinkedList<Athlete> shootingDNF(){
		LinkedList<Athlete>athletesToFinish = new LinkedList<Athlete>();
		for (Athlete n : athletes) {
			if (n.finalScore.shootingFinal.rounds.size() < this.numShootingRounds) {
				athletesToFinish.add(n);
			}

}
		return athletesToFinish;
	}
	
	/**
	 * Determines the final score earned by a specific athlete in the competition
	 * @param athleteName : the name of the athlete who is looking for their score
	 * @return FinalResult : the total final result of the specified athlete 
	 */
	public FinalResult finalScoreForAthlete(String athleteName) {
		FinalResult finalElement = null;
		for(Athlete n : athletes) {
			if(n.name.equals(athleteName)) {
				finalElement = n.finalScore;
			}
		}
		
		return finalElement;
	}
	
	/**
	 * Determines whether a specific athlete's improvement in this competition was better than the other competition
	 * @param otherCompetition : the competition the athlete's performance within is compared against
	 * @return boolean : true if the athlete's score improved in this competition, false otherwise 
	 */
	public boolean anyImprovement(Competition otherCompetition) {
		boolean improvement = false;
		for(Athlete n : this.athletes) {
			for (Athlete j : otherCompetition.athletes) {
				if (n.name.equals(j.name) && n.finalScore.finalScore() > j.finalScore.finalScore()) {
					improvement = true;
				}
			}
		}
		
		return improvement;
	}
	
	// I'm happy with how I organized my code. 
}
