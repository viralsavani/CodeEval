import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Pangrams {

	public static void main(String[] args) throws IOException {
		

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        	line = line.toLowerCase();
    		String finalString = "";

    		for(int i = 97; i <=122; i++){
    			boolean flag = false;
    			for(int j = 0; j < line.length(); j++){
    				char currentChar = line.charAt(j);
    				if(currentChar >=97 && currentChar <=122 ){
    					if(i == currentChar){
    						flag = true;
    						break;
    					}
    				}
    			}    			
    			if(!flag){
    				finalString = finalString+(char)i+"";
    			}
    		}
    		if(finalString.equals("")){
    			System.out.println("NULL");
    		}else{
    			System.out.println(finalString);
    		}
        }
        buffer.close();
	}
}
