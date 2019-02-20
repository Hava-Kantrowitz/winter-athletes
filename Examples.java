import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Ignore;
import org.junit.Test;

public class Examples {
	
	SkiingResult skiing1 = new SkiingResult(2, 25, 30.2, 27.3, 26.4, 0);
	LinkedList<ShootingRound>shooting1 = new LinkedList<ShootingRound>();
	ShootingResult shooter1 = new ShootingResult(shooting1);
	ShootingRound round1 = new ShootingRound(3, true);
	ShootingRound round2 = new ShootingRound(4, true);
	ShootingRound round3 = new ShootingRound(2, true);
	ShootingRound round4 = new ShootingRound(5, false);
	ShootingRound round5 = new ShootingRound(3, false);
	ShootingRound round6 = new ShootingRound(4, true);
	ShootingRound round7 = new ShootingRound(5, false);
	FinalResult final1 = new FinalResult(shooter1, skiing1);
	Athlete athlete1 = new Athlete(final1, "Joseph");
	
	SkiingResult skiing2J = new SkiingResult(0,0.0,0.0,0.0,0.0,0);
	FinalResult final2 = new FinalResult(shooter1, skiing2J);
	Athlete athlete2 = new Athlete(final2, "Sam");
	
	LinkedList<ShootingRound>shooting2 = new LinkedList<ShootingRound>();
	ShootingResult shooter2 = new ShootingResult(shooting2);
	FinalResult final3 = new FinalResult(shooter2, skiing1);
	Athlete athlete3 = new Athlete(final3, "Simon");
	
	LinkedList<ShootingRound>shooting3 = new LinkedList<ShootingRound>();
	ShootingResult shooter3 = new ShootingResult(shooting3);
	FinalResult final4 = new FinalResult(shooter3, skiing1);
	Athlete athlete4 = new Athlete(final4, "Evan");
	
	LinkedList<ShootingRound>shooting4 = new LinkedList<ShootingRound>();
	ShootingResult shooter4 = new ShootingResult(shooting4);
	FinalResult final5 = new FinalResult(shooter4, skiing1);
	Athlete athlete5 = new Athlete(final5, "Evan");
	
	LinkedList<Athlete>athleteList1 = new LinkedList<Athlete>();
	Competition comp1 = new Competition(5, athleteList1);
	LinkedList<Athlete>athletesToFinish = new LinkedList<Athlete>();
	Competition comp2 = new Competition (1, athleteList1);
	
	Athlete athlete1Same = new Athlete(final1, "Joseph");
	
	SkiingResult skiing1Worse = new SkiingResult(9, 500, 500, 300, 300, 6);
	FinalResult final1Worse = new FinalResult(shooter1, skiing1Worse);
	Athlete athlete1Worse = new Athlete(final1Worse, "Joseph");
	
	SkiingResult skiing1Better = new SkiingResult(1, 1, 1, 1, 1, 6);
	FinalResult final1Better = new FinalResult(shooter1, skiing1Better);
	Athlete athlete1Better = new Athlete(final1Better, "Joseph");
	
	LinkedList<Athlete>joeSamePlaceSame = new LinkedList<Athlete>();
	LinkedList<Athlete>joeSamePlaceBetter = new LinkedList<Athlete>();
	LinkedList<Athlete>joeSamePlaceWorse = new LinkedList<Athlete>();
	
	LinkedList<Athlete>joeDiffPlaceSame = new LinkedList<Athlete>();
	LinkedList<Athlete>joeDiffPlaceBetter = new LinkedList<Athlete>();
	LinkedList<Athlete>joeDiffPlaceWorse = new LinkedList<Athlete>();
	
	Competition joeStaysSame = new Competition(3, joeSamePlaceSame);
	Competition joeStaysBetter = new Competition(3, joeSamePlaceBetter);
	Competition joeStaysWorse = new Competition(3, joeSamePlaceWorse);
	Competition joeMoveSame = new Competition(3, joeDiffPlaceSame);
	Competition joeMoveBetter = new Competition(3, joeDiffPlaceBetter);
	Competition joeMoveWorse = new Competition(3, joeDiffPlaceWorse);
	
	public Examples() {
		shooting1.add(round1);
		shooting1.add(round2);
		shooting1.add(round3);
		shooting1.add(round4);
		shooting1.add(round5);
		
		shooting2.add(round1);
		shooting2.add(round2);
		shooting2.add(round4);
		shooting2.add(round5);
		shooting2.add(round6);
		shooting2.add(round7);
		
		shooting3.add(round1);
		shooting3.add(round2);
		shooting3.add(round3);
		shooting3.add(round6);
		
		shooting4.add(round4);
		shooting4.add(round5);
		shooting4.add(round7);
		
		athleteList1.add(athlete1);
		athleteList1.add(athlete2);
		athleteList1.add(athlete3);
		athleteList1.add(athlete4);
		athleteList1.add(athlete5);
		
		athletesToFinish.add(athlete4);
		athletesToFinish.add(athlete5);
		
		joeSamePlaceSame.add(athlete1Same);
		joeSamePlaceSame.add(athlete2);
		joeSamePlaceSame.add(athlete3);
		joeSamePlaceSame.add(athlete4);
		joeSamePlaceSame.add(athlete5);
		
		joeSamePlaceBetter.add(athlete1Better);
		joeSamePlaceBetter.add(athlete2);
		joeSamePlaceBetter.add(athlete3);
		joeSamePlaceBetter.add(athlete4);
		joeSamePlaceBetter.add(athlete5);
		
		joeSamePlaceWorse.add(athlete1Worse);
		joeSamePlaceWorse.add(athlete2);
		joeSamePlaceWorse.add(athlete3);
		joeSamePlaceWorse.add(athlete4);
		joeSamePlaceWorse.add(athlete5);
		
		joeDiffPlaceSame.add(athlete5);
		joeDiffPlaceSame.add(athlete2);
		joeDiffPlaceSame.add(athlete3);
		joeDiffPlaceSame.add(athlete4);
		joeDiffPlaceSame.add(athlete1Same);
		
		joeDiffPlaceBetter.add(athlete3);
		joeDiffPlaceBetter.add(athlete2);
		joeDiffPlaceBetter.add(athlete1Better);
		joeDiffPlaceBetter.add(athlete4);
		joeDiffPlaceBetter.add(athlete5);
		
		joeDiffPlaceWorse.add(athlete2);
		joeDiffPlaceWorse.add(athlete1Worse);
		joeDiffPlaceWorse.add(athlete3);
		joeDiffPlaceWorse.add(athlete4);
		joeDiffPlaceWorse.add(athlete5);
		
		
		
		
	}
	
	// test the points earned while skiing
	@Test
	public void testSkiingPoints() {
		assertEquals(athlete1.finalScore.skiingFinal.pointsEarned(), 108.9, .1);
	}
	
	// test the points earned while skiing, when the athlete didn't ski
	@Test
	public void testNoSkiingPoints() {
		assertEquals(athlete2.finalScore.skiingFinal.pointsEarned(), 0, .1);
	}
	
	// test the points earned while shooting
	@Test
	public void testShootingPoints() {
		assertEquals(athlete1.finalScore.shootingFinal.pointsEarned(), 17, .1);
	}
	
	// tests finding the best round of prone shooting
	@Test
	public void testBestProneShooting() {
		assertEquals(athlete1.finalScore.shootingFinal.bestRoundByType(false), round4);
	}
	
	// tests finding the best round of standing shooting 
	@Test
	public void testbestStandingShooting() {
		assertEquals(athlete1.finalScore.shootingFinal.bestRoundByType(true), round2);
	}
	
	// tests finding the best round of prone shooting when the best is a tie
	@Test
	public void testbestProneShootingTie() {
		assertEquals(athlete3.finalScore.shootingFinal.bestRoundByType(false), round7);
	}
	
	// tests finding the best round of standing shooting when the best is a tie
	@Test
	public void testbestStandingShootingTie() {
		assertEquals(athlete3.finalScore.shootingFinal.bestRoundByType(true), round6);
	}
	
	// tests finding the best round of standing with no standing rounds
	@Ignore
	public void testBestStandingNoStanding() {
		assertEquals(athlete5.finalScore.shootingFinal.bestRoundByType(true), null);
	}
	
	// tests finding the best round of prone with no prone rounds 
	@Ignore
	public void testBestProneNoProne() {
		assertEquals(athlete4.finalScore.shootingFinal.bestRoundByType(false), null);
	}
	
	// tests the creation of a list where some athletes haven't finished shooting
	@Test
	public void testShootingNotFinished() {
		assertEquals(comp1.shootingDNF(), athletesToFinish);
	}
	
	// tests the creation of a list where all athletes have finished shooting
	@Ignore
	public void testShootingFinished() {
		assertEquals(comp2.shootingDNF(), null);
	}
	
	// returns the final score of a specific athlete 
	@Test
	public void testSpecificAthlete() {
		assertEquals(comp1.finalScoreForAthlete("Joseph"), final1);
	}
	
	// tests improvement when the athlete has improved and is in the same place in both lists
	@Test
	public void testImprovementSamePlace() {
		assertTrue(comp1.anyImprovement(joeStaysBetter));
	}
	
	// tests improvement when the athlete has stayed the same and is in the same place in both lists
	@Test
	public void testNoImprovementSamePlace() {
		assertFalse(comp1.anyImprovement(joeStaysSame));
	}
	
	// tests improvement when the athlete has regressed and is in the same place in both lists
	@Test
	public void testRegressionSamePlace() {
		assertFalse(comp1.anyImprovement(joeStaysWorse));
	}
	
	// tests improvement when the athlete has improved and is in different places in both lists
	@Test
	public void testImprovementDiffPlace() {
		assertTrue(comp1.anyImprovement(joeMoveBetter));
	}
	
	// tests improvement when the athlete has stayed the same and is in different places in both lists
	@Test
	public void testNoImprovementDiffPlace() {
		assertFalse(comp1.anyImprovement(joeMoveSame));
	}
		
	// tests improvement when the athlete has regressed and is in different places in both lists
	@Test
	public void testRegressionDiffPlace() {
		assertFalse(comp1.anyImprovement(joeMoveWorse));
	}

}
