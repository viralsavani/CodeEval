import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SmallestMultiple {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		int x, n;
		int maxNumber = 0;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] numberString = line.split(",");
			x = Integer.parseInt(numberString[0]);
			n = Integer.parseInt(numberString[1]);
			
			while(maxNumber <= x){
				maxNumber = maxNumber + n;
			}
			System.out.println(maxNumber);
		}
		buffer.close();
	}
}
