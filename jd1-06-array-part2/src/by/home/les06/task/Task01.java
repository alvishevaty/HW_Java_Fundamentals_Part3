package by.home.les06.task;

public class Task01 {

	public static void main(String[] args) {

		/*
		 * 1. Заданы два одномерных массива с различным количеством элементов и
		 * натуральное число k. Объединить их в один массив, включив второй массив между
		 * k-м и (k+1) - м элементами первого, при этом не используя дополнительный
		 * массив.
		 */

		int[] mas1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] mas2 = new int[] { 1, 2, 3, 4 };
		int k = 5;

		int l1 = mas1.length;
		int l2 = mas2.length;
		int l3 = l1 + l2;
		int[] mas31 = array1(mas1, l3, k);
		int[] mas32 = array2(mas31, mas2, l3, l2, k);
		int[] mas3 = array3(mas32, mas1, l3, l2, l1, k);

		PrintArray.print(mas1);
		PrintArray.print(mas2);
		PrintArray.print(mas3);
	}

	public static int[] array1(int[] mas1, int l3, int k) {

		int[] mas3 = new int[l3];

		for (int i = 0; i <= k; i++) {
			mas3[i] = mas1[i];
		}

		return mas3;
	}

	public static int[] array2(int[] mas3, int[] mas2, int l3, int l2, int k) {

		for (int i = k + 1, j = 0; i < l3 & j < l2; i++, j++) {
			mas3[i] = mas2[j];
		}

		return mas3;
	}

	public static int[] array3(int[] mas3, int[] mas1, int l3, int l2, int l1, int k) {

		for (int j = l3 - (l3 - l2 - k) + 1, h = k + 1; j < l3 & h < l1; j++, h++) {
			mas3[j] = mas1[h];
		}

		return mas3;
	}
}
