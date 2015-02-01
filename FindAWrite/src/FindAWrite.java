import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FindAWrite {

	public static void main(String[] args) throws NumberFormatException, IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String digits = line.substring(line.lastIndexOf("|")+1, line.length()).trim();
    		String[] digitsArray = digits.split("\\s");
    		
    		for(int i = 0; i < digitsArray.length; i++){
    			int number = Integer.parseInt(digitsArray[i]);
    			
    			System.out.print(line.charAt(number-1));
    		}
    		System.out.println();
        }				
	}
}
