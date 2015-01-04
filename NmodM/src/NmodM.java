import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class NmodM {

	public static void main(String[] args) throws Exception, IOException {

		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] number = line.split(",");
			int n = Integer.parseInt(number[0]);
			int m = Integer.parseInt(number[1]);
			System.out.println(n-((n/m)*m));
		}
	}
}
