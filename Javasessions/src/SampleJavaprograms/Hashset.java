package SampleJavaprograms;

import java.util.HashSet;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		Set<String> var= new HashSet<String>();
		var.add("60");
		var.add("20");
		var.add("60");
		var.add("Meena");
		var.add("Naveen");
		var.add("Meena");
		for( String a:var)
				{
			System.out.println(a);
	}

}
}

