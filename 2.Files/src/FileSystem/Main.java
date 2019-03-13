package FileSystem;

import java.io.File;
import java.io.IOException;
/**
 * 
 * @author Aboshameh
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Write.writeFile();
		Read.readFile();
		ByteweiseAuslesen.WriteFile();
	
	
		
		
		File f = new File("C:\\Users\\aboshameh\\Desktop\\OS-Drive\\Workspace-eclipse\\2.Files\\test.txt");
		String strg = "test";
		
	//	EingabeShell.Main.delFile(f, strg);
		
		// Metheden testen 
		// Namen Und Path
	//	System.out.println("the Name of the file is " + f.getName());
	//	System.out.println("The Path of the file is " + f.getPath());
	//	System.out.println("the AbsolutePath of the file is " + f.getAbsolutePath());
	//	System.out.println("ParentFile " + f.getParentFile());
	//	System.out.println("ParentFile2 " + f.getParent());
		
		
	//	System.out.println("this is File " + f.isFile());
	//	System.out.println("this is Folder " + f.isDirectory());
	//	System.out.println("this is the legnth in Bytes " + f.length());
	//	System.out.println("Zeitpunkt der letzten Änderung in Millisekunden seit 1.1.1970!!! " + f.lastModified());
		
		
	//	System.out.println("" + f.list() );
	//	System.out.println("" + f.listFiles() );
	
	//	System.out.println(f.getCanonicalPath());  // diese Methode braucht eine Exception
		
		Read.readFile();
		
		
	}

}
