public class MassStartResult extends AbsSkiResult {
	
	int startPosition;
	
	/**
	 * Creates a mass start result object
	 * @param startPosition : the original position of the athlete
	 * @param finishPosition : the final position of the athlete
	 * @param finishTimeL1 : the time the athlete finished the first lap
	 * @param finishTimeL2 : the time the athlete finished the second lap
	 * @param finishTimeL3 : the time the athlete finished the third lap
	 * @param finishTimeL4 : the time the athlete finished the fourth lap
	 * @param numPenalties : the number of penalties the athlete received during the event
	 */
	public MassStartResult (int startPosition, int finishPosition, double finishTimeL1, double finishTimeL2, double finishTimeL3, double finishTimeL4, int numPenalties){
		super(finishPosition, finishTimeL1, finishTimeL2, finishTimeL3, finishTimeL4, numPenalties);
		this.startPosition = startPosition;
	}
}
