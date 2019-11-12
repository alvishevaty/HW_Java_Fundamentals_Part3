package by.home.les07.task;

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {

		/*
		 * 27. В числовой матрице поменять местами два любых столбца, т. е. все элементы
		 * одного столбца поставить на соответствующие им позиции другого, а его
		 * элементы второго переместить в первый. Номера столбцов вводит пользователь с
		 * клавиатуры.
		 */

		int n = rand();
		int m = rand();

		int[][] ar = ar(n, m);

		PrintArray.print(ar);

		System.out.println("•••••••••••••••••••••••••••••••••••");

		int j1 = writeNumberOfColumn();
		int j2 = writeNumberOfColumn();

		System.out.println("•••••••••••••••••••••••••••••••••••");

		transposition(ar ,j1, j2);


		System.out.println("•••••••••••••••••••••••••••••••••••");


	}

	public static int rand() {

		int a = (int) (Math.random() * 8 + 2);

		return a;
	}

	public static int writeNumberOfColumn() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите номер столбца: ");

		while (sc.hasNextInt() == false) {

			String s = sc.next();
			System.out.print("Введите номер столбца: ");
		}

		int a = sc.nextInt();

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

	public static int[] arOfEl(int[][] mas, int j1) {

		int[] ar = new int[mas.length];

		for (int i = 0; i < ar.length; i++) {

			ar[i] = mas[i][j1];
		}
		return ar;
	}

	public static void transposition(int[][] ar, int j1, int j2) {

		int[] mas1 = arOfEl(ar, j1);
		int[] mas2 = arOfEl(ar, j2);

		for (int i = 0; i < ar.length; i++) {

			ar[i][j1] = mas2[i];
			ar[i][j2] = mas1[i];

		}

		PrintArray.print(ar);

	}

}
