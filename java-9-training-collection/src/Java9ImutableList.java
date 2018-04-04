import java.util.Collections;
import java.util.List;

public class Java9ImutableList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an empty, immutable List before JDK 9
		List<Integer> emptyList1 = Collections.EMPTY_LIST;
		List<Integer> emptyList2 = Collections.emptyList();
		// Creating an empty list in JDK 9
		List<Integer> emptyList = List.of();
		// Creating a singleton, immutable List before JDK 9
		List<Integer> singletonList1 = Collections.singletonList(100);
		// Creating a singleton, immutable List in JDK 9
		List<Integer> singletonList = List.of(100);
	}

}
