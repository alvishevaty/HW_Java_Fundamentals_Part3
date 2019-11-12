package by.home.les07.task;

public class Task08 {

	public static void main(String[] args) {

		/*
		 * 8. Дан двухмерный массив n×m элементов. Определить, сколько раз встречается
		 * число 7 среди элементов массива.
		 */

		int n = rand();
		int m = rand();

		int[][] ar = ar(n, m);

		PrintArray.print(ar);

		System.out.println("♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");

		printCount(print(ar));

	}

	public static int rand() {

		int a = (int) (Math.random() * 10 + 2);

		return a;
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

		int k = 0;

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (mas[i][j] == 7) {

					k++;
				}
			}
		}
		return k;
	}

	public static void printCount(int k) {

		if (k == 0) {
			System.out.println("Цифры 7 в массиве нет.");

		} else {
			System.out.println("Количество цифр 7 в массиве: " + k);
		}
	}
}