package by.home.les06.task;

public class Task04 {

	public static void main(String[] args) {

		/*
		 * 4. Сортировка обменами. Дана последовательность чисел n a a a     1 2
		 * .Требуется переставить числа в порядке возрастания. Для этого сравниваются
		 * два соседних числа 1+i i a и a . Если 1+  i i a a , то делается
		 * перестановка. Так продолжается до тех пор, пока все элементы не станут
		 * расположены в порядке возрастания. Составить алгоритм сортировки, подсчитывая
		 * при этом количества перестановок.
		 */

		int[] ar = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		PrintArray.print(ar);
		PrintArray.print(sort(ar));
	}

	public static int[] sort(int[] ar) {

		int h = 0;

		for (int j = ar.length; j > 0; j--) {

			for (int i = 0; i < ar.length - 1; i++) {

				if (ar[i] < ar[i + 1]) {

					int t = ar[i];
					ar[i] = ar[i + 1];
					ar[i + 1] = t;
					h++;
				}
			}
		}

		System.out.println("Количество перестановок: " + h);

		return ar;
	}

}
