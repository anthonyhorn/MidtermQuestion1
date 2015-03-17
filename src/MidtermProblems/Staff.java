package MidtermProblems;

public class Staff extends Employee {

	String title;

	@Override
	public String toString() {
		return this.getClass().getName() + name;
	}
}
