package model;

import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Schreibt neu erspielte Highscores in die Highscore-Liste
 * @author Marianne Krohn
 *
 */
public class HighscoreWriter {
	
	public void writeHighscores(ArrayList<Highscore> scores, String filePath) {
		
//		PrintWriter prnt = null;
		
		try {
			PrintWriter prnt = new PrintWriter(filePath);
			
			for(Highscore s : scores) {
				prnt.write(s.name + ";" + s.score + System.lineSeparator());
//				System.out.println(s.name + ";" + s.score);
				
			}
			prnt.flush();
			prnt.close();
		}
		catch(Exception e) {
			System.out.println("Fehler");}
		}

}
