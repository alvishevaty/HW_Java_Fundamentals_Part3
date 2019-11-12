package by.home.les07.task;

public class Task19 {

	public static void main(String[] args) {

		/*
		 * 19. Сформировать квадратную матрицу порядка n по заданному образцу(n -
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

		for (int i = 0; i < ar.length / 2; i++) {

			for (int j = 0; j < ar[i].length; j++) {

				if (j >= 0 + k && j < ar.length - k) {

					ar[i][j] = 1;

				} else {

					ar[i][j] = 0;
				}
			}
			k++;
		}

		k = 0;

		for (int i = ar.length - 1; i >= ar.length / 2; i--) {

			for (int j = 0; j < ar.length; j++) {

				if (j >= 0 + k && j < ar.length - k) {

					ar[i][j] = 1;

				} else {

					ar[i][j] = 0;
				}
			}
			k++;
		}
		return ar;
	}
}
