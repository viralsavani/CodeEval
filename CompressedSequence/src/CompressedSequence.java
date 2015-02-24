import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class CompressedSequence {

	public static void main(String[] args)throws Exception {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] splitted = line.split("\\s");
			String currentString = splitted[0];
			int currentCounter = 1;
			String finalOutput = "";

			if(splitted.length == 1){
				finalOutput = String.valueOf(currentCounter)+" "+currentString+" ";
			}else{

				for (int i = 1; i < splitted.length; i++) {
					String string = splitted[i];
					if(currentString.equals(string)){
						currentCounter++;
						if(i == splitted.length-1){
							finalOutput = finalOutput + String.valueOf(currentCounter)+" "+currentString+" ";
						}
					}else{
						finalOutput = finalOutput + String.valueOf(currentCounter)+" "+currentString+" ";
						currentCounter = 1;
						currentString = string;
						if(i == splitted.length-1){
							finalOutput = finalOutput + String.valueOf(currentCounter)+" "+currentString+" ";
						}
					}
				}
			}
			System.out.println(finalOutput.trim());
		}	
	}
}
