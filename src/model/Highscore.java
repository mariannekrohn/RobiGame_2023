package model;

/**
 * Dient der Verwaltung der Highscore_Daten
 * @author Marianne Krohn
 *
 */
public class Highscore {
	String name;
	int score;
	
	/**
	 * Konstruktor
	 * @param name Spielername
	 * @param score Spieler-Score
	 */
	public Highscore(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	public String toString() {
		return name + ": " + score;
		}

}
