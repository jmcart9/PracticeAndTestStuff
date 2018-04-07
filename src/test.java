import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class test {
	
	public static void main(String[] args)  {
		
		String fileOld = "C:/Users/Jorvon/Documents/quotes.txt";
		String fileNew = "C:/Users/Jorvon/Documents/quotes2.txt";
		try{
			
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileNew));
			BufferedReader bufferedReader = new BufferedReader(new FileReader(fileOld));
		
			System.out.println("gg");
			
			bufferedReader.close();
			bufferedWriter.close();
		}
		catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileOld + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileOld + "'");                  
        }	
		
	}	
}
