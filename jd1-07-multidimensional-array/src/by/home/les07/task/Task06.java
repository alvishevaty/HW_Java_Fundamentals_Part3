package by.home.les07.task;

public class Task06 {

	public static void main(String[] args) {

		/*
		 * 6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый
		 * элемент больше последнего.
		 */

		int[][] ar = ar(rand(), rand());

		PrintArray.print(ar);

		System.out.println();

		print(ar);

	}

	public static int rand() {

		int a = (int) (Math.random() * 8 + 2);

		return a;
	}

	public static int[][] ar(int a, int b) {

		int[][] ar = new int[a][b];

		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar[i].length; j++) {

				ar[i][j] = (int) (Math.random() * 20);
			}
		}
		return ar;
	}

	public static void print(int[][] mas) {

		System.out.println("Столбцы с нечетными номерами: ");

		int k = 0;

		for (int i = 0; i < mas.length; i = i + 1) {

			for (int j = 0; j < mas[i].length; j++) {

				if (mas[0][j] > mas[mas.length - 1][j] && j % 2 != 0) {

					k++;

					System.out.print(mas[i][j] + "\t" + "|" + "\t");
				}
				
				if (j == mas[0].length - 1) {
					System.out.println();
				}
			}
		}

		if (k == 0) {
			System.out.println("Таких столбцов нет.");
		}
	}
}
