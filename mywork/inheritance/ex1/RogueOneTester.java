package mywork.inheritance.ex1;

import mywork.encapsulation.ex2.SimpleDate;

public class RogueOneTester {

	public static void main(String[] args) {

		RogueOneHoliday dates [] = {
			    new RogueOneHoliday(12, 16, 2016, "Rogue One Holiday"), 
			    
		
		
	};
		
		for(int i = 0; i < dates.length; i++){
            System.out.println(dates[i]);
            System.out.println("Month:     " + dates[i].getMonth());
            System.out.println("Day: " + dates[i].getDay());
            System.out.println("Year:  " + dates[i].getYear());
            System.out.println("Holiday: " + dates[i].getHoliday());
            System.out.println();

}
}
}