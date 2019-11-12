package by.home.les07.task;

public class Task07 {

	public static void main(String[] args) {

		/*
		 * 7. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных
		 * элементов.
		 */

		int[][] ar = ar(5, 5);

		PrintArray.print(ar);

		System.out.println("♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");

		System.out.println("Сумма отрицательных элементов: " + print(ar));

	}

	public static int[][] ar(int a, int b) {

		int[][] ar = new int[a][b];

		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar[i].length; j++) {

				ar[i][j] = (int) (Math.random() * 20 - 10);
			}
		}
		return ar;
	}

	public static int print(int[][] mas) {

		int sum = 0;
		int k = 0;

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (mas[i][j] < 0 && mas[i][j] % 2 != 0) {

					sum = sum + Math.abs(mas[i][j]);
					k++;
				}
			}
		}

		if (k == 0) {
			System.out.println("Отрицательных чисел нет.");

		}
		return sum;
	}
}
