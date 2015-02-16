import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class LongestCommanSubSequence {

	public static void main(String[] args)throws Exception {

		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] splitted = line.split(";");
			System.out.println(lcs(splitted[0], splitted[1]));
		}
		buffer.close();
	}

	public static String lcs(String a, String b) {
		int[][] lengths = new int[a.length()+1][b.length()+1];

		for (int i = 0; i < a.length(); i++){
			for (int j = 0; j < b.length(); j++){
				if (a.charAt(i) == b.charAt(j)){
					lengths[i+1][j+1] = lengths[i][j] + 1;
				}
				else{
					lengths[i+1][j+1] = Math.max(lengths[i+1][j], lengths[i][j+1]);
				}
			}
		}

		for (int i = 0; i <= a.length(); i++){
			for (int j = 0; j <= b.length(); j++){
			}
		}

		StringBuffer sb = new StringBuffer();
		for (int x = a.length(), y = b.length(); x != 0 && y != 0; ) {
			if (lengths[x][y] == lengths[x-1][y]){
				x--;
			}
			else if (lengths[x][y] == lengths[x][y-1]){
				y--;
			}
			else {
				assert a.charAt(x-1) == b.charAt(y-1);
				sb.append(a.charAt(x-1));
				x--;
				y--;
			}
		}
		return sb.reverse().toString();
	}
}
