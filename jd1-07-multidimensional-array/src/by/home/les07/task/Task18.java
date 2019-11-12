package by.home.les07.task;

public class Task18 {

	public static void main(String[] args) {

		/*
		 * 18. Сформировать квадратную матрицу порядка n по заданному образцу(n -
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
		int k = 0;
		int l = 1;

		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar[i].length; j++) {

				if (j != ar[i].length - k) {

					for (int n = 0; n < ar[i].length - k; n++) {

						ar[i][n] = l;
					}

				} else {

					for (int n = ar[i].length - k; n < ar[i].length; n++) {

						ar[i][n] = 0;
					}
				}
			}
			k++;
			l++;
		}
		return ar;
	}
}
