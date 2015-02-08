import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class PrimeNumbers {

	public static void main(String[] args) throws Exception {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			int number = Integer.parseInt(line);
			String finalString = "";
			for(int i = 0; i < number; i++){
				if(isPrime(i)){
					finalString = finalString + i+" ";
				}
			}
			finalString = finalString.substring(0, finalString.length()-1).replaceAll(" ", ",");
			System.out.println(finalString);
		}
	}

	public static boolean isPrime(long number) {
		if (number <= 3) {
			return number > 1;
		} else if (number % 2 == 0 || number % 3 == 0) {
			return false;
		} else {
			for (int i = 5; i * i <= number; i += 6) {
				if (number % i == 0 || number % (i + 2) == 0) {
					return false;
				}
			}
			return true;
		}
	}
}
