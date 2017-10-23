package alkohol;

public class Alkohol {
	String art;
	String marke;
	int prozent;
	boolean kannManTrinken;
	public Alkohol(String art, String marke, int prozent, boolean kannManTrinken) {
		super();
		this.art = art;
		this.marke = marke;
		this.prozent = prozent;
		this.kannManTrinken = kannManTrinken;
	}

	public void setArt(String art) {
		this.art = art;
	}
	public void setKannManTrinken(boolean kannManTrinken) {
		this.kannManTrinken = kannManTrinken;
	}
	public void setMarke(String marke) {
		this.marke = marke;
	}
	public void setProzent(int prozent) {
		this.prozent = prozent;
	}
	
	public String getArt() {
		return art;
	}
	public String getMarke() {
		return marke;
	}
	public int getProzent() {
		return prozent;
	}
	public boolean isKannManTrinken() {
		return kannManTrinken;
	}
	public String kannManDasTrinken() {
		if(marke.equals("San Miguel")) {
			return "Nein, das ist kein gute(r/s) "+art+"! Ist das "+marke+"?";
		} else if(kannManTrinken) {
			return "Ja, das ist ein richtige(r/s) "+art+"!";
		} else {
			return "Nein, das ist kein gute(r/s) "+art+"!";
		}
	}
}