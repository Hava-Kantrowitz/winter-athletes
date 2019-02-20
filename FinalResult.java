

public class FinalResult {
	
	ShootingResult shootingFinal;
	SkiingResult skiingFinal;
	
	/**
	 * Creates a final result 
	 * @param shootingFinal : the final score of the shooting event
	 * @param skiingFinal : the final score of the skiing event 
	 */
	public FinalResult (ShootingResult shootingFinal, SkiingResult skiingFinal){
		this.shootingFinal = shootingFinal;
		this.skiingFinal = skiingFinal;
	}
	
	/**
	 * Determines the final score of each finishing position
	 * Helper function for finalScore()
	 * @return double : the final score
	 */
	public double finalScoreMid() {
		return shootingFinal.getPenalties() +
				skiingFinal.getPenalties() +
				skiingFinal.pointsEarned();
	}
	
	/**
	 * Determines the overall final score
	 * @return double : the final score
	 */
	public double finalScore() {
		if (skiingFinal.finishPosition == 1) {
			return this.finalScoreMid() - 10;
		}
		
		else if (skiingFinal.finishPosition == 2) {
			return this.finalScoreMid() - 7;
		}
		
		else if (skiingFinal.finishPosition == 3) {
			return this.finalScoreMid() - 3;
		}
		
		else if (skiingFinal.finishPosition == 4) {
			return this.finalScoreMid() - 1;
		}
		
		else {
			return this.finalScoreMid();
		}
	}

}
