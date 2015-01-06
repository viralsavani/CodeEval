import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ArmstrongNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {

		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			int number = Integer.parseInt(line);
			int numberTemp = 0;
			while(number > 0){
				int lastDigit = number % 10;
				numberTemp = (int) (numberTemp + Math.pow(lastDigit, (line.length())));
				number = number / 10;
			}

			if(numberTemp == Integer.parseInt(line)){
				System.out.println("True");
			}else{
				System.out.println("False");
			}

		}
	}

}
