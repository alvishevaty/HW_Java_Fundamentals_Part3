package by.home.les07.task;

public class Task11 {

	public static void main(String[] args) {

		/*
		 * 11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке:
		 * первая строка справа налево, вторая строка слева направо, третья строка
		 * справа налево и так далее.
		 */

		int n = rand();
		int m = rand();

		int[][] ar = ar(n, m);

		PrintArray.print(ar);

		System.out.println("♦________________________________________♦");

		print(ar);

	}

	public static int rand() {

		int a = (int) (Math.random() * 5 + 5);

		return a;
	}

	public static int[][] ar(int a, int b) {

		int[][] ar = new int[a][b];

		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar[i].length; j++) {

				ar[i][j] = (int) (Math.random() * 10);
			}
		}
		return ar;
	}

	public static void print(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {

			if (i % 2 == 0) {

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
