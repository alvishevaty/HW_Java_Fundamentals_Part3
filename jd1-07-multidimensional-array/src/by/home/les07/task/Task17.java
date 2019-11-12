package by.home.les07.task;

public class Task17 {

	public static void main(String[] args) {

		/*
		 * 17. Сформировать квадратную матрицу порядка n по заданному образцу(n -
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

		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar[i].length; j++) {

				if (i > 0 && i < ar.length - 1 && j > 0 && j < ar.length - 1) {

					ar[i][j] = 0;

				} else {

					ar[i][j] = 1;
				}
			}
		}
		return ar;
	}
}
