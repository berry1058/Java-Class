package mywork.methods.ex3;

import java.util.Date;

public class SimpleDate {

	int day;
	int month;
	int year;
	
	String d;
	String m;
	String y;
	
	public SimpleDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	//	helper();
	}
	public SimpleDate(String m, String d, String y) {
		this.d = d;
		this.m = m;
		this.y = y;
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

	public String getD() {
		return d;
	}

	public void setD(String day) {
		this.d = d;
	}

	public String getM() {
		return m;
	}

	public void setM(String month) {
		this.m = m;
	}

	public String getY() {
		return y;
	}

	public void setY(String year) {
		this.y = y;
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
