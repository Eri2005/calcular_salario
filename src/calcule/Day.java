package calcule;

public class Day {

	private Integer entrance;
	private Integer initialMinute;
	private Integer entranceLunch;
	private Integer minuteLunch;
	private Integer returnLunch;
	private Integer finalLunch;
	private Integer finalWork;
	private Integer finalMinute;
	private Integer hoursTotal;

	public Day(Integer entrance, Integer initialMinute, Integer entranceLunch, Integer minuteLunch, Integer returnLunch,
			Integer finalLunch, Integer finalWork, Integer finalMinute) {
		super();
		this.entrance = entrance;
		this.initialMinute = initialMinute;
		this.entranceLunch = entranceLunch;
		this.minuteLunch = minuteLunch;
		this.returnLunch = returnLunch;
		this.finalLunch = finalLunch;
		this.finalWork = finalWork;
		this.finalMinute = finalMinute;
	}

	public Integer getEntrance() {
		return entrance;
	}

	public void setEntrance(Integer entrance) {
		this.entrance = entrance;
	}

	public Integer getInitialMinute() {
		return initialMinute;
	}

	public void setInitialMinute(Integer initialMinute) {
		this.initialMinute = initialMinute;
	}

	public Integer getEntranceLunch() {
		return entranceLunch;
	}

	public void setEntranceLunch(Integer entranceLunch) {
		this.entranceLunch = entranceLunch;
	}

	public Integer getMinuteLunch() {
		return minuteLunch;
	}

	public void setMinuteLunch(Integer minuteLunch) {
		this.minuteLunch = minuteLunch;
	}

	public Integer getReturnLunch() {
		return returnLunch;
	}

	public void setReturnLunch(Integer returnLunch) {
		this.returnLunch = returnLunch;
	}

	public Integer getFinalLunch() {
		return finalLunch;
	}

	public void setFinalLunch(Integer finalLunch) {
		this.finalLunch = finalLunch;
	}

	public Integer getFinalWork() {
		return finalWork;
	}

	public void setFinalWork(Integer finalWork) {
		this.finalWork = finalWork;
	}

	public Integer getFinalMinute() {
		return finalMinute;
	}

	public void setFinalMinute(Integer finalMinute) {
		this.finalMinute = finalMinute;
	}

	public void calHours(Integer hoursTotal) {
		this.hoursTotal += (entrance * 60 * 60) + (initialMinute * 60);
		
	}
}
