package Mkyoung;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {

	public static void main(String[] args) {
	
		File f = new File("d:\\newfile.txt");
		
		try {
			if(f.createNewFile()) {
				System.out.println("File is created!");
			}else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
