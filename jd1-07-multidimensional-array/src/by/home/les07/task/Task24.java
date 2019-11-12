package by.home.les07.task;

public class Task24 {

	public static void main(String[] args) {

		/*
		 * 24. Дан линейный массив n n x , x , , x , x 1 2 −1  . Получить
		 * действительную квадратную матрицу порядка n:
		 */

		int n = rand();

		int[][] ar = ar(n);

		PrintArray.print(ar);

	}

	public static int rand() {

		int a = (int) (Math.random() * 5 + 2);

		return a;
	}

	public static int[][] ar(int n) {

		int[][] ar = new int[n][n];
		int k = 1;
		int l = rand();
		int m = l;

		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar[i].length; j++) {

				ar[i][j] = (int) Math.pow(l, k);
				l++;
			}

			l = m;
			k++;
		}

		return ar;
	}
}
