package by.home.les07.task;

public class Task13 {

	public static void main(String[] args) {

		/*
		 * 13. Сформировать квадратную матрицу порядка n по заданному образцу(n -
		 * четное):
		 */

		int n = rand();

		int[][] ar = ar(n, n);

		PrintArray.print(ar);

		System.out.println("♦________________________________________♦");

		print(ar);

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

				ar[i][j] = k;
				k++;
			}
			k = 1;
		}
		return ar;
	}

	public static void print(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {

			if (i % 2 != 0) {

				for (int j = mas[i].length - 1; j >= 0; j--) {

					System.out.print(mas[i][j] + " | ");
				}
			} else {

				for (int j = 0; j < mas[i].length; j++) {

					System.out.print(mas[i][j] + " | ");
				}
			}
			System.out.println();
		}
	}

}
