package hallo;

import alkohol.Alkohol;

public class HalloWelt {
	public static void main(String[] args) {
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
