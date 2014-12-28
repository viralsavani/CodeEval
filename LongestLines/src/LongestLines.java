import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;


public class LongestLines {

	public static void main(String[] args) {

		String[] input = {"2","Hello World","CodeEval", "Quick Fox", "A", "San Francisco"};
		int linesToPrint = Integer.parseInt(input[0]);
		ArrayList<String> stringList = new ArrayList<>();
		
		for (int i = 1; i < input.length; i++) {
			stringList.add(input[i]);			
		}
		Collections.sort(stringList,Collections.reverseOrder());
	}
}
