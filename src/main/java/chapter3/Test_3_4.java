package chapter3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test_3_4 {

	public static void main(String[] args) {
		// flatmap
		List<String> list3 = Stream.of(Arrays.asList("aaa", "bbb"), Arrays.asList("ddd", "eee"))
				.flatMap(strings -> strings.stream()).collect(Collectors.toList());
		System.out.println(Arrays.toString(list3.toArray(new String[0])));
	}

}
