package fr.fms.entities;

public class Employe extends Personne{
	private String enterprise;
	private int salary;
	
	public static final int SMIC = 1400;
	
	public Employe(String lastName, String firstName, int age, String liveIn, Capital capital, String enterprise, int salary) {
		super(lastName, firstName, age, liveIn, capital);
		setEnterprise(enterprise);
		setSalary(salary);
	}
	
	public Employe(String lastName, String firstName, int age, String liveIn, Capital capital, String enterprise) {
		super(lastName, firstName, age, liveIn, capital);
		setEnterprise(enterprise);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if (salary <= 0) {
			System.out.println("\nLe salaire ne peut être inférieur à 0");
			this.salary = SMIC;
		} else {
			this .salary = salary;			
		}
	}

	public String getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}
	
	public String toString() {
		return String.format("%s, %s, %dans, habitant %s, Ville de naissance : %s, Enterprise : %s, salaire : %,d", getLastName(), getFirstName(), getAge(), getLiveIn(), getCapital(), enterprise, salary);
	}
	
	@Override
	public String remuneration() {
		int calc = salary - (int)(salary * 0.2);
		return String.format("salaire mensuel de %s %s : %,d", getFirstName(), getLastName(), calc);
	}
}
