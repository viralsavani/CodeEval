import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class CapatializeWord {

	public static void main(String[] args) throws IOException {


		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] splitted = line.split("\\s");            
			for(int i = 0; i <= splitted.length-1; i++){
				int first = (int)splitted[i].charAt(0);
				String string = splitted[i];
				if(first > 96 && first < 123){
					first = first - 32;
					StringBuilder replace = new StringBuilder(string);
					replace.setCharAt(0, (char)first);
					if(i == splitted.length-1){
						System.out.print(replace);
					}else{
						System.out.print(replace+" ");
					}
				}else{       	
					if(i == splitted.length-1){
						System.out.print(string);
					}else{
						System.out.print(string+" ");
					}      
				}
			}

			System.out.println();
		}


	}

}
