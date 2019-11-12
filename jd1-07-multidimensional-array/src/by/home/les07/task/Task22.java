package by.home.les07.task;

public class Task22 {

	public static void main(String[] args) {

		/*
		 * 22. Сформировать квадратную матрицу порядка n по заданному образцу(n -
		 * четное):
		 */

		int n = rand();

		int[][] ar = ar(n, n);

		PrintArray.print(ar);

	}

	public static int rand() {

		int a = (int) (Math.random() * 5 + 5);

		while (a % 2 != 0) {

			a = (int) (Math.random() * 5 + 5);
		}

		return a;
	}

	public static int[][] ar(int a, int b) {

		int[][] ar = new int[a][b];
		int k = 1;
		int l = 0;

		for (int m = 0; m < ar.length; m++) {

			for (int i = ar.length - k, j = 0; i >= 0; i--, j++) {

				ar[i][j] = ar.length - l;

			}

			k++;
			l++;

		}

		return ar;
	}
}
