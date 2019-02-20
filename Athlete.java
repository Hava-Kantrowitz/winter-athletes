public class Athlete {
	
	FinalResult finalScore;
	String name;
	
	/**
	 * Creates an athlete
	 * @param finalScore : the final score of the athlete from their skiing and shooting results
	 * @param name : the name of the athlete
	 */
	public Athlete (FinalResult finalScore, String name){
		this.finalScore = finalScore;
		this.name = name;
	}
	
	
	/**
	 * Determines which athlete is a better skiier
	 * @param athlete2 : the athlete the original athlete is compared against
	 * @return boolean : true if the original athlete is a better skiier
	 */
	boolean betterSkiier (Athlete athlete2) {
		return (this.finalScore.skiingFinal.pointsEarned() < athlete2.finalScore.skiingFinal.pointsEarned());
	}
	
	/**
	 * Determines which athlete is a better shooter
	 * @param athlete2 : the athlete the original athlete is compared against
	 * @return boolean : true if the original athlete is a better shooter
	 */
	boolean betterShooter (Athlete athlete2) {
		return (this.finalScore.shootingFinal.pointsEarned() > athlete2.finalScore.shootingFinal.pointsEarned());
	}
	
	/**
	 * Determines which athlete is overall better
	 * @param athlete2 : the athlete the original athlete is compared against
	 * @return boolean : true if the original athlete is either a better shooter or a better skiier
	 */
	boolean hasBeaten (Athlete athlete2) {
		return (this.betterShooter(athlete2) || this.betterSkiier(athlete2));
	}
	
}
