import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class NumberPairs {

	public static void main(String[] args) throws NumberFormatException, IOException {

		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] splitted = line.split(";");
			String[] numbers = splitted[0].split(",");
			int sumNumber = Integer.parseInt(splitted[1]);
			String outputString = "";
			for (int i = 0; i < numbers.length; i++) {
				int previousElement = Integer.parseInt(numbers[i]);
				for (int j = i; j < numbers.length; j++) {
					if(i != j){
						int nextElement = Integer.parseInt(numbers[j]);
						if(((previousElement + nextElement) == sumNumber)){
							outputString = outputString + previousElement+","+nextElement+";";
						}
					}
				}
			}
			if(outputString.equals("")){
				System.out.println("NULL");
			}else{
				for (int i = 0; i < outputString.length() - 1; i++) {
					System.out.print(outputString.charAt(i));
				}
				System.out.println();
			}
		}
		buffer.close();
	}
}
