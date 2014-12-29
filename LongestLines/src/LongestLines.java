import java.io.*;
import java.util.ArrayList;

public class LongestLines {

	public static void main(String[] args) throws IOException{

		//Shortest Implementation
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		ArrayList<String> input = new ArrayList<>();
		int linesToPrint = Integer.parseInt(buffer.readLine().trim());
		input.add(buffer.readLine().trim());
		while ((line = buffer.readLine()) != null) {
			line = line.trim();	
			if(line.length() > input.get(0).length()){
				for(int i = input.size(); i< 0; i--){
					input.add(i, input.get(i-1));
				}
				input.add(0, line);
			}else{
				input.add(line);
			}

		}
		for(int i = 0; i < linesToPrint; i++){
			System.out.println(input.get(i));
		}


		//		<<<<<<<<<<<<Same as above but some extra looping>>>>>>>>>>>>>

		//		File file = new File(args[0]);
		//		BufferedReader buffer = new BufferedReader(new FileReader(file));
		//		String line;
		//		ArrayList<String> input = new ArrayList<>();
		//		int linesToPrint = Integer.parseInt(buffer.readLine().trim());
		//		input.add(buffer.readLine().trim());
		//		while ((line = buffer.readLine()) != null) {
		//			line = line.trim();	
		//			input.add(line);
		//		}
		//		
		//		for (String string : input) {
		//			System.out.println(string);
		//		}
		//		
		//		String temp = null;
		//		for(int i = 0; i< input.size(); i++){
		//			for(int j = 1; j< input.size()-1; j++){
		//				if(input.get(j).length() > input.get(j-1).length()){
		//					temp = input.get(j);
		//					input.add(j, input.get(j-1));
		//					input.add(j-1, temp);
		//				}
		//			}
		//		}
		//		for(int i = 0; i < linesToPrint; i++){
		//			System.out.println(input.get(i));
		//		}
		//		

	}
}


