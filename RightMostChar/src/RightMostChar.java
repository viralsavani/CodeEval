import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RightMostChar {

	public static void main(String[] args)throws IOException{
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        
        while ((line = buffer.readLine()) != null) {
        	boolean notFound = true;
            line = line.trim();
            String[] input = line.split(",");
    		
    		for(int i = input[0].length()-1; i >= 0; i--){
    			if(input[0].charAt(i) == input[1].charAt(0)){
    				System.out.println(i);
    				notFound = false;
    				break;
    			}
    		}
    		if(notFound){
    			System.out.println("-1");
    		}
        }
	}
}
