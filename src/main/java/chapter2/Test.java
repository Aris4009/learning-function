package chapter2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Supplier;

import javax.swing.text.DateFormatter;

public class Test {

	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		List<DateFormat> list = new ArrayList<>();
		list.add(dateFormat);
		list.add(dateFormat1);

		Supplier<DateFormatter> dateFormatSupplier = DateFormatter::new;
		ThreadLocal<DateFormatter> threadLocal = ThreadLocal.withInitial(dateFormatSupplier);

		Date date = new Date();
		for (final DateFormat d : list) {
			new Thread(() -> {
				threadLocal.get().setFormat(d);
				System.out.println(d.format(date));
			}).start();
		}
	}
}
