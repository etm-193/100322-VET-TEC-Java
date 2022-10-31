package day01;

import java.util.HashSet;

public class HashCodePractice {
	
	public static void main(String[] args) {
		Toy toy1 = new Toy("rope", false, 32.0);
		Cat myCat = new Cat("Boots", "Erica", toy1);
		// method 1
		System.out.println("myCat " + myCat);
		System.out.println(myCat.hashCode());
		Toy toy2 = new Toy("mouse", true, 1.0);
		Cat otherCat = new Cat("Garfield","Jonathan Q. Arbuckle", toy2);
		System.out.println("Garfield: " + otherCat);
		System.out.println(otherCat.hashCode());
		// change contents
		myCat.name = "Pinky";

		System.out.println("myCat " + myCat);
		System.out.println(myCat.hashCode());
		
		
		// HashSet
		HashSet<Cat> cats = new HashSet<>();
		cats.add(otherCat);
		cats.add(myCat);
		cats.add(new Cat("Jocey", "Kelvin", toy1));
		cats.add(new Cat("Gaia", "Enesto", toy2));
		cats.add(new Cat("Sirious", "Dylan", toy1));
		cats.add(new Cat("Lenny", "Brian", toy2));
		cats.add(new Cat("Carol Baskin", "Jordan", toy1));
		
		System.out.println(cats);
		
		// contains
		// won't work without .hashCode() implemented -- breaking equals contract
		boolean isBoots = cats.contains(new Cat("Boots", "Erica", toy2));
		System.out.println("Is Boots in the set? " + isBoots);
		
		// 
		
	}

}
