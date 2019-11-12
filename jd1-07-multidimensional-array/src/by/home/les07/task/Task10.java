package by.home.les07.task;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		/*
		 * 10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
		 */

		int n = rand();
		int m = rand();
		int[][] ar = ar(n, m);

		PrintArray.print(ar);

		System.out.println("♦________________________________________♦");

		int k = scanStr(n);
		int p = scanCol(m);

		System.out.println("♦________________________________________♦");

		printStr(ar, k);
		System.out.println();
		printCol(ar, p);

	}

	public static int rand() {

		int a = (int) (Math.random() * 5 + 2);

		return a;
	}

	public static int scanStr(int n) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите номер строки: ");

		while (sc.hasNextInt() == false) {

			String s = sc.next();
			System.out.print("Введите номер строки: ");
		}

		int k = sc.nextInt();

		if (k >= n) {
			System.out.println("Вы вышли за пределы массива. Выводится последняя строка.");
			k = n - 1;
		}

		return k;
	}

	public static int scanCol(int m) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите номер столбца: ");

		while (sc.hasNextInt() == false) {

			String s = sc.next();
			System.out.print("Введите номер столбца: ");
		}

		int k = sc.nextInt();

		if (k >= m) {
			System.out.println("Вы вышли за пределы массива. Выводится последний столбец.");
			k = m - 1;
		}

		return k;
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

	public static void printStr(int[][] mas, int k) {

		for (int i = 0; i < mas.length; i++) {

			if (i == k) {

				for (int j = 0; j < mas[i].length; j++) {

					System.out.print(mas[i][j] + " | ");
				}
			}

		}
	}

	public static void printCol(int[][] mas, int p) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (j == p) {

					System.out.print(mas[i][j] + " | ");
				}
			}
		}
	}
}
