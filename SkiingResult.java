package Homework1;

public class SkiingResult implements IEvent {
	
	int finishPosition;
	double finishTimeL1;
	double finishTimeL2;
	double finishTimeL3;
	double finishTimeL4;
	int numPenalties;
	
	public SkiingResult (int finishPosition, double finishTimeL1, double finishTimeL2, double finishTimeL3, double finishTimeL4, int numPenalties){
		this.finishTimeL1 = finishTimeL1;
		this.finishTimeL2 = finishTimeL2;
		this.finishTimeL3 = finishTimeL3;
		this.finishTimeL4 = finishTimeL4;
		this.finishPosition = finishPosition;
		this.numPenalties = numPenalties;
	}
	
	public double pointsEarned() {
		return finishTimeL4 + finishTimeL3 + finishTimeL2 + finishTimeL1;
	}
	
	public double getPenalties() {
		return this.numPenalties * 5;
	}

}
