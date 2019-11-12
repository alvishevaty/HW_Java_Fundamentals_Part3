package by.home.les06.task;

public class Task07 {

	public static void main(String[] args) {

		/*
		 * 7. Пусть даны две неубывающие последовательности действительных чисел n m a 
		 * a  a и b  b  b 1 2 1 2 . Требуется указать те места, на которые нужно
		 * вставлять элементы последовательности m b  b  b 1 2 в первую
		 * последовательность так, чтобы новая последовательность оставалась
		 * возрастающей.
		 */

		double[] ar1 = new double[] { 0.3, 1.1, 1.7, 2.1, 2.9, 3.7, 4.6, 5.4, 6.2, 8.5 };
		double[] ar2 = new double[] { 1.2, 2.5, 2.6, 3.5, 4.3, 4.9, 5.7, 6.6, 7.7, 8.1 };

		double[] ar3 = array(ar1, ar1.length + ar2.length);

		System.out.print("Первая последовательность: ");
		PrintArray.printDouble(ar1);
		System.out.print("Вторая последовательность: ");
		PrintArray.printDouble(ar2);
		System.out.println();
		PrintArray.printDouble(ar3);

		compare(ar3, ar1, ar2);

	}

	public static double[] array(double[] a, int l) {
		double[] ar = new double[l];
		for (int i = 0; i < a.length; i++) {
			ar[i] = a[i];
		}
		return ar;
	}

	public static void compare(double[] ar, double[] a, double[] b) {

		for (int i = 0; i < b.length; i++) {

			for (int j = 0; j < ar.length; j++) {

				if (b[i] < ar[j]) {

					System.out.println("Вставить значение b[" + i + "] = " + b[i] + " в ячейку " + j);

					int l = j;
					double[] t = new double[ar.length - l];
					for (int y = 0; y < t.length; y++) {
						t[y] = ar[l];
						l++;
					}

					ar[j] = b[i];

					for (int k = j + 1, g = 0; k < ar.length; k++, g++) {

						ar[k] = t[g];

					}
					PrintArray.printDouble(ar);
					System.out.println("_____________________________________________________________________");
					break;
				}
			}
		}
	}

}
