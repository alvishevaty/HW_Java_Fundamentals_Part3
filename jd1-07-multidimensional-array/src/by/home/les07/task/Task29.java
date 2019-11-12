package by.home.les07.task;

public class Task29 {

	public static void main(String[] args) {

		/*
		 * 29. Найти положительные элементы главной диагонали квадратной матрицы.
		 */

		int n = rand();

		int[][] ar = ar(n);

		PrintArray.print(ar);

		System.out.println("•••••••••••••••••••••••••••••••••••");

		PrintArray.print(array(ar, length(ar)));
		;

	}

	public static int rand() {

		int a = (int) (Math.random() * 8 + 3);

		return a;
	}

	public static int randElement() {

		int a = (int) (Math.random() * 20 - 10);

		return a;
	}

	public static int[][] ar(int n) {

		int[][] ar = new int[n][n];

		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar[i].length; j++) {

				ar[i][j] = randElement();
			}
		}
		return ar;
	}

	public static int length(int[][] mas) {

		int m = 0;

		for (int j = 0; j < mas[0].length; j++) {

			for (int i = 0; i < mas.length; i++) {

				if (i == j & mas[i][j] > 0) {

					m++;

				}
			}
		}

		return m;
	}

	public static int[] array(int[][] mas, int m) {

		int[] ar = new int[m];
		int h = 0;

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (i == j & mas[i][j] > 0) {

					ar[h] = mas[i][j];
					h++;
				}
			}
		}

		return ar;
	}
}
