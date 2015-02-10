import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class MixedContent {

	public static void main(String[] args) throws  Exception {
		

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] splitted = line.split(",");
    		String number = "";
    		String words = "";

    		for (int i = 0; i < splitted.length; i++) {
    			if(splitted[i].toLowerCase().charAt(0) >= 97 && splitted[i].toLowerCase().charAt(0) <= 122){
    				words = words+","+splitted[i];
    			}else{
    				number = number+","+splitted[i];
    			}
    		}

    		if(words.length() > 0 && number.length() > 0){
    			System.out.println(words.substring(1)+"|"+number.substring(1));
    		}else{
    			if(words.length() > 0){
    				System.out.println(words.substring(1));
    			}else{
    				System.out.println(number.substring(1));
    			}
    		}
        }
	}
}
