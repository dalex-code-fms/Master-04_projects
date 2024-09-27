package fr.fms.poo;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {
	private String lastName;
	private String firstName;
	private int age;
	private String address;
	private static City city;
	private static ArrayList<ArrayList<String>> listOfPersons = new ArrayList<>();
	
	public Person(String lastName, String firstName, int age, String address, City city) {
		setLastName(lastName);
		setFirstName(firstName);
		setAge(age);
		setAddress(address);
		setCity(city);
		listOfPersons.add(new ArrayList<String>(Arrays.asList(lastName, firstName, Integer.toString(age), address, city.displayBornCity())));
	}
	
	public Person(String lastName, String firstName, int age) {
		setLastName(lastName);
		setFirstName(firstName);
		setAge(age);
		setAddress("unknown");
		listOfPersons.add(new ArrayList<String>(Arrays.asList(lastName, firstName, Integer.toString(age))));
	}
	
	public Person(String lastName, String firstName) {
		setLastName(lastName);
		setFirstName(firstName);
		setAge(0);
		setAddress("unknown");
		listOfPersons.add(new ArrayList<String>(Arrays.asList(lastName, firstName)));
	}
	
	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		System.out.println(city);
		if (this.city == null) {
			return String.format("Person [lastName=%s, firstName=%s, age=%d, address=%s] Born%s", getLastName(), getFirstName(), getAge(), getAddress(), "null"); 
		} else {
			return String.format("Person [lastName=%s, firstName=%s, age=%d, address=%s] Born%s", getLastName(), getFirstName(), getAge(), getAddress(), city.displayCity());
		}
	}
	
	// why static ?
	public static void getParis() {
		listOfPersons.forEach((person) -> {
			if (person.get(3).contains("Paris") || person.get(3).contains("paris") || person.get(4).contains("France"))
			System.out.printf("%s, %s, %sans, Habitant %s, %s%n", person.get(0), person.get(1), person.get(2), person.get(3), person.get(4));
		} );
		
	}
}
