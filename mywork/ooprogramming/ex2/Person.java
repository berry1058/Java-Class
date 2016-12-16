package mywork.ooprogramming.ex2;

public class Person {

	StringBuffer firstName = null;
	StringBuffer lastName = null;
	int age = 0;
	StringBuffer fullName = null;
	public Person(StringBuffer firstName, StringBuffer lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public Person(StringBuffer fullName, int age) {
		super();
		this.fullName = fullName;
		this.age = age;
	}

	public StringBuffer getFirstName() {
		return firstName;
	}

	public void setFirstName(StringBuffer firstName) {
		this.firstName = firstName;
	}

	public StringBuffer getLastName() {
		return lastName;
	}

	public void setLastName(StringBuffer lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public StringBuffer getFullName() {
		return fullName;
	}

	public void setFullName(StringBuffer fullName) {
		this.fullName = fullName;
	}
	
	
	
}
