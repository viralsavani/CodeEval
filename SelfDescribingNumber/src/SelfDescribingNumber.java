
public class SelfDescribingNumber {

	public static void main(String[] args) {
		
		String line = "1210";
		int digits = line.length()-1;
		int number = Integer.parseInt(line);
		for(int i = digits; i >= 0; i--){
			int lastDigit = number % 10;
			number = number / 10;
			System.out.println(i+" Should Occur "+lastDigit);
		}	
	}
}