package by.home.les06.task;

public class Task06 {

	public static void main(String[] args) {

		/*
		 * 6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить
		 * его по возрастанию. Делается это следующим образом: сравниваются два соседних
		 * элемента i i+1 a и a . Если +1  i i a a , то продвигаются на один элемент
		 * вперед. Если +1  i i a a , то производится перестановка и сдвигаются на один
		 * элемент назад. Составить алгоритм этой сортировки.
		 */
		double[] ar = new double[] { 1.1, 5.4, 6.2, 8.5, 0.3, 2.9, 1.7, 4.6, 3.7, 2.1 };

		PrintArray.printDouble(ar);

		double[] array = array(ar);
		PrintArray.printDouble(array);
	}

	public static double[] array(double[] ar) {

		int count = 0;

		for (int d = ar.length / 2; d > 0; d = d / 2) {

			for (int i = d; i <= ar.length - 2;) {

				if (ar[i] < ar[i + 1]) {
					i++;
				} else {
					double t = ar[i];
					ar[i] = ar[i + 1];
					ar[i + 1] = t;
					i--;

					if (i == -1) {
						break;
					}
				}

				count++;
			}
		}
		
		System.out.println("Количество иттераций: " + count);
		
		return ar;
	}
}
