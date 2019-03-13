package FileSystem;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteweiseAuslesen {

	public static void WriteFile() throws FileNotFoundException {
		
		FileOutputStream fop = new FileOutputStream("D:\\schreiben.txt");
		
		try {
			fop.write(255);
			byte[] buf = {1, 2, 3};
			fop.write(buf, 0, buf.length);
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  // Byte mit wert 255 schreiben 
		

	}
}
