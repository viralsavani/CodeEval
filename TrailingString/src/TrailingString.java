import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class TrailingString {

	public static void main(String[] args) throws IOException {

		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;

		while ((line = buffer.readLine()) != null) {
			boolean flag = true;
			line = line.trim();

			if(!line.equals("") && line != ""){
				String[] splitted = line.split(",");
				
				if(splitted.length == 2){
					splitted[0] = splitted[0].trim();
					splitted[1] = splitted[1].trim();
					
					if(splitted[0].length() >= splitted[1].length()){
						String firstString = splitted[0];
						String secondString = splitted[1];

						int i = firstString.length()-1;
						int j = secondString.length()-1;

						while(j >= 0){
							if(firstString.charAt(i) != secondString.charAt(j)){
								System.out.println("0");
								flag = false;
								break;
							}
							i--;
							j--;
						}
						if(flag){
							System.out.println("1");
						}
					}else{
						System.out.println("0");
					}
				}else{
					System.out.println("0");
				}
			}
		}
		buffer.close();
	}
}
