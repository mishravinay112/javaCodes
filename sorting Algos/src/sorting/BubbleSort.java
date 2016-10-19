package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = { 2, 6, 83, 1, 54, 32 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (j <= a.length - 1) {
					if (a[i] > a[j]) {
						int local = a[j];
						a[j] = a[i];
						a[i] = local;
					}
				}
			}
		}

		System.out.println("sorted data will be-\n");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
	}
}
