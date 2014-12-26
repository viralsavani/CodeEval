import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class StringReverse {

	public static void main(String[] args) throws IOException {

		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		String[] wordsInLine = null;
		String reverse = null;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			wordsInLine = line.split("\\s");
			for(int i = wordsInLine.length-1; i >= 0; i--){
				if(i==wordsInLine.length-1){
					reverse = wordsInLine[i];
				}else{
					reverse = reverse+" "+wordsInLine[i];
				}
			}
			System.out.println(reverse);
			reverse = null;
		}
		buffer.close();
	}
}