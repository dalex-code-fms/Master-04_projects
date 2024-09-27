package fr.fms.entities;

public class Commerciale extends Personne{
	private double ca;
	private String enterprise;
	
	public static final double MIN_CA = 3.5;
	
	public Commerciale(String lastName, String firstName, int age, String liveIn, Capital capital, String enterprise, double ca) {
		super(lastName, firstName, age, liveIn, capital);
		setEnterprise(enterprise);
		setCa(ca);
	}

	public double getCa() {
		return ca;
	}

	public void setCa(double ca) {
		if (ca < 0) {
			System.out.println("\n% du chiffre d'affaire inférieur à 0 impossible");
			this.ca = MIN_CA;
		} else {
			this.ca = ca;			
		}
	}
	
	public String getEnterprise() {
		return enterprise;
	}
	
	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}
	
	public String toString() {
		return String.format("%s, %s, %dans, habitant %s, Ville de naissance : %s, Enterprise : %s,  %% CA : %1.1f", getLastName(), getFirstName(), getAge(), getLiveIn(), getCapital(), enterprise, ca);
	}
	
	@Override
	public String remuneration() {
		int calc = (int)(50000 * (ca / 100)); // (ca / 100) convert CA in decimal number example: if CA = 5 (ca / 100) = 0.05
		return String.format("salaire mensuel de %s %s : %,d", getFirstName(), getLastName(), calc);
	}
}
