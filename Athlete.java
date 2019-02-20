package Homework1;

public class Athlete {
	
	FinalResult finalScore;
	
	Athlete (FinalResult finalScore){
		this.finalScore = finalScore;
	}
	
	boolean betterSkiier (Athlete athlete2) {
		return (this.finalScore.skiingFinal.pointsEarned() < athlete2.finalScore.skiingFinal.pointsEarned());
	}
	
	boolean betterShooter (Athlete athlete2) {
		return (this.finalScore.shootingFinal.pointsEarned() > athlete2.finalScore.shootingFinal.pointsEarned());
	}
	
	boolean hasBeaten (Athlete athlete2) {
		return (this.betterShooter(athlete2) || this.betterSkiier(athlete2));
	}
	
}
