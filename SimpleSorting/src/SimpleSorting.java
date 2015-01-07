import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;


public class SimpleSorting {

	public static void main(String[] args) throws NumberFormatException, IOException {
		

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] splitted = line.split("\\s");
    		ArrayList<Float> floatList = new ArrayList<>();
    		for (String string : splitted) {
    			floatList.add(Float.parseFloat(string));
    		}
    		Collections.sort(floatList);
    		
    		DecimalFormat myFormatter = new DecimalFormat("0.000");
    		for (Float float1 : floatList) {
    			String output = myFormatter.format(float1);
    			System.out.print(output+" ");
    		}
    		System.out.println();
        }	
	}
}
