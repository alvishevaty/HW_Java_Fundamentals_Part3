package by.home.les07.task;

public class Task23 {

	public static void main(String[] args) {

		/*
		 * 23. Сформировать квадратную матрицу порядка N по правилу и подсчитать
		 * количество положительных элементов в ней.
		 */

		int n = rand();
		double[][] ar = ar(n);

		PrintArray.print(ar);

		System.out.println("•••••••••••••••••••••••••••••••••••");

		evenCount(ar);
	}

	public static int rand() {

		int a = (int) (Math.random() * 5 + 2);

		return a;
	}

	public static double[][] ar(int n) {

		double[][] ar = new double[n][n];

		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar[i].length; j++) {

				ar[i][j] = Math.sin((Math.pow(i, 2) + Math.pow(j, 2)) / n);

			}
		}

		return ar;
	}

	public static void evenCount(double[][] a) {

		int k = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] > 0) {
					k++;
				}
			}
		}
		System.out.println("Количество положительных эллементов массива: " + k);

	}
}