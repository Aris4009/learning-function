package chapter3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test_3_3 {

	public static void main(String[] args) {
		// 从stream生成一个列表
		List<String> list = Stream.of("2", "2").collect(Collectors.toList());
		System.out.println(Arrays.toString(list.toArray(new String[0])));

		// filter
		List<String> list1 = Stream.of("aaa", "bbb").collect(Collectors.toList()).stream().filter(x -> x.equals("bbb"))
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(list1.toArray(new String[0])));

		// map
		List<String> list2 = list1.stream().map(a -> a.toUpperCase()).collect(Collectors.toList());
		System.out.println(Arrays.toString(list2.toArray(new String[0])));
	}
}
