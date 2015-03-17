package MidtermProblems;

public class Faculty extends Employee{

	String officeHours; //example. 6-8pm
	String rank;
	
	@Override
	public String toString(){
		return this.getClass().getName()+name;
	}
}
