import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class HiddenDigits {

	public static void main(String[] args)throws Exception {


		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();

			boolean isAnswerPresent = false;

			for(int i = 0; i < line.length(); i++){
				char c = line.charAt(i);
				if((c >= 48 && c <= 57)){
					isAnswerPresent = true;
					System.out.print(c);
				}
				if(c >= 97 && c <= 106){
					isAnswerPresent = true;

					System.out.print((c-97)+"");
				}
			}
			if(isAnswerPresent){
				System.out.println();
			}else{
				System.out.println("NONE");
			}
		}
	}
}
