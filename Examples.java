package Homework1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Examples {

	// tests the points obtained by a skier
	@Test
	public void testSkiingPoints() {
		SkiingResult skiResult1 = new SkiingResult(1, 2.8, 3.4, 4.5, 1.2, 0);
		assertEquals(skiResult1.pointsEarned(), 11.9, .1);
	}
	
	// tests the points obtained by a shooter
	@Test
	public void testShootingPoints() {
		ShootingRound round1 = new ShootingRound(5);
		ShootingRound round2 = new ShootingRound(7);
		ShootingRound round3 = new ShootingRound(6);
		ShootingRound round4 = new ShootingRound(8);
		ShootingResult shootResult1 = new ShootingResult(round1, round2, round3, round4);
		assertEquals(shootResult1.pointsEarned(), 26, 0);
	}
	
	// tests the penalties obtained by a skier
	@Test
	public void testSkiingPenalties() {
		SkiingResult skiResult1 = new SkiingResult(1, 2.8, 3.4, 4.5, 1.2, 0);
		assertEquals(skiResult1.getPenalties(), 0, .1);
	}
	
	// tests the penalties obtained by a shooter
	@Test
	public void testShootingPenalties() {
		ShootingRound round1 = new ShootingRound(5);
		ShootingRound round2 = new ShootingRound(4);
		ShootingRound round3 = new ShootingRound(4);
		ShootingRound round4 = new ShootingRound(5);
		ShootingResult shootResult1 = new ShootingResult(round1, round2, round3, round4);
		assertEquals(shootResult1.getPenalties(), 120, 0);
	}
	
	// tests the final score obtained by a first-place finisher
	@Test
	public void testFirstScore() {
		ShootingRound round1 = new ShootingRound(5);
		ShootingRound round2 = new ShootingRound(4);
		ShootingRound round3 = new ShootingRound(4);
		ShootingRound round4 = new ShootingRound(5);
		ShootingResult shootResult1 = new ShootingResult(round1, round2, round3, round4);
		SkiingResult skiResult1 = new SkiingResult(1, 2.8, 3.4, 4.5, 1.2, 0);
		FinalResult final1 = new FinalResult(shootResult1, skiResult1);
		assertEquals(final1.finalScore(), 121.9, .1);
	}
	
	// tests the final score obtained by a second-place finisher
		@Test
		public void testSecondScore() {
			ShootingRound round1 = new ShootingRound(5);
			ShootingRound round2 = new ShootingRound(4);
			ShootingRound round3 = new ShootingRound(3);
			ShootingRound round4 = new ShootingRound(3);
			ShootingResult shootResult1 = new ShootingResult(round1, round2, round3, round4);
			SkiingResult skiResult1 = new SkiingResult(2, 15.0, 20.0, 14.2, 16.7, 5);
			FinalResult final1 = new FinalResult(shootResult1, skiResult1);
			assertEquals(final1.finalScore(), 383.9, .1);
		}
		
		// tests the final score obtained by a third-place finisher
				@Test
				public void testThirdScore() {
					ShootingRound round1 = new ShootingRound(5);
					ShootingRound round2 = new ShootingRound(4);
					ShootingRound round3 = new ShootingRound(3);
					ShootingRound round4 = new ShootingRound(3);
					ShootingResult shootResult1 = new ShootingResult(round1, round2, round3, round4);
					SkiingResult skiResult1 = new SkiingResult(3, 15.0, 20.0, 14.2, 16.7, 5);
					FinalResult final1 = new FinalResult(shootResult1, skiResult1);
					assertEquals(final1.finalScore(), 387.9, .1);
				}
				
				// tests the final score obtained by a fourth-place finisher
				@Test
				public void testFourthScore() {
					ShootingRound round1 = new ShootingRound(5);
					ShootingRound round2 = new ShootingRound(4);
					ShootingRound round3 = new ShootingRound(3);
					ShootingRound round4 = new ShootingRound(3);
					ShootingResult shootResult1 = new ShootingResult(round1, round2, round3, round4);
					SkiingResult skiResult1 = new SkiingResult(4, 15.0, 20.0, 14.2, 16.7, 5);
					FinalResult final1 = new FinalResult(shootResult1, skiResult1);
					assertEquals(final1.finalScore(), 389.9, .1);
				}
				
				// tests the final score obtained by a further-place finisher
				@Test
				public void testFurtherScore() {
					ShootingRound round1 = new ShootingRound(5);
					ShootingRound round2 = new ShootingRound(4);
					ShootingRound round3 = new ShootingRound(3);
					ShootingRound round4 = new ShootingRound(3);
					ShootingResult shootResult1 = new ShootingResult(round1, round2, round3, round4);
					SkiingResult skiResult1 = new SkiingResult(7, 15.0, 20.0, 14.2, 16.7, 5);
					FinalResult final1 = new FinalResult(shootResult1, skiResult1);
					assertEquals(final1.finalScore(), 390.9, .1);
				}
	
	
	// tests when the original athlete is a better skier
	@Test
	public void testBetterSkier() {
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
		assertTrue(athlete1.betterSkiier(athlete2));
	}
	
	// tests when the original athlete is a worse skier
	@Test
	public void testWorseSkier() {
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
		assertFalse(athlete2.betterSkiier(athlete1));
	}
	
	// tests when the original athlete is a better shooter
	@Test
	public void testBetterShooter() {
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
		assertTrue(athlete1.betterShooter(athlete2));
	}
	
	// tests when the original athlete is a worse shooter
	@Test
	public void testWorseShooter() {
		SkiingResult skiResult1 = new SkiingResult(1, 2.8, 3.4, 4.5, 1.2, 0);
		ShootingRound round1 = new ShootingRound(5);
		ShootingRound round2 = new ShootingRound(4);
		ShootingRound round3 = new ShootingRound(4);
		ShootingRound round4 = new ShootingRound(5);
		ShootingResult shootResult1 = new ShootingResult(round1, round2, round3, round4);
		FinalResult final1 = new FinalResult(shootResult1, skiResult1);
		Athlete athlete1 = new Athlete(final1);
		SkiingResult skiResult2 = new SkiingResult(2, 7, 13.2, 14.5, 8, 2);
		ShootingRound Around1 = new ShootingRound(1);
		ShootingRound Around2 = new ShootingRound(1);
		ShootingRound Around3 = new ShootingRound(1);
		ShootingRound Around4 = new ShootingRound(1);
		ShootingResult shootResult2 = new ShootingResult(Around1, Around2, Around3, Around4);
		FinalResult final2 = new FinalResult(shootResult2, skiResult2);
		Athlete athlete2 = new Athlete(final2);
		assertFalse(athlete2.betterShooter(athlete1));
	}
	
	// tests when the original athlete is better
	@Test
	public void testBetterOverall() {
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
		assertTrue(athlete1.hasBeaten(athlete2));
	}
	
	
	// tests when the original athlete is worse 
	@Test
	public void testWorseOverall() {
		SkiingResult skiResult1 = new SkiingResult(1, 2.8, 3.4, 4.5, 1.2, 0);
		ShootingRound round1 = new ShootingRound(5);
		ShootingRound round2 = new ShootingRound(4);
		ShootingRound round3 = new ShootingRound(4);
		ShootingRound round4 = new ShootingRound(5);
		ShootingResult shootResult1 = new ShootingResult(round1, round2, round3, round4);
		FinalResult final1 = new FinalResult(shootResult1, skiResult1);
		Athlete athlete1 = new Athlete(final1);
		SkiingResult skiResult2 = new SkiingResult(2, 7, 13.2, 14.5, 8, 2);
		ShootingRound Around1 = new ShootingRound(1);
		ShootingRound Around2 = new ShootingRound(1);
		ShootingRound Around3 = new ShootingRound(1);
		ShootingRound Around4 = new ShootingRound(1);
		ShootingResult shootResult2 = new ShootingResult(Around1, Around2, Around3, Around4);
		FinalResult final2 = new FinalResult(shootResult2, skiResult2);
		Athlete athlete2 = new Athlete(final2);
		assertFalse(athlete2.hasBeaten(athlete1));
	}
	
	// tests when the original athlete is worse shooter but better skier 
		@Test
		public void testWorseShooterBetterSkier() {
			SkiingResult skiResult1 = new SkiingResult(1, 2.8, 3.4, 4.5, 1.2, 0);
			ShootingRound round1 = new ShootingRound(0);
			ShootingRound round2 = new ShootingRound(0);
			ShootingRound round3 = new ShootingRound(0);
			ShootingRound round4 = new ShootingRound(0);
			ShootingResult shootResult1 = new ShootingResult(round1, round2, round3, round4);
			FinalResult final1 = new FinalResult(shootResult1, skiResult1);
			Athlete athlete1 = new Athlete(final1);
			SkiingResult skiResult2 = new SkiingResult(2, 7, 13.2, 14.5, 8, 2);
			ShootingRound Around1 = new ShootingRound(1);
			ShootingRound Around2 = new ShootingRound(1);
			ShootingRound Around3 = new ShootingRound(1);
			ShootingRound Around4 = new ShootingRound(1);
			ShootingResult shootResult2 = new ShootingResult(Around1, Around2, Around3, Around4);
			FinalResult final2 = new FinalResult(shootResult2, skiResult2);
			Athlete athlete2 = new Athlete(final2);
			assertTrue(athlete2.hasBeaten(athlete1));
		}
		
		// tests when the original athlete is worse shooter but better skier 
				@Test
				public void testWorseSkierBetterShooter() {
					SkiingResult skiResult1 = new SkiingResult(8, 30, 30, 40, 20, 30);
					ShootingRound round1 = new ShootingRound(5);
					ShootingRound round2 = new ShootingRound(5);
					ShootingRound round3 = new ShootingRound(5);
					ShootingRound round4 = new ShootingRound(5);
					ShootingResult shootResult1 = new ShootingResult(round1, round2, round3, round4);
					FinalResult final1 = new FinalResult(shootResult1, skiResult1);
					Athlete athlete1 = new Athlete(final1);
					SkiingResult skiResult2 = new SkiingResult(1, 1, 1, 1, 1, 0);
					ShootingRound Around1 = new ShootingRound(1);
					ShootingRound Around2 = new ShootingRound(1);
					ShootingRound Around3 = new ShootingRound(1);
					ShootingRound Around4 = new ShootingRound(1);
					ShootingResult shootResult2 = new ShootingResult(Around1, Around2, Around3, Around4);
					FinalResult final2 = new FinalResult(shootResult2, skiResult2);
					Athlete athlete2 = new Athlete(final2);
					assertTrue(athlete2.hasBeaten(athlete1));
				}
	

}
