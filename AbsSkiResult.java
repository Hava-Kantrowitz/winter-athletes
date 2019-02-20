import java.util.LinkedList;

abstract public class AbsSkiResult implements IEvent {

	int finishPosition;
	LinkedList<Double>finishTime = new LinkedList<Double>();
	int numPenalties;
	
	/**
	 * Creates an abstract ski result object
	 * @param finishPosition : the position of the athlete at the end of the race
	 * @param finishTimeL1 : the time the athlete completed the first lap
	 * @param finishTimeL2 : the time the athlete completed the second lap
	 * @param finishTimeL3 : the time the athlete completed the third lap
	 * @param finishTimeL4 : the time the athlete completed the fourth lap
	 * @param numPenalties : the number of penalties the athlete received during the race
	 */
	public AbsSkiResult (int finishPosition, double finishTimeL1, double finishTimeL2, double finishTimeL3, double finishTimeL4, int numPenalties){
		finishTime.add(finishTimeL1);
		finishTime.add(finishTimeL2);
		finishTime.add(finishTimeL3);
		finishTime.add(finishTimeL4);
		this.finishPosition = finishPosition;
		this.numPenalties = numPenalties;
	}
	
	/**
	 * Calculates the points earned during the skiing event
	 * @return double : the points earned by the athlete
	 */
	public double pointsEarned() {
		double runningSum = 0;
		for(Double n : finishTime) {
			runningSum = runningSum + n;
		}
		
		return runningSum;
	}
	
	/**
	 * Calculates the points taken off due to penalties during the skiing event
	 * @return double : the points to be subtracted due to penalties
	 */
	public double getPenalties() {
		return this.numPenalties * 5;
	}


}
