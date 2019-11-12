package by.home.les06.task;

public class Task08 {

	public static void main(String[] args) {

		/*
		 * 8.Даны дроби. Составить программу, которая приводит эти дроби к общему
		 * знаменателю и упорядочивает их в порядке возрастания.
		 */
		int[] ar1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] ar2 = { 4, 6, 3, 12, 7, 12, 9, 2, 7, 5 };

		System.out.println("Исходные дроби: ");
		print1(ar1, ar2);

		System.out.println();

		System.out.println("Общий знаменатель: " + commonDenom(ar1));

		System.out.println("Дроби после приведения к общему значенателю: ");
		print2(sort(newNumerator(ar1, ar2)), commonDenom(ar1));
	}

	public static int commonDenom(int[] a) {
		int m = 1;
		for (int i = 0; i < a.length; i++) {
			m = m * a[i];
		}
		return m;
	}

	public static int[] newNumerator(int[] a, int[] b) {
		int m = commonDenom(b);
		int[] newA = new int[a.length];
		for (int i = 0; i < newA.length; i++) {
			newA[i] = m / b[i] * a[i];
		}
		return newA;
	}

	public static int[] sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}

		return a;
	}

	public static void print1(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "/" + b[i] + " | ");
		}
	}

	public static void print2(int[] a, int b) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "/" + b + " | ");
		}

	}

}
