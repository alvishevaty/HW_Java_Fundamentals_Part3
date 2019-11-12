package by.home.les07.task;

public class Task03 {

	public static void main(String[] args) {

		/*
		 * 3. Дана матрица. Вывести на экран первый и последний столбцы.
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
		System.out.println("Первый и последний столбцы: ");
		for (int i = 0; i < mas.length; i++) {

			System.out.print("{");

			for (int j = 0; j < mas[i].length - 1; j = mas[i].length - 1) {
				System.out.print(mas[i][j] + "; ");
			}

			System.out.println(mas[i][mas[i].length - 1] + "}");
		}
	}

}
