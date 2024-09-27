package fr.fms.entities;

public class Test {

	public static void main(String[] args) {
		// 3.2
		Employe gate = new Employe("Gate", "Bill", 65, "aux USA", new Capital("Washington", "USA", 7600000, "W-M"), "Fondation B&M", 1000000);
		Employe musk = new Employe("Musk", "Elon", 49, "à Palo Alto", new Capital("Pretoria", "Afrique du Sud", 800000), "Tesla", 1500000);
		
		System.out.println(gate);
		System.out.println(musk);
		
		// 3.3
		Commerciale dupont = new Commerciale("Dupont", "Robert", 50, "rue des roisiers à Toulouse", new Capital("Limoges", "France", 133000), "brico", 5.0);
		
		System.out.println(dupont);
		
		// 3.4
		Employe michelle = new Employe("Gislaine", "Michelle", 65, "aux USA", new Capital("Washington", "USA", 7600000, "W-M"), "Fondation B&M", -1);
		System.out.println(michelle);
		
		Commerciale richard = new Commerciale("Richard", "Michel", 75, "à Bordeaux", new Capital("Bayonne", "France", 49200), "brico", -1);
		System.out.println(richard);
		
		// 3.5
		Employe arnault = new Employe("Arnault", "Bernard", 75, "à Paris", new Capital("Roubaix", "France"), "LVMH", 3500000);
		System.out.println(arnault);
	}

}
