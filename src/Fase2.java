import java.util.ArrayList;
import java.util.List;

public class Fase2 {
	public static void main(String args[]) {
		
		String name= "Joan Manel Ardura Terra";
		List<Character> nameList = new ArrayList<Character>();
		for (int i=0; i<name.length();i++) {
			nameList.add(name.charAt(i));
			System.out.println(nameList.get(i));
		}
				
	}
}
