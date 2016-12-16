package mywork.ooprogramming.ex2;

public class PersonName {
	
	public static void main(String[] args) {
		StringBuffer f = new StringBuffer();
		StringBuffer l = new StringBuffer();
		StringBuffer fn = new StringBuffer();
		
		Person personName = new Person(null, null, 0);
		Person personFullName = new Person(null, 0);

		personName.setFirstName(f.append("Roland"));
		personName.setLastName(l.append("Cuffee"));
		personName.setAge(36);
		
		f = personName.getFirstName();
		l = personName.getLastName();
		
		personFullName.setFullName(fn.append(f + " " + l));
		personFullName.setAge(35);
		fn = personFullName.getFullName();
		
		System.out.println("The First Name is: " + f);
		System.out.println("The Last Name is: " + l);
		System.out.println("The Full Name is: " + fn);
		System.out.println(personName);
		System.out.println(personFullName);
		
	}

}
