import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class BitPositions {

	public static void main(String[] args) throws IOException {

		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] numbersString = line.split(",");
			int n = Integer.parseInt(numbersString[0]);
			int p1 = Integer.parseInt(numbersString[1]);
			int p2 = Integer.parseInt(numbersString[2]);
			
			String binaryString = Integer.toBinaryString(n);
			
			if(binaryString.charAt(binaryString.length()-p2) == binaryString.charAt(binaryString.length()-p1)){
				System.out.println(true);
			}else{
				System.out.println(false);
			}
		}
	}

}
