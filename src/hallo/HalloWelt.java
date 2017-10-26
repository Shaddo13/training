package hallo;

import alkohol.Alkohol;

public class HalloWelt {
	public static void main(String[] args) {
		/*
		 * Hallo Ihr zwei, ich habe zwei neue Aufgaben.
		 * 
		 * 1. Erweiterung der Alkohol Klasse um Alkolarten durch "extends"
		 * 		-Bier extends Alkohol
		 * 		-Wein extends Alkohol
		 * 		-Rum extends Alkohol
		 * 		-Likoer extends Alkohol
		 * 		-Whiskey extends Alkohol
		 * 		-...
		 * 
		 * 2. Eine Klasse Rechner schreiben, die Methoden hat, um reguläre Rechenaufgaben durchzuführen.
		 * 		-Addieren
		 * 		-Subtrahieren
		 * 		-Multiplizieren
		 * 		-Dividieren
		 * 		-...
		 * 
		 */
		System.out.println("Hallo Welt");
		System.out.println("-----------------");
		
		Alkohol x = new Alkohol("Bier", "Wittinger", 5, true);//test comment
		x.setMarke("San Miguel");
//		x.setKannManTrinken(false);
		x.setProzent(0);
		System.out.println("Git Test");
		System.out.println("Art: " + x.getArt() + "\n" + "Marke: " + x.getMarke() + "\n" + "Prozent: " + x.getProzent() + "%" + "\n" + "Trinkbar: " + x.kannManDasTrinken());
	}
}
