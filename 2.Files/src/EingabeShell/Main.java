package EingabeShell;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Aboshameh
 * 
 *  Command Line Interface -Uebung  Fileverarbeitung 
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		// Konstruktur File(".") w�rde das aktuelle Verzeichnis liefern
		File f = new File("d:\\");
		System.out.print(f.getCanonicalPath()+" > ");
		BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
		String eingabe = din.readLine();


		
		File b = null;
		String mdName = eingabe.substring(3, eingabe.length());
		makeDir(f, mdName);
		System.out.println(makeDir(b,eingabe));
	
		delFileto(f, mdName);
		
	}

	// Methode zum Anzeigen der Inhalte eines Verzeichnis
	
	
	// Methode zum Anlegen eines Verzeichnisses
	
public static boolean makeDir(File f, String dirName) {

	File newDir = new File(f, dirName);		//einen Objekt von der Klasse File erstellen 
	if(newDir.mkdir()) {
		System.out.println("Verzeichnis " + dirName + " angelegt" );
	}else {
		System.out.println("Verzeichnis " + dirName + " nicht angelegt" );
	}
	return true;
}
	
	// Methode zum Loeschen eines Files

public static void delFile (File f1, String fileName) {
	
	File[] liste = f1.listFiles();
	boolean found = false;
	boolean deleted =false;
	for(int i=0; i < liste.length; i++) {
		if (liste[i].getName().equals(fileName)){
			found = true;
			System.out.println("\t" + liste[i].getName());
	}
	
	
}
}
	
	// Methode zum Aendern des aktuellen Verzeichnisses

	
	// Anzeige des Inhalts eines Files
	
	// Kopieren eines Files

//Methode zum Loeschen eines Files
	public static void delFileto(File fl, String fileName){
		File[] liste = fl.listFiles();
		boolean found = false;
		boolean deleted = false;
		for(int i=0; i<liste.length; i++){
			if (liste[i].getName().equals(fileName)){
				found = true;
				System.out.println("\t" + liste[i].getName());
			}
		}
		if (found){
			File delFile = new File(fl.getAbsolutePath()+"\\"+fileName);
			// System.out.println(delFile.getName());
			deleted = delFile.delete();
			System.out.println("Datei wurde geloescht "+deleted);
		}else{
			System.out.println("Datei oder Verzeichnis nicht gefunden");
		}
		//return found;
	}






}



