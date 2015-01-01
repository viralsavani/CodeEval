import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class UniqueElements {

	public static void main(String[] args) throws IOException {
		
		File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String lineFile;
        while ((lineFile = buffer.readLine()) != null) {
            lineFile = lineFile.trim();
            String[] line = lineFile.split(",");
                    
    		ArrayList<String> input = new ArrayList<>();
    		
    		for(int i = 0; i < line.length; i++){
    			if(! input.contains(line[i])){
    				input.add(line[i]);
    			}
    		}
    		
    		for(int i = 0; i < input.size(); i++){
    			if(i == input.size()-1){
    				System.out.print(input.get(i));
    			}else{
    				System.out.print(input.get(i)+",");
    			}	
    		}
    		System.out.println();
        }	
	}
}
