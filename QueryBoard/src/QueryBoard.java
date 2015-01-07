import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class QueryBoard {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int [][]board = new int[256][256];

		for(int i = 0; i <= 255; i++){
			for(int j = 0; j <= 255; j++){
				board[i][j] = 0;
			}
		}
		
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] splited = line.split("\\s");
			int i,j,x;
			int queryResult = 0;
			switch (splited[0]) {
			case "SetCol":
				j = Integer.parseInt(splited[1]);
				x = Integer.parseInt(splited[2]);
				for(int row = 0; row <= 255; row++){
					board[row][j] = x;
				}
				//System.out.println("SETCOL");
				break;

			case "SetRow":
				i = Integer.parseInt(splited[1]);
				x = Integer.parseInt(splited[2]);
				for(int col = 0; col <= 255; col++){
					board[i][col] = x;
				}
				//System.out.println("SETROW");
				break;

			case "QueryRow":
				i = Integer.parseInt(splited[1]);
				for(int col = 0; col <= 255; col++){
					queryResult = queryResult + board[i][col];
				}
				System.out.println(queryResult);
				break;

			case "QueryCol":
				j = Integer.parseInt(splited[1]);
				for(int row = 0; row <= 255; row++){
					queryResult = queryResult + board[row][j];
				}
				System.out.println(queryResult);
				break;
			default:
				break;
			}	
		}
	}
}
