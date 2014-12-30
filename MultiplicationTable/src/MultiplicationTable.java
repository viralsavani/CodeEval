public class MultiplicationTable {

	public static void main(String[] args){
		String numberString = null;
		boolean i10Flag = false;
		for(int i = 1; i <= 12; i++){
			for(int j = 1; j <= 12; j++){
				numberString = ((i*j)+"").toString();
				
				if(j > 1){
					if(! i10Flag){
						for(int k = numberString.length(); k <= 4; k++){
							numberString = " "+numberString;
						}
						System.out.print(numberString);
					}else{
						if(j == 2){
							System.out.print("   "+numberString);
						}else{
							for(int k = numberString.length(); k <= 4; k++){
								numberString = " "+numberString;
							}
							System.out.print(numberString);
						}
					}
				}else{
					if(i > 9){
						i10Flag = true;
						System.out.print(numberString);
					}else{
						System.out.print(" "+numberString);
					}
				}
			}
			System.out.println();
		}
	}
}
