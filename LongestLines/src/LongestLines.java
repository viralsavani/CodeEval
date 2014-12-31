import java.io.*;
import java.util.ArrayList;

public class LongestLines {

	public static void main(String[] args) throws IOException{

		//Shortest Implementation
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		int linesToPrint = Integer.parseInt(buffer.readLine().trim());
		ArrayList<String>input = new ArrayList<>();

		while ((line = buffer.readLine()) != null) {
			line = line.trim();	
			input.add(line);
		}
		
		for(int i = 0; i <= input.size(); i++){
			for(int j = 1; j < input.size(); j++){
				if(input.get(j).length() > input.get(j-1).length()){
					String temp = input.get(j);
					
					String temp2 = input.get(j-1);
					input.remove(j);
					input.add(j, temp2);
					
					input.remove(j-1);
					input.add(j-1, temp);
				}
			}
		}
		for(int i = 0; i < linesToPrint; i++){
			System.out.println(input.get(i));
		}
	}
}


