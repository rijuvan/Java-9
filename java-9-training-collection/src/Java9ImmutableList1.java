import java.util.List;

public class Java9ImmutableList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] nums = { 100, 200 };
		// Create a list whose elements are the same as the elements
		// in the array
		List<Integer> list1 = List.of(nums);
		System.out.println("list1 = " + list1);
		System.out.println("list1.size() = " + list1.size());
		// Create a list whose sole element is the array itself
		List<Integer[]> list2 = List.<Integer[]>of(nums);
		System.out.println("list2 = " + list2);
		System.out.println("list2.size() = " + list2.size());

	}

}
