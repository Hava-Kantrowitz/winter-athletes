/**
 * This class models a skier's results in the single skiier event
 * @author havak
 *
 */
public class SkiingResult extends AbsSkiResult {
	
	/**
	 * Creates a ski result object
	 * @param finishPosition : the position of the athlete at the end of the race
	 * @param finishTimeL1 : the time the athlete completed the first lap
	 * @param finishTimeL2 : the time the athlete completed the second lap
	 * @param finishTimeL3 : the time the athlete completed the third lap
	 * @param finishTimeL4 : the time the athlete completed the fourth lap
	 * @param numPenalties : the number of penalties the athlete received during the race
	 */
	public SkiingResult (int finishPosition, double finishTimeL1, double finishTimeL2, double finishTimeL3, double finishTimeL4, int numPenalties){
		super(finishPosition, finishTimeL1, finishTimeL2, finishTimeL3, finishTimeL4, numPenalties);
	}
}
