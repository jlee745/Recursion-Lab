package RecursionLab;

public class ArraySum {
	public int sumOfArray (Integer[] a, int index) {
		if (index >= a.length) {
			return 0;
		} else {
			Integer value = a[index];
            return (value == null ? 0 : value) + sumOfArray(a, index + 1);
		}
	}
}
	
