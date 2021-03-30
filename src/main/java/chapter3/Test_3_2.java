package chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test_3_2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("3");
		list.add("2");

		Stream<String> stream = list.stream().filter(x -> {
			// 该输出语句并不会打印，因为filter为惰性求值法
			// System.out.println(x);
			return x.equals("3");
		});

		// 该方法为及早求值法
		System.out.println(stream.count());

		// 如果将打印语句放置到一个拥有终止操作的流，那么会执行打印
		list.stream().filter(x -> {
			System.out.println(x);
			return x.equals("3");
		}).count();

		// 判断是及早求值还是惰性求值的方法为，查看方法的返回值是否是Stream
	}
}
