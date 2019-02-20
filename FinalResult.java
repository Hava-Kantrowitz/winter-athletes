package Homework1;

public class FinalResult {
	
	ShootingResult shootingFinal;
	SkiingResult skiingFinal;
	
	FinalResult (ShootingResult shootingFinal, SkiingResult skiingFinal){
		this.shootingFinal = shootingFinal;
		this.skiingFinal = skiingFinal;
	}
	
	public double finalScoreMid() {
		return shootingFinal.getPenalties() +
				skiingFinal.getPenalties() +
				skiingFinal.pointsEarned();
	}
	
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
