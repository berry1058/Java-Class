package mywork.inheritance.ex1;

import mywork.encapsulation.ex2.SimpleDate;

public class RogueOneHoliday extends SimpleDate{
int month;
int day;
int year;
String holiday;
	
	public RogueOneHoliday(int m, int d, int y, String h) {
        month = m;
        day = d;
        year = y;
        holiday = h;
    }

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getHoliday() {
		return holiday;
	}

	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}
	
}
