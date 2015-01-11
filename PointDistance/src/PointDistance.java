import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PointDistance {

	public static void main(String[] args) throws NumberFormatException, IOException {

		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] splitted = line.split("\\)\\s\\(");

			String[] point1 = splitted[0].split(",");
			String[] point2 = splitted[1].split(",");

			String[] x1Final = point1[0].split("\\(");
			String[] y2Final = point2[1].split("\\)");

			int x1 = Integer.parseInt(x1Final[1].trim());
			int y1 = Integer.parseInt(point1[1].trim());
			int x2 = Integer.parseInt(point2[0].trim());
			int y2 = Integer.parseInt(y2Final[0].trim());

			int result = ((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1));
			result = (int)Math.sqrt(result);
			System.out.println(result);

		}
	}
}
