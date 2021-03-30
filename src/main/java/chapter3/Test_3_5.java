package chapter3;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test_3_5 {

	public static void main(String[] args) {
		Track track = Stream.of(new Track("hello", 2021), new Track("best", 1999)).collect(Collectors.toList()).stream()
				.min(Comparator.comparing(Track::getYear)).orElse(null);
		System.out.println(track);
	}

	static class Track {

		private String name;

		private int year;

		public Track(String name, int year) {
			this.name = name;
			this.year = year;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		@Override
		public String toString() {
			return "Track{" + "name='" + name + '\'' + ", year=" + year + '}';
		}
	}
}
