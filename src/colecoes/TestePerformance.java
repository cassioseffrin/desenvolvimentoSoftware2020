package colecoes;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Cassio Seffrin
 */
public class TestePerformance {

	TestePerformance() {
		List<String> arrString = new ArrayList<>();
		Set<String> setString = new HashSet<>();

		System.out.println("inicio arraylist: " + new Date());
		for (int i = 0; i < 9000000; i++) {
			arrString.add(("elemento s" + i));
		}
		System.out.println("fim arraylist: " + new Date());
		System.out.println("inicio set: " + new Date());
		for (int i = 0; i < 9000000; i++) {
			setString.add(("elemento s" + i));
		}
		System.out.println("fim set: " + new Date());

	}

	public static void main(String a[]) {
		new TestePerformance();
	}

}
