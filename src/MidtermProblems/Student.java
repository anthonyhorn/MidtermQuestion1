package MidtermProblems;

public class Student extends Person {

	String classStatus;

	@Override
	public String toString() {
		return this.getClass().getName() + name;
	}
}
