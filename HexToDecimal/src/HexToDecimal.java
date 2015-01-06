import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class HexToDecimal {

	public static void main(String[] args) throws NumberFormatException, IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();

			double decimalNumber = 0;
			for(int i = line.length()-1; i >= 0; i--){
				String digitString = (line.charAt(i)+"").toString();
				int digit = 0;

				switch (digitString) {
				case "a":
					digit = 10;
					break;
				case "b":
					digit = 11;
					break;
				case "c":
					digit = 12;
					break;
				case "d":
					digit = 13;
					break;
				case "e":
					digit = 14;
					break;
				case "f":
					digit = 15;
					break;
				default:
					digit = Integer.parseInt(digitString);
					break;
				}

				decimalNumber = decimalNumber + (digit * (Math.pow(16, line.length()-i-1)));
			}
			System.out.println((int)decimalNumber);
		}
	}
}
