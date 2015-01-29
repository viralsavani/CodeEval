import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class FirstNonRepetedCharacter {

	public static void main(String[] args) throws IOException {

		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;

		
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			boolean flag = false;
			for(int i = 0; i < line.length(); i++){
				for(int j = 0; j < line.length(); j++){
					if(j != i){
						if(line.charAt(i) == line.charAt(j)){
							flag = false;
							break;
						}else{
							flag = true;
						}
					}
				}
				if(flag){
					System.out.println(line.charAt(i));
					break;
				}
			}
		}
	}
}

