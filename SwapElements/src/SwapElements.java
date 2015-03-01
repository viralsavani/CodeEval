import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class SwapElements {

	public static void main(String[] args) throws Exception, Exception {


		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] splitted = line.split(":");
			String[] pairs = splitted[1].split(",");
			splitted = splitted[0].split("\\s");

			String temp;
			for(int i = 0; i < pairs.length; i++){
				String[] positions = pairs[i].trim().split("-");
				temp = splitted[Integer.parseInt(positions[0])];
				splitted[Integer.parseInt(positions[0])] = splitted[Integer.parseInt(positions[1])];
				splitted[Integer.parseInt(positions[1])] = temp;
			}

			for (int i = 0; i < splitted.length; i++) {
				String string = splitted[i];
				System.out.print(string+" ");
			}
			System.out.println();
		}
		buffer.close();
	}
}
