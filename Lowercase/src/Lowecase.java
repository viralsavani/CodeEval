
public class Lowecase {

	public static void main(String[] args) {

		String name = "This IS A strinG Named Viral Savani Ok Then";
		//System.out.println(name.toLowerCase());
		
		for(int i = 0; i <= name.length()-1; i++){
			if((int)name.charAt(i)>=97 || (int)name.charAt(i) == 32){
				System.out.print(name.charAt(i));
			}else{
				System.out.print((char)((int)name.charAt(i)+32));
			}
		}
	}
}
