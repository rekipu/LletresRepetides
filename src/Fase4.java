import java.util.ArrayList;
import java.util.List;

public class Fase4 {
	public static List stringToChar(String x) {
		List<Character> llista = new ArrayList<>();
		for (int i = 0; i<x.length(); i++) {
			char caracter=x.charAt(i);
			llista.add(caracter);
		}
		return llista;
	}
	public static void main(String[] args) {
		List<Character> nameList = new ArrayList<>();
		List<Character> surnameList = new ArrayList<>();
		nameList = stringToChar("Joan Manel");
		surnameList = stringToChar("Ardura");
		
		List<Character> fullName = new ArrayList<>();
		fullName.addAll(nameList);
		fullName.add(' ');
		fullName.addAll(surnameList);
		System.out.println(fullName);
		
	}
}
