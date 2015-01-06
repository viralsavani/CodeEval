import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class SwapCase {

	public static void main(String[] args) throws IOException {

		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			for(int i = 0; i < line.length(); i++){
				int characterAscci = line.charAt(i);

				if(characterAscci > 64 && characterAscci < 91){
					characterAscci = characterAscci + 32;
					System.out.print((char)characterAscci);
				}else if(characterAscci > 96 && characterAscci < 123){
					characterAscci = characterAscci - 32;
					System.out.print((char)characterAscci);
				}else{
					System.out.print(line.charAt(i));
				}
			}
			System.out.println();
		}
	}
}
