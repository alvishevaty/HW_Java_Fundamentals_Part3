package by.home.les07.task;

public class Task25 {

	public static void main(String[] args) {
		/*
		 * 25. Получить квадратную матрицу порядка n:
		 */

		int n = rand();

		int[][] ar = ar(n);

		PrintArray.print(ar);

	}

	public static int rand() {

		int a = (int) (Math.random() * 5 + 5);

		return a;
	}

	public static int[][] ar(int n) {

		int[][] ar = new int[n][n];
		int l = 1;

		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar[i].length; j++) {

				ar[i][j] = l;
				l++;
			}

		}

		return ar;
	}
}
