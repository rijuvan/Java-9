import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8CreatingUnmodibaleList {
	// Using an array and converting it to a list
	private List<Integer> list2 = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(100, 200)));
	// Using an anonymous class
	private List<Integer> list3 = Collections.unmodifiableList(new ArrayList<>() {
		{
			add(100);
			add(200);
		}
	});
	// Using a stream
	private List<Integer> list4 = Collections.unmodifiableList(Stream.of(100, 200).collect(Collectors.toList()));
	
}