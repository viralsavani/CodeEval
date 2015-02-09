import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;


public class DoubleSquares {

	public static void main(String[] args) throws Exception {

		long startTime = System.currentTimeMillis();
		
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		int testCases = Integer.parseInt(buffer.readLine().trim());
		while ((line = buffer.readLine()) != null) {
			line = line.trim();

			int number = Integer.parseInt(line);

			if(number != 0){

				ArrayList<Integer> perfectSquareList = new ArrayList<>();

				for(int i = number; i >= 0 ;i--){
					int squareRoot = (int) Math.sqrt(i);
					if(squareRoot * squareRoot == i){
						perfectSquareList.add(i);
					}
				}

				//    		for (Integer integer : perfectSquareList) {
				//    			System.out.print(integer+" ");
				//    		}
				//    		System.out.println();
				//    		System.out.println(perfectSquareList.size());

				boolean pairExists = false;
				int pairCounter = 0;

				for(int i = 0; i < perfectSquareList.size(); i++){
					for(int j = i+1; j < perfectSquareList.size(); j++){
						if(perfectSquareList.get(i) + perfectSquareList.get(j) == number){
							pairExists = true;
							pairCounter++;
							//System.out.println(perfectSquareList.get(i)+"\t"+perfectSquareList.get(j));
							break;
						}
					}
				}

				if(!pairExists){
					System.out.println("0");
				}else{
					System.out.println(pairCounter);
				}
			}else{
				System.out.println("1");
			}
		}
		long totalTime = System.currentTimeMillis() - startTime;
		System.out.println(">>>>>>>>>>>> TOTAL TIME"+totalTime);
	}
}
