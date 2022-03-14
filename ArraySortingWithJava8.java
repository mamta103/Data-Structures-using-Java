import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortingWithJava8 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		String[] arr = { "100","09" };
		List arrToList = new ArrayList(Arrays.asList(arr));
		System.out.println(arrToList);
		Collections.sort(arrToList);
		arrToList.stream().forEach(ele -> System.out.print(ele+", "));
	}
}