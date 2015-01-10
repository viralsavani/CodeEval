import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class WordsToNumber {

	public static void main(String[] args) throws IOException {

		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] splitStrings = line.split(";");
			for (String string : splitStrings) {

				switch (string) {
				case "zero":
					System.out.print("0");
					break;
				case "one":
					System.out.print("1");
					break;
				case "two":
					System.out.print("2");
					break;
				case "three":
					System.out.print("3");
					break;
				case "four":
					System.out.print("4");
					break;
				case "five":
					System.out.print("5");
					break;
				case "six":
					System.out.print("6");
					break;
				case "seven":
					System.out.print("7");
					break;
				case "eight":
					System.out.print("8");
					break;
				case "nine":
					System.out.print("9");
					break;


				default:
					break;
				}
			}
			System.out.println();
		}
	}

}
