import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Stack;

public class PrefixExpressions {
	public static void main(String[] args)throws Exception {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] splitted = line.split("\\s");
    		
    		Stack<Integer> intStack = new Stack<Integer>();
    		
    		for(int i = splitted.length-1; i >=0; i--){
    			if(splitted[i].equals("+") || splitted[i].equals("*") || splitted[i].equals("/")){
    				int num1 = intStack.pop();
    				int num2 = intStack.pop();
    				
    				switch (splitted[i]) {
    				case "+":
    					intStack.push(num1 + num2);
    					break;
    				
    				case "*":
    					intStack.push(num1 * num2);
    					break;
    				
    				case "/":
    					intStack.push(num1 / num2);
    					break;
    				}
    			}else{
    				intStack.push(Integer.parseInt(splitted[i]));
    			}
    		}
    		
    		System.out.println(intStack.pop());
        }
        buffer.close();
	}
}