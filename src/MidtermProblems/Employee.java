package MidtermProblems;

import java.util.Date;

public class Employee extends Person {

	String office;
	Double salary;
	Date dateHired;

	@Override
	public String toString() {
		return this.getClass().getName() + name;
	}

}