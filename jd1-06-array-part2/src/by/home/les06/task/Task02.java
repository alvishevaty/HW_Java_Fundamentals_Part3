package by.home.les06.task;

public class Task02 {

	public static void main(String[] args) {

		/*
		 * 2. Даны две последовательности n m a  a  a и b  b  b 1 2 1 2 .
		 * Образовать из них новую последовательность чисел так, чтобы она тоже была
		 * неубывающей. Примечание. Дополнительный массив не использовать.
		 */
		
		int [] masA = new int[] {1, 3, 5, 7, 9, 11, 13};
		int [] masB = new int[] {2, 4, 6, 8, 10, 12, 14};
		int l3 = masA.length + masB.length;
		
		int[] mas31 = array1(masA, l3);
		int[] mas32 = array2(mas31, masA, masB, l3);
		int[] mas3 = array3(mas32);
		
		PrintArray.print(masA);
		PrintArray.print(masB);
		PrintArray.print(mas3);
	}
	
	public static int[] array1(int[] masA, int l3) {
		int[] mas3 = new int[l3];
		int j = 0;
		for (int i = 0; i < l3 & j < masA.length; i++, j++) {
			mas3[i] = masA[j];
		}
		return mas3;
	}
	
	public static int[] array2(int[] mas3, int[] masA, int[] masB, int l3) {
		int j = 0;
		for (int i = masA.length; i < l3 & j < masB.length; i++, j++) {
			mas3[i] = masB[j];
		}
		return mas3;
	}
	
	public static int[] array3(int[] mas3) {
		for (int i = 0; i < mas3.length - 1; i++) {
			for (int j = 0; j < mas3.length - i - 1; j++) {
				if (mas3[j] > mas3[j + 1]) {
					int t = mas3[j];
					mas3[j] = mas3[j + 1];
					mas3[j + 1] = t;
				}
			}
		}
		
		return mas3;
	}
}
