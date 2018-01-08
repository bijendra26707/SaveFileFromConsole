package SaveConsoleData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadDataFromFile {

	public void readFileData(String file) throws IOException {
		FileReader freader = new FileReader(System.getProperty("user.dir") + "//ConsoleInput.txt");
		BufferedReader br = new BufferedReader(freader);
		String s;
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
		freader.close();
	}

	public void writeFileData(String file) throws IOException {
		ReadDataFromFile dataFromFile = new ReadDataFromFile();
		dataFromFile.readFileData(System.getProperty("user.dir") + "//ConsoleInput.txt");
		try {

			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String firstName = "";
			String lastName = "";
			
			String marks = "";
			PrintWriter out = new PrintWriter(new FileWriter(System.getProperty("user.dir") + "//ConsoleInput.txt"));

			do {
				firstName = in.readLine();
				if(!firstName.equalsIgnoreCase("exit")){
			
				
				lastName = in.readLine();

				marks = in.readLine();
				out.println("\n");
				out.println("Student Name: " + firstName + " " + lastName);
				out.println("First Name: " + firstName);
				out.println("Last Name: " + lastName);
				out.println("Marks: " + marks);
				}
			} while (!(firstName.equalsIgnoreCase("exit")));

			out.close();
		} catch (

		IOException e1) {
			System.out.println("Error during reading/writing");
		}

	}
}
