package deb.algo;

public class SelectionSort {
	public Comparable[] sort(Comparable[] values) {
		for (int i = 0; i < values.length - 1; i++) {
			for (int j = i +1; j < values.length; j++) {
				if (values[j].compareTo(values[i]) < 0) {
					Comparable swap = values[i];
					values[i] = values[j];
					values[j] = swap;
				}
			}
		}
		return values;
	}
}
