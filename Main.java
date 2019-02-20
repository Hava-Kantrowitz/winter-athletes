package Homework1;

public class Main {
	
	SkiingResult skiResult1 = new SkiingResult(1, 2.8, 3.4, 4.5, 1.2, 0);
	ShootingRound round1 = new ShootingRound(5);
	ShootingRound round2 = new ShootingRound(4);
	ShootingRound round3 = new ShootingRound(4);
	ShootingRound round4 = new ShootingRound(5);
	ShootingResult shootResult1 = new ShootingResult(round1, round2, round3, round4);
	FinalResult final1 = new FinalResult(shootResult1, skiResult1);
	Athlete athlete1 = new Athlete(final1);
	
	SkiingResult skiResult2 = new SkiingResult(2, 7, 13.2, 14.5, 8, 2);
	ShootingRound Around1 = new ShootingRound(2);
	ShootingRound Around2 = new ShootingRound(2);
	ShootingRound Around3 = new ShootingRound(2);
	ShootingRound Around4 = new ShootingRound(2);
	ShootingResult shootResult2 = new ShootingResult(Around1, Around2, Around3, Around4);
	FinalResult final2 = new FinalResult(shootResult2, skiResult2);
	Athlete athlete2 = new Athlete(final2);

}
