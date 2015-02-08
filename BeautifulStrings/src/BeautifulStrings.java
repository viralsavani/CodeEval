import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class BeautifulStrings {

	public static void main(String[] args) throws Exception {

		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			line = line.toLowerCase();

			ArrayList<Character> charsList = new ArrayList<>(line.length());
			for (int i = 0; i < line.length(); i++) {
				if(line.charAt(i) >= 97 && line.charAt(i) <= 122){
					charsList.add(line.charAt(i));
				}
			}
			HashMap<Character, Integer> occuranceMap = new HashMap<>(charsList.size());
			for (Character character : charsList) {
				occuranceMap.put(character, Collections.frequency(charsList, character));
			}

			int maxMultiplier = 26;
			int result = 0;

			ArrayList<Integer> valuesAsList = new ArrayList<Integer>(occuranceMap.values());

			Collections.sort(valuesAsList, Collections.reverseOrder());
			for (Integer integer : valuesAsList) {
				result = result + integer * maxMultiplier;
				maxMultiplier--;
			}
			System.out.println(result);
		}
		buffer.close();
	}
}
