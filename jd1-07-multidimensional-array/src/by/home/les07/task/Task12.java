package by.home.les07.task;

public class Task12 {

	public static void main(String[] args) {

		/*
		 * 12. Получить квадратную матрицу порядка n:
		 */

		int n = rand();

		int[][] ar = ar(n, n);

		PrintArray.print(ar);

	}

	public static int rand() {

		int a = (int) (Math.random() * 5 + 5);

		return a;
	}

	public static int[][] ar(int a, int b) {

		int[][] ar = new int[a][b];
		int k = 0;

		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar[i].length; j++) {

				if (i != j) {

					ar[i][j] = 0;

				} else {

					ar[i][j] = k;
					k++;
				}
			}
		}
		return ar;
	}

}
