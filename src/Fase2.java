import java.util.ArrayList;
import java.util.List;

public class Fase2 {
	public static void main(String args[]) {
		
		String name= "Joan Manel Ardura Terra";
		List<Character> nameList = new ArrayList<>();
		for (int i=0; i<name.length();i++) {
			char caracter=name.charAt(i);
			nameList.add(caracter);
			if(Character.isDigit(caracter)) {
				System.out.println("Els noms de persones no contenen números!");	
			}else if(caracter=='a'||caracter=='e'||caracter=='i'||caracter=='o'||caracter=='u'||caracter=='A'||caracter=='E'||caracter=='I'||caracter=='O'||caracter=='U'){
				System.out.println("VOCAL!");
			}else if(caracter==' '){
				System.out.println("ESPASIU!");
			}else {
				System.out.println("CONSONANT!");
			}

				
			
			System.out.println(caracter);
		}
				
	}
}
