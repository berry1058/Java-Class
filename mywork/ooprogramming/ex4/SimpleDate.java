package mywork.ooprogramming.ex4;

import java.util.Date;



public class SimpleDate {

	int day;
	int month;
	int year;
	
	public SimpleDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		helper();
	}

	public SimpleDate(int day, int month) {
		this.day = day;
		this.month = month;
		helper();
	}

	public SimpleDate(int day) {
		this.day = day;
		helper();
	}
	

	public SimpleDate() {
		helper();
	}
	
	private void helper(){
		
		Date now = new Date();
		this.day = now.getDate();
		this.month = now.getMonth() + 1;
		this.year = now.getYear() + 1900;
		
		
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String toString(){
		StringBuffer sb = new StringBuffer(10);
		String sep = "/";
		sb.append(month).append(sep);
		sb.append(day).append(sep);
		sb.append(year);
		
		
		
		return sb.toString();
	}
	
	
	
	
	
}
