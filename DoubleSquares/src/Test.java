import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class Test {
	public static void main(String[] args) throws Exception{

		//long startTime = System.currentTimeMillis();

		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		buffer.readLine();
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			int number = Integer.parseInt(line);

			int y = (int) Math.sqrt(number);
			int xSquare;
			int ySquare = 0;
			int counter = 0;

			if(number != 0){
				for(int i = y; i >= 0; i--){
					//	System.out.println(i+"\t"+x);
					xSquare = (int)Math.pow(i,2); 

					for(int j = 0; j < y; j++){
						ySquare = (int) Math.pow(j, 2);
						//System.out.println("xSquare:: "+xSquare+"\t ySquare:: "+ySquare);
						if(xSquare < ySquare){
							break;
						}
						if(xSquare + ySquare == number){
							//System.out.println("xSquare:: "+xSquare+"\t ySquare:: "+ySquare+"-->>");
							counter++;
						}
					}
				}
				System.out.println(counter);
			}else{
				System.out.println("0");
			}
			
		}
		buffer.close();
		//long totalTime = System.currentTimeMillis() - startTime;
		//System.out.println(">>>>>>>>>>>> TOTAL TIME"+totalTime);
	}
}
