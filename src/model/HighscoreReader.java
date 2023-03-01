package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Liest die Highscores aus einer externen Datei und wandelt sie in eine ArrayList
 * von Highscore-Objekten um
 * @author Marianne Krohn
 *
 */
public class HighscoreReader {

	public ArrayList<Highscore> readHighscores(String filePath) {
		
		ArrayList<Highscore> scores = new ArrayList<>();
		
		File liste = new File(filePath);
		try {
			FileReader fReader = new FileReader(liste);
			BufferedReader bReader = new BufferedReader(fReader);
			
			while(bReader.ready()) {
				String line = bReader.readLine();
				
// 				Alternative
				
//				String name = line.split(";")[0];
//				int score = Integer.parseInt(line.split(";")[1]);
//				Highscore h = new Highscore(name, score);
//				scores.add(h);
				
				scores.add(parseHighscore(line));
				
				
			}
			bReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Fehler: Datei nicht vorhanden.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Fehler: Datei kann nicht gelesen werden.");
		}
		return scores;
		
	}
	
	/**
	 * Zeichenkette in Highscore-Objekt umwandeln
	 * @param line eingelesene Zeile
	 * @return Highscore-Objekt
	 */
	private Highscore parseHighscore(String line) {
		Highscore result;
		String[] parts = line.split(";");
		result = new Highscore(parts[0], Integer.parseInt(parts[1]));
		
		return result;
	}


}
