import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ShortestRepetition {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			char first = line.charAt(0);
			boolean foundFlag = false;
			for(int i = 1; i < line.length(); i++){
				if(first == line.charAt(i)){
					foundFlag = true;
					System.out.println(i);
					break;
				}
			}
			if(!foundFlag){
				System.out.println(line.length());
			}
		}
	}
}
