package Mkyoung;
/**
 * 	Das Program liest aus einem Textdatei
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample1 {

	private static final String fileName = "C:\\Users\\aboshameh\\Desktop\\OS-Drive\\Workspace-eclipse\\2.Files\\newFile.txt";

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = null;
		FileReader fr =null;
		
		//*************************************//
		
		//br = new BufferedReader(new FileReader(FILENAME));
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
		
			String sCurrentLine;
			
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		
		

	}

}
}
