package FileSystem;
/**
 * das Program liest aus eine Text Datei 
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	
	public static void readFile() throws IOException {
		
	FileReader fr;
	try {
		
		fr = new FileReader("C:\\Users\\aboshameh\\Desktop\\OS-Drive\\Workspace-eclipse\\JAXB\\Test.xml");
		int i;    
	    while((i=fr.read())!=-1)    
	    System.out.print((char)i);    
	    fr.close();   
		
	} catch (FileNotFoundException e) {

		e.printStackTrace();
	}

	   
    
}
	
}
