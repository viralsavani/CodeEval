import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class LowestUnique{
	public static void main(String[] args) throws IOException {

		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();	
			String[] noSpace = line.split("\\s");
			ArrayList<Integer> uniqueInt = new ArrayList<Integer>();
			for(int i = 0; i < noSpace.length; i++){
				int occuranceCounter = 0;
				for(int j = 0; j < noSpace.length; j++){
					if(noSpace[i].equals(noSpace[j])){
						occuranceCounter = occuranceCounter + 1;
					}
				}
				if(occuranceCounter == 1){
					uniqueInt.add(Integer.parseInt(noSpace[i]));	
				}
			}
			if(uniqueInt.size() > 0){
				Collections.sort(uniqueInt);
				String find = (uniqueInt.get(0)+"").toString();

				for(int i = 0; i <noSpace.length; i++){				
					if(find.equals(noSpace[i])){
						System.out.println(i+1);
					}
				}
			}else{
				System.out.println(0);
			}
		}
	}
}