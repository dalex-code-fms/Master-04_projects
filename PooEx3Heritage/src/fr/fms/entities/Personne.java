package fr.fms.entities;

public abstract class Personne {
	private String lastName;
	private String firstName;
	private int age;
	private String liveIn;
	private Capital capital;
	
	public Personne(String lastName, String firstName, int age, String liveIn, Capital  capital) {
		setLastName(lastName);
		setFirstName(firstName);
		setAge(age);
		setLiveIn(liveIn);
		setCapital(capital);
	}
	
	public Capital getCapital() {
		return capital;
	}

	public void setCapital(Capital capital) {
		this.capital = capital;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLiveIn() {
		return liveIn;
	}

	public void setLiveIn(String liveIn) {
		this.liveIn = liveIn;
	}
	
	public abstract String remuneration();
}
