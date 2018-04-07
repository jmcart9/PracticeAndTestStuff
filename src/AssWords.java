import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//The program returns every English word which contains "ass".
public class AssWords {

	public static void main(String[] args) {
		FileInputStream inputStream = null;
		Scanner sc = null;
		try {
		    inputStream = new FileInputStream("words.txt");
		    sc = new Scanner(inputStream, "UTF-8");
		    while (sc.hasNextLine()) {
		        String line = sc.nextLine();
		        if (line.contains("ass")) {
		        	System.out.println(line);
		        }
		    }
		    if (sc.ioException() != null) {
		        throw sc.ioException();
		    }
		} 
		catch(FileNotFoundException e){
			System.out.println("file not found");
		}
		catch(IOException e) {
			System.out.println("IO exception");
		}
		finally {
		    if (inputStream != null) {
		        try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		    }
		    if (sc != null) {
		        sc.close();
		    }
		}
	}
}
