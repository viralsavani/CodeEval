import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;


public class StackImplementation{

	public static void main(String[] args) throws NumberFormatException, IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] splitted = line.split("\\s");
    		int[] number = new int[splitted.length];
    		int i = 0;
    		Stack<Integer> st = new Stack<>();
    		for (String string : splitted) {
    			number[i] = Integer.parseInt(string);
    			st.push(number[i]);
    			i++;
    		}
    		int size = st.size();
    		for(int j = 1; j <= size; j++){
    			if(j%2 != 0){
    				if(j == size-1){
    					System.out.print(st.pop());
    				}else{
    					System.out.print(st.pop()+" ");
    				}
    				
    			}else{
    				st.pop();
    			}
    		}
    		System.out.println();
        }
	}
}
