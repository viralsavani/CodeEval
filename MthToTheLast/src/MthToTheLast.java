import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class MthToTheLast {

	public static void main(String[] args) throws NumberFormatException, IOException {

		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] splitted = line.split("\\s");
			int mthNumber = Integer.parseInt(splitted[splitted.length-1]);
			if(mthNumber < splitted.length){
				System.out.println((splitted[(splitted.length-1)-mthNumber]));
			}			
		}
	}
}
