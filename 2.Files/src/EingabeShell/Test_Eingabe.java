package EingabeShell;
import java.io.*;
public class Test_Eingabe {
	// Command Line Interface - Uebung Fileverarbeitung Part 7

	/**
	 * @author schmietendorfA
	 *
	 */

	public static void main(String[] args) throws IOException{
			// Konstruktur File(".") w�rde das aktuelle Verzeichnis liefern
			File f = new File("d:\\");
			System.out.print(f.getCanonicalPath()+" > ");
			BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
			String eingabe = din.readLine();
			while (!eingabe.equals("niemals")){
				
				// Eingabe von "dir" ----------------------
				if (eingabe.substring(0,3).equals("dir")){
					showDirectory(f);				
				}
				
				// Eingabe von "del" ----------------------
				else if (eingabe.substring(0,3).equals("del")){
					String fileName = eingabe.substring(4, eingabe.length());
					delFile(f, fileName);
				}
				
				// Eingabe von "cd" -----------------------
				else if (eingabe.substring(0,2).equals("cd")){
					String dirName = eingabe.substring(3, eingabe.length());
					f= changeDir(f, dirName);
				}	
				
				// Anlegen eines Verzeichnisses "md" ------
				else if (eingabe.substring(0,2).equals("md")){
					String mdName = eingabe.substring(3, eingabe.length());
					makeDir(f, mdName);
				}
				
				// Ausgabe eines Dateiinhalts "cat" ------
				else if (eingabe.substring(0,3).equals("cat")){
					String fileName = eingabe.substring(4, eingabe.length());
					showFile(f, fileName);
				}
				System.out.print(f.getCanonicalPath()+" > ");
				eingabe = din.readLine();
			}
			System.out.print("Herzlichen Dank f�r die Verwendung - Andreas Schmietendorf");	
		}
		
		// Methode zum Anzeigen der Inhalte eines Verzeichnis
		public static void showDirectory(File f){
			File[] liste = f.listFiles();
			// Zaehler f�r File bzw. Verzeichniseintraege
			int fileCount = 0;
			int dirCount = 0;
			for(int i=0; i<liste.length; i++){
				if (liste[i].isDirectory()){
					dirCount++;
					System.out.print("<DIR>\t\t");
				}else{
					fileCount++;
					System.out.print("\t"+liste[i].length());
				}
				System.out.println("\t" + liste[i].getName());
			}
			System.out.println(fileCount+" Dateien, " + dirCount + " Verzeichnisse");
		}
		
		// Methode zum Anlegen eines Verzeichnisses
		public static boolean makeDir(File f, String dirName){
			File newDir = new File(f, dirName);
			if(newDir.mkdir()){
				System.out.println("Verzeichnis " + dirName + " angelegt");
			}else{
				System.out.println("Verzeichnis " + dirName + " nicht angelegt");
			}
			return true;
		}
		
		// Methode zum Loeschen eines Files
		public static void delFile(File fl, String fileName){
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

		// Methode zum Aendern des aktuellen Verzeichnisses
		public static File changeDir(File fd, String dirName)throws IOException{
			if (dirName.equals("..")){
				File f2 = new File(fd.getCanonicalPath());
				if (f2.getParent()!=null){
					fd = new File(f2.getParent());
				}
			}else{
				File[] liste = fd.listFiles();
				boolean found = false;
				for(int i=0; i<liste.length; i++){
					if (liste[i].getName().equals(dirName)){
						found = true;
					}
				}
				if (found){
					fd = new File(fd.getAbsolutePath(), dirName);
				}else{
					System.out.println("Das System kann den angegebenen Pfad nicht finden.");
				}
			}
			return fd;
		}

		// Anzeige des Inhalts eines Files
		public static void showFile(File fs, String fName){
			int c;
			try{
				System.out.println("FILEAUSGABE"+"\n");
				FileReader fr = new FileReader(fs.getAbsolutePath()+"\\"+fName);
				while ((c = fr.read()) != -1){
					System.out.print((char)c);
				}
				fr.close();
				System.out.println("\n");
			} 
			catch (IOException e) {
				System.out.println("Fehler");
			}

		}
		
		// Kopieren eines Files
		public static void copyFile(String source, String destin){
			//FileInputStream  fileInput = null;    
			//FileOutputStream fileOutput = null;
			byte[] buffer = new byte[0xFFFF];
			try {
				FileInputStream fileInput = new FileInputStream(source);      
				FileOutputStream fileOutput = new FileOutputStream(destin);      
				int len = fileInput.read(buffer);
				for (int i = 0; i<len; i++){
					fileOutput.write( buffer, 0, len );
				}
				
			}   
			catch (IOException e){
				e.printStackTrace();    
			}
		}
	}



