package by.home.les06.task;

public class Task03 {

	public static void main(String[] args) {

		/*
		 * 3. Сортировка выбором. Дана последовательность чисел n a a a     1 2
		 * .Требуется переставить элементы так, чтобы они были расположены по убыванию.
		 * Для этого в массиве, начиная с первого, выбирается наибольший элемент и
		 * ставится на первое место, а первый - на место наибольшего. Затем, начиная со
		 * второго, эта процедура повторяется. Написать алгоритм сортировки выбором.
		 */
		
		int[] ar = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		PrintArray.print(ar);
		
		int[] newAr = sort(ar);
		
		PrintArray.print(newAr);
		
	}
	
	public static int[] sort(int[] ar) {
		for(int i = 0; i < ar.length; i++) {
			int max = ar[i];
			int maxIndex = i;
			for(int j = i + 1; j <ar.length; j++) {
				if (max < ar[j]) {
					max = ar[j];
					maxIndex = j;
				}
			}
			if (i != maxIndex) {
				int t = ar[i];
				ar[i] = ar[maxIndex];
				ar[maxIndex] = t;
			}
		}
		return ar;
	}

}
