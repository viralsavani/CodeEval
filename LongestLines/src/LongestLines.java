import java.util.Arrays;
import java.util.Comparator;


public class LongestLines implements Comparator<String>{

	public static void main(String[] args){

		String[] input = {"2","Hello World","CodeEval","Quick Fox","A","San Francisco"};
		System.out.println("Input: " + Arrays.toString(input));//before sorting by length
		Arrays.sort(input, new LongestLines());
		System.out.println("Array Sorted:" + Arrays.toString(input));
	}

	@Override
	public int compare(String o1, String o2) {
		if (o1.length() > o2.length())
			return -1;
		else if (o1.length() < o2.length())
			return 1;
		else return 0;
	}
}


