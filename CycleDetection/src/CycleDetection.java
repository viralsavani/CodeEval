import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class CycleDetection {

	public static void main(String[] args) throws IOException {

		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] splitted = line.split("\\s");
			int i = 0;
			boolean flag = true;
			while(flag){
				for(int j = i+1; j <splitted.length; j++){
					if(splitted[i].equals(splitted[j])){
						for(int k = i; k < j; k++){
							System.out.print(splitted[k]+" ");
						}
						flag = false;
						break;
					}
				}
				i++;
			}
			System.out.println();
		}
	}
}
