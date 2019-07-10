import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class Fase3 {
	public static void main(String args[]) {
		
		String name= "Joan Manel Ardura Terra";
		name = name.toLowerCase();
		
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
		Map<Character, Integer> lletresNums = new TreeMap<>();	
		for(Character v1 : nameList) {
			if (v1 == ' '){
				continue;
			}
			int numero = 0;
			for(Character v2 : nameList) {
				if (v1==v2){
					// afegir +1 al valor corresponent
					numero++;
				}
			}
			lletresNums.put(v1, numero);
		}
		System.out.println(caracter);
		System.out.println(lletresNums);
		}
	
				
	}
}
		
		

