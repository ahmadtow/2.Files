package FileSystem;

import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void writeFile() {
		
		FileWriter fw;
		try {
			fw = new FileWriter("D:\\newfile.txt");
			fw.write("enaio enaio");    
	         fw.close(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
            
       
	}
}
