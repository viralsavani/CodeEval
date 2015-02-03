import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class LongestWord {

	public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] splitted = line.split("\\s");
    		int maxLenghtPointer = 0;
    		for (int i = 0; i < splitted.length; i++) {
    			if(splitted[i].length() > splitted[maxLenghtPointer].length()){
    				maxLenghtPointer = i;
    			}
    		}
    		System.out.println(splitted[maxLenghtPointer]);
        }
        buffer.close();
	}
}
