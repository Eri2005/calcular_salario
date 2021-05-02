package calculo;

import java.util.Calendar;

public class Hora {
		
	int hours;
	int minute;
	int second;
	public Hora(int hours, int minute, int second) {
		super();
		this.hours = hours;
		this.minute = minute;
		this.second = second;
	
	}
	
	private static Hora getDif(long totalHours) {
		int timeInSeconds = (int) totalHours / 1000;
		int hours, minutes, seconds;
		hours = timeInSeconds / 3600;
		timeInSeconds = timeInSeconds - (hours * 3600);
		minutes = timeInSeconds / 60;
		timeInSeconds = timeInSeconds - (minutes * 60);
		seconds = timeInSeconds;
		
		Hora hora = new Hora(hours, minutes, seconds);
		return hora;
	}
	
	public int getHours() {
		return hours;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		this.second = second;
	}
	
	public Calendar t (Hora hora) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR_OF_DAY, hours);
		c.set(Calendar.MINUTE, minute);
		c.set(Calendar.SECOND, second);
		
		c.add(Calendar.HOUR_OF_DAY, hora.hours);
		c.add(Calendar.MINUTE, hora.minute);
		c.add(Calendar.SECOND, hora.second);
		
		return c;
	
	}
}
