import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class HappyNumber {

	public static void main(String[] args) throws IOException {


		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			int number = Integer.parseInt(line);
			int lastDigit;
			int happyNumber = 0;
			int counter = 21;
			while(counter > 0 ){
				lastDigit = number % 10;
				happyNumber = (lastDigit * lastDigit) +happyNumber;
				number = number / 10;
				if(number == 0){
					if(happyNumber == 1){
						break;
					}else{
						number = happyNumber;
						happyNumber = 0;
						counter--;
					}
				}
			}
			if(counter <= 0){
				System.out.println(0);
			}else{
				System.out.println(1);
			}
		}
	}
}
