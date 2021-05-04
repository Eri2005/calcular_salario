package calculo;

public class Hora {

	public Double salary;
	private Double hoursExtra;
	private Double totalHoursExtra;
	private Double dayWorked;
	private Double valueDay;
	private Double valueHour;
	private Double valueMinute;

	public Hora(Double salary, Double hoursExtra, Double totalHoursExtra, Double dayWorked, Double valueDay,
			Double valueHour, Double valueMinute) {
		super();
		this.salary = salary;
		this.hoursExtra = hoursExtra;
		this.totalHoursExtra = totalHoursExtra;
		this.dayWorked = dayWorked;
		this.valueDay = valueDay;
		this.valueHour = valueHour;
		this.valueMinute = valueMinute;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Double getHoursExtra() {
		return hoursExtra;
	}

	public void setHoursExtra(Double hoursExtra) {
		this.hoursExtra = hoursExtra;
	}

	public Double getTotalHoursExtra() {
		return totalHoursExtra;
	}

	public void setTotalHoursExtra(Double totalHoursExtra) {
		this.totalHoursExtra = totalHoursExtra;
	}

	public Double getDayWorked() {
		return dayWorked;
	}

	public void setDayWorked(Double dayWorked) {
		this.dayWorked = dayWorked;
	}

	public Double getValueDay() {
		return valueDay;
	}

	public void setValueDay(Double valueDay) {
		this.valueDay = valueDay;
	}

	public Double getValueHour() {
		return valueHour;
	}

	public void setValueHour(Double valueHour) {
		this.valueHour = valueHour;
	}

	public Double getValueMinute() {
		return valueMinute;
	}

	public void setValueMinute(Double valueMinute) {
		this.valueMinute = valueMinute;
	}

	public void calDay(Double valueDay) {
		valueDay = salary / 30;
	}

	public void calHours(Double valueHour) {
		valueHour = salary / 220;
	}

	public void calMinutes(Double valueMinute) {
		valueMinute = valueHour / 60;
	}

}
