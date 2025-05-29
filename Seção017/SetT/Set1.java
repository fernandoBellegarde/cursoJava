
import java.util.HashSet;

import java.util.Set;


public class Set1 {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>(); // nao deixa sempre na ordem
							// TreeSet deixa em ordem alfabetica
							// LinkedHashSet imprime na ordem
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
	
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
		System.out.println();
	}
}