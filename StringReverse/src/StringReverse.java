import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class StringReverse {

	public static void main(String[] args) throws IOException {

		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			if(line.length()>0){
				String[] nameSplit = line.split("\\s");
				if(nameSplit.length == 2){
					line = nameSplit[0];
					nameSplit[0] = nameSplit[1];
					nameSplit[1] = line;
					System.out.println(nameSplit[0]+" "+nameSplit[1]);
				}
			}
		}
		buffer.close();
	}

}