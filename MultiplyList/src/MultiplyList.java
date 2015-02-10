
public class MultiplyList {

	public static void main(String[] args) {
		String line= "13 4 15 1 15 5 | 1 4 15 14 8 2";
		String[] splitted = line.split("\\s");
		
		for (int i = 0, j = splitted.length/2+1; i < splitted.length/2; i++) {
			int n1 = Integer.parseInt(splitted[i]);
			int n2 = Integer.parseInt(splitted[j]);
			//System.out.println(n1+"   "+n2);
			System.out.print(n1*n2+" ");
			j++;
			
		}
	}

}
