import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class SumOfDigits {

	public static void main(String[] args) throws NumberFormatException, IOException {

		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] splitted = line.split(",");
			//System.out.println(line);
			int max_so_far = Integer.parseInt(splitted[0]); 
			int max_ending_here = Integer.parseInt(splitted[0]);
			//System.out.println("MAX_ENDING_HERE :: "+max_ending_here+"\tMAX_SO_FAR"+max_so_far);
			int i;
			for(i = 1; i < splitted.length; i++) {
				int x = Integer.parseInt(splitted[i]);
				//System.out.print("x :: "+x+"\t");

				max_ending_here = Math.max(x, max_ending_here + x );
				//System.out.print("MAX_ENDING_HERE :: "+max_ending_here+"\t");

				max_so_far = Math.max(max_so_far, max_ending_here);
				//System.out.println("MAX_SO_FAR :: "+max_so_far);
			}
			System.out.println(max_so_far);

		}
		buffer.close();
	}
}
