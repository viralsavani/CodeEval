import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class RemoveCharacter {

	public static void main(String[] args) throws IOException {


		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] splitStrings = line.split(",");

			for(int i = 0; i < splitStrings[0].length(); i++){
				boolean printFlag = true;
				for(int j = 1; j < splitStrings[1].length(); j++){				
					char ith = splitStrings[0].charAt(i);
					char jth = splitStrings[1].charAt(j);
					if(ith != jth){
						printFlag = true;
					}else{
						printFlag = false;
						break;
					}
				}
				if(printFlag){
					System.out.print(splitStrings[0].charAt(i));
				}
			}
			System.out.println();
		}
	}
}