package meineTeste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.ArrayList;

public class Main {
	/**
	 * @param args
	 * @throws IOException
	 * @throws Exception
	 */

	public static void main(String[] args) throws IOException {

	
		
 		creatDirectory("D:\\New Folder");
		deleteDirectory("D:\\New Folder");
		 creatFile("D:\\New Folder\\ahmad.txt");
		 writeFile("D:\\New Folder\\ahmad.txt","Never Give UP!");
		 readFile("D:\\New Folder\\ahmad.txt");
		
//		deleteDirectory("D:\\New Folder\\ahmad.txt");

	}

	public static void readFile(String target) throws IOException {

		/*
		 * this Method read the text from a your File and save it in an Array
		 */

		File file = new File(target);

		if (file.exists()) {

			try {

				ArrayList<String> fileLines = new ArrayList<String>();
				BufferedReader br = new BufferedReader(new FileReader(target));

				String currentline = br.readLine();

				while (currentline != null) {
					fileLines.add(currentline);
					currentline = br.readLine();
				}

				br.close();
				System.out.println(fileLines);

			} catch (FileNotFoundException e) {

			}

		} else {

			System.out.println("File is not found");

		}

	}

	/**
	 * 
	 * @param target
	 * @param qoute
	 * @throws FileNotFoundException
	 */
	public static void writeFile(String target, String qoute) throws FileNotFoundException {

		File file = new File(target);
		if (file.exists()) {

			PrintWriter out = new PrintWriter(new PrintWriter(target));

			out.println(qoute);
			out.println("Ahmad Abo Shameh");
			out.close();
			System.out.println("Done!");

		}
	}

	public static boolean creatFile(String Name) throws IOException {

		File file = new File(Name);

		if (!file.exists()) {

			System.out.println("creating File: " + file.getName());

			try {

				file.createNewFile();
				return true;

			} catch (SecurityException se) {

			}

		} else {
			System.out.println("Folder already exists!");
		}
		return false;

	}

	public static boolean creatDirectory(String Name) {

		File file = new File(Name);

		if (!file.exists()) {

			System.out.println("creating directory: " + file.getName());

			try {

				file.mkdir();
				return true;

			} catch (SecurityException se) {

			}

		} else {
			System.out.println("Folder already exists!");
		}
		return false;
	}

	public static boolean deleteDirectory(String Name) {

		File file = new File(Name);

		if (file.exists()) {
			file.delete();
			System.out.println("The File: " + Name + " . has been deleted");
			return true;
		} else {
			System.out.println("Folder is not there!");
			return false;

		}

	}
}
