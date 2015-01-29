import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class NumberOfOnes {

	public static void main(String[] args) throws NumberFormatException, IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int oneCount = 0;
    		line = Integer.toBinaryString(Integer.parseInt(line));
    		for(int i = 0; i < line.length(); i++){
    			char c = line.charAt(i);
    			if(c == '1'){
    				oneCount++;
    			}
    		}
    		System.out.println(oneCount);
        }
        buffer.close();
	}

}
