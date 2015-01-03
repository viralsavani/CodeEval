import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class SelfDescribingNumber {

	public static void main(String[] args) throws IOException {


		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();

			boolean flag = false;
			for(int i = 0; i < line.length(); i++){

				char firstChar = line.charAt(i);
				//System.out.println(i+" OCCURS "+firstChar+" TIMES");

				int digitCounter = 0;
				for(int j = 0; j < line.length(); j++){
					char tempChar = line.charAt(j);
					if(((i+"").toString()).charAt(0) == tempChar){
						//System.out.println("III"+i);
						digitCounter++;
					}
				}
				if(((digitCounter+"").toString()).charAt(0) == firstChar){

					flag = true;
					//System.out.println("FLAG :: "+flag);
				}else{
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println(1);
			}else{
				System.out.println(0);
			}
		}
	}
}