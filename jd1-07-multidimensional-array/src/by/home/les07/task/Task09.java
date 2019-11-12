package by.home.les07.task;

public class Task09 {

	public static void main(String[] args) {

		/*
		 * 9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
		 */

		int n = rand();

		int[][] ar = ar(n, n);

		PrintArray.print(ar);

		System.out.println("♦________________________________________♦");

		print(ar);

	}

	public static int rand() {

		int a = (int) (Math.random() * 5 + 2);

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

			for (int j = 0; j < mas[i].length; j++) {

				if (i == j) {

					System.out.print(mas[i][j] + " | ");
				}
			}
		}
	}
}
