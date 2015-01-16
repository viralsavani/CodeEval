import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class JsonMenuId {

	public static void main(String[] args) throws NumberFormatException, IOException {

		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			if(line.length()>1){
				String[] splitted = line.split("Label");
				int finalAnswer = 0;
				if(splitted.length > 1){
					for (int j = 0; j < splitted.length; j++) {
						if(j > 0){
							String[] innerSplit = splitted[j].trim().split("\"");
							finalAnswer = finalAnswer + Integer.parseInt(innerSplit[0]);
						}
					}
				}
				System.out.println(finalAnswer);   
			}
		}
	}
}
