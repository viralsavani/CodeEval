
public class PrimeSum {

	public static void main(String[] args) {
		boolean primeFlag;
		boolean whileFlag = true;
		int sum = 0;
		int i=2;
		int primeTracker = 0;
		while(whileFlag){
			primeFlag = true;
			for(int j = 2; j < i; j++){				
				if(i%j == 0){
					primeFlag = false;
				}
			}
			if(primeFlag){
				sum = sum + i;
				primeTracker ++;
				if(primeTracker == 1000){
					whileFlag = false;
				}
			}
			i++;
		}
		System.out.println(sum);
	}

}
