package by.home.les07.task;

import java.util.Scanner;

public class Task26 {

	public static void main(String[] args) {

		/*
		 * 26. С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить
		 * с массивом следующие действия: а) вычислить сумму отрицательных элементов в
		 * каждой строке; б) определить максимальный элемент в каждой строке; в)
		 * переставить местами максимальный и минимальный элементы матрицы.
		 */

		int n = rand();
		int m = rand();

		int[][] ar = ar(n, m);

		PrintArray.print(ar);

		System.out.println("•••••••••••••••••••••••••••••••••••");

		sumOfNegEl(ar);

		System.out.println("•••••••••••••••••••••••••••••••••••");

		maxEl(ar);

		System.out.println("•••••••••••••••••••••••••••••••••••");

		transposition(ar);

	}

	public static int rand() {

		int a = (int) (Math.random() * 3 + 2);

		return a;
	}

	public static int writeElement() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите значение элемента: ");

		while (sc.hasNextInt() == false) {

			String s = sc.next();
			System.out.print("Введите значение элемента: ");
		}

		int a = sc.nextInt();

		return a;
	}

	public static int[][] ar(int n, int m) {

		int[][] ar = new int[n][n];

		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar[i].length; j++) {

				ar[i][j] = writeElement();
			}
		}
		return ar;
	}

	public static void sumOfNegEl(int[][] ar) {

		int sum = 0;

		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar[i].length; j++) {

				if (ar[i][j] < 0) {

					sum = sum + ar[i][j];
				}
			}
			System.out.println("Сумма отрицательных элементов " + i + "-ой строки: " + sum);

			sum = 0;
		}
	}

	public static void maxEl(int[][] ar) {

		for (int i = 0; i < ar.length; i++) {

			int k = ar[i][0];

			for (int j = 0; j < ar[i].length; j++) {

				if (k < ar[i][j]) {

					k = ar[i][j];
				}
			}
			System.out.println("Максимальный элемент в " + i + "-ой строке: " + k);

			k = ar[i][0];
		}
	}

	public static void transposition(int[][] ar) {

		int[][] ar1 = ar;

		int k = ar[0][0];
		int indMaxX = 0;
		int indMaxY = 0;

		int n = ar[0][0];
		int indMinX = 0;
		int indMinY = 0;

		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar[i].length; j++) {

				if (k < ar[i][j]) {

					k = ar[i][j];
					indMaxX = i;
					indMaxY = j;

				}
			}
		}

		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar[i].length; j++) {

				if (n > ar[i][j]) {

					n = ar[i][j];
					indMinX = i;
					indMinY = j;
				}
			}
		}

		ar1[indMaxX][indMaxY] = n;
		ar1[indMinX][indMinY] = k;

		PrintArray.print(ar1);
	}

}
