
public class CycleDetection {

	public static void main(String[] args) {
		String line = "2 0 6 3 1 6 3 1 6 3 1";
		String withoutSpace = "";
		String[] splitted = line.split("\\s"); 

		for (String string : splitted) {
			withoutSpace = withoutSpace + string;
		}
		String t ="", tc1 = "", tc2 = "";
		String h = "";
		int ti = 0 , hi = 0, tci1 = 0, tci2 = 0;
		boolean flag = true;
		while(flag){
			t = splitted[ti];
			h = splitted[hi];
			System.out.println(line);
			System.out.println("First \t"+splitted[ti]+"\t"+splitted[hi]+"\t"+ti+"\t"+hi);
			if(ti == splitted.length-1){
				//System.out.println("No LOOP First");
				break;
			}
			if(hi<splitted.length - 2){
				hi++;
				h = splitted[hi];
				//System.out.println("Second \t"+splitted[ti]+"\t"+splitted[hi]+"\t"+ti+"\t"+hi);
				if(ti == splitted.length-1){
					//System.out.println("No LOOP Second");
					break;
				}

				hi++;
				h = splitted[hi];

				ti++;
				t = splitted[ti];
				//System.out.println("Third \t"+splitted[ti]+"\t"+splitted[hi]+"\t"+ti+"\t"+hi);

				if(h.equals(t)){
					
					tci1 = 0;
					tci2 = ti;
					int tiTemp = ti+1;
					
					
					//System.out.println("Inner Most\t"+tc1+"\t"+tc2+"\t"+ti);
					while(tiTemp >= 0){
						tc1 = splitted[tci1];
						tc2 = splitted[tci2];
						if(tc1.equals(tc2)){
							System.out.print(tc1);
						}
						tci1++;
						tci2++;
						tiTemp--;
					}
					System.out.println();
					
					
					//System.out.println("loop Found "+"\t\t"+h+"\t\t"+t);
					break;
				}
			}else{
				if(splitted[splitted.length-2].equals(splitted[splitted.length-1])){
					//System.out.println("loop Found Last Two"+splitted[splitted.length-2]);
					System.out.println(splitted);
					break;				
				}else{
					System.out.println("Noloop Found Final");
					break;	
				}
				
			}
			System.out.println("--------------------------");
			System.out.println("--------------------------");
			
		}
	}
}
