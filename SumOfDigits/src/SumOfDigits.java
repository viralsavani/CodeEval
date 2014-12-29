import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class SumOfDigits {

	public static void main(String[] args) throws IOException {
	
		
		File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
    		int number = Integer.parseInt(line);
    		int temp ;
    		int sum = 0;
    		for(int i = 0; i < line.length(); i++){
    			temp = number % 10;
    			number = number / 10;
    			sum = sum + temp;
    		}
    		System.out.println(sum);
        }
		
	}

}
