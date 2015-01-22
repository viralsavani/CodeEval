import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


public class DataRecovery {

	public static void main(String[] args) throws NumberFormatException, IOException {

		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String sentence = line.substring(0,line.lastIndexOf(";"));
			String numbers = line.substring(sentence.length()+1, line.length());
			String[] splitStrings = sentence.split("\\s");
			String[] splitNumber = numbers.split("\\s");
			ArrayList<Integer> finalNumber = new ArrayList<>();

			HashMap<Integer, String> hashMap = new HashMap<>();


			for (String string : splitNumber) {
				finalNumber.add(Integer.parseInt(string));
			}

			for(int i = 0; i < finalNumber.size(); i++){
				//System.out.println(finalNumber.get(i)+"\t"+splitStrings[i]);
				hashMap.put(finalNumber.get(i), splitStrings[i]);
			}

			for(int j = 1; j <= finalNumber.size()+1; j++){
				String temp = hashMap.get(j);
				if(temp == null){
					System.out.print(splitStrings[splitStrings.length-1]+" ");
				}else{
					System.out.print(temp+" ");
				}	
			}
			System.out.println();
		}
	}
}


