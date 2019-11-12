package by.home.les07.task;

public class Task16 {

	public static void main(String[] args) {

		/*
		 * 16. Сформировать квадратную матрицу порядка n по заданному образцу(n -
		 * четное):
		 */

		int n = rand();

		int[][] ar = ar(n, n);

		PrintArray.print(ar);

	}

	public static int rand() {

		int a = (int) (Math.random() * 8 + 2);

		while (a % 2 != 0) {

			a = (int) (Math.random() * 8 + 2);
		}

		return a;
	}

	public static int[][] ar(int a, int b) {

		int[][] ar = new int[a][b];
		int k = 1;

		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar[i].length; j++) {

				if (i != j) {

					ar[i][j] = 0;

				} else {

					ar[i][j] = k * (k + 1);
				}
			}
			k++;
		}
		return ar;
	}

}