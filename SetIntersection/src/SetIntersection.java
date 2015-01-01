import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class SetIntersection {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] semiColonDelimeted = line.split(";");
			ArrayList<String> intersectionList = new ArrayList<>();
			String[] set1 = semiColonDelimeted[0].split(",");
			String[] set2 = semiColonDelimeted[1].split(",");

			if(set1.length <= set2.length){
				for(int i = 0; i < set1.length; i++){
					for(int j = 0; j < set2.length; j++){
						if(set1[i].equals(set2[j])){
							intersectionList.add(set1[i]);
						}
					}
				}
			}else{
				for(int i = 0; i < set2.length; i++){
					for(int j = 0; j < set1.length; j++){
						if(set2[i].equals(set1[j])){
							intersectionList.add(set2[i]);
						}
					}
				}
			}
			if(intersectionList.size()>0){
				for(int i = 0; i < intersectionList.size(); i++){
					if(i == intersectionList.size()-1){
						System.out.println(intersectionList.get(i));
					}else{
						System.out.print(intersectionList.get(i)+",");
					}
				}
			}else{
				System.out.println();
			}
		}
	}
}
