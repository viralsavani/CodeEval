import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class EvenNumber {

	public static void main(String[] args) throws IOException {

		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			int number = Integer.parseInt(line);
			if(number % 2 == 0){
				System.out.println("1");
			}else{
				System.out.println("0");
			}
		}
		buffer.close();
	}
}
