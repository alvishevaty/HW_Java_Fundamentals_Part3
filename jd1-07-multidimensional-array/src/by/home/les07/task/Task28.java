package by.home.les07.task;

import java.util.Scanner;

public class Task28 {

	public static void main(String[] args) {

		/*
		 * 28. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом
		 * столбце. Определить, какой столбец содержит максимальную сумму.
		 */

		int n = rand();
		int m = rand();

		int[][] ar = ar(n, m);

		PrintArray.print(ar);

		System.out.println("•••••••••••••••••••••••••••••••••••");

		int[] a = sumOfEl(ar);
		sumOfCol(a);

		System.out.println("•••••••••••••••••••••••••••••••••••");

		maxSumOfCol(a);

	}

	public static int rand() {

		int a = (int) (Math.random() * 8 + 3);

		return a;
	}

	public static int[][] ar(int n, int m) {

		int[][] ar = new int[n][m];

		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar[i].length; j++) {

				ar[i][j] = rand();
			}
		}
		return ar;
	}

	public static int[] sumOfEl(int[][] mas) {

		int[] ar = new int[mas[0].length];
		int sum = 0;

		for (int j = 0; j < mas[0].length; j++) {

			for (int i = 0; i < mas.length; i++) {

				sum = sum + mas[i][j];
			}

			ar[j] = sum;
			sum = 0;
		}

		return ar;
	}

	public static void sumOfCol(int[] mas) {

		for (int i = 0; i < mas.length; i++) {

			System.out.println("Сумма элементов " + i + "-ого столбца: " + mas[i]);
		}
	}

	public static void maxSumOfCol(int[] ar) {

		int max = ar[0];
		int maxIndex = 0;

		for (int i = 0; i < ar.length; i++) {

			if (max < ar[i]) {

				max = ar[i];
				maxIndex = i;
			}

		}
		System.out.println("Максимальная сумма элементов в столбце " + maxIndex);

	}

}
