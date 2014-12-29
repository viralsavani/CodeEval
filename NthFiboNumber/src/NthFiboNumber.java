import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NthFiboNumber {

	public static void main(String[] args) throws IOException {
		 File file = new File(args[0]);
	        BufferedReader buffer = new BufferedReader(new FileReader(file));
	        String line;
	        while ((line = buffer.readLine()) != null) {
	            line = line.trim();
	            //System.out.println(nthFiboRecurssion(Integer.parseInt(line)));     //NOT GOOD
	            System.out.println(nthFiboEfficient(Integer.parseInt(line)));		 //Seems OK!
	        }
	}
	
	public static int nthFiboEfficient(int n){
		int temp1 = 0;
		int temp2 = 1;
		int result = 0;
		for(int i = 0; i < n-1; i++){
			result = temp1 + temp2;
			temp1 = temp2;
			temp2 = result;
		}
		return result;
	}
	
	public static int nthFiboRecurssion(int n){
		
		if(n == 0){
			return 0;
		}else if(n == 1){
			return 1;
		}
		else{
			return ((nthFiboRecurssion(n-1))+(nthFiboRecurssion(n-2)));
		}
	}
}
