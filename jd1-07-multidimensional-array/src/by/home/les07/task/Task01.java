package by.home.les07.task;

public class Task01 {

	public static void main(String[] args) {

		/*
		 * 1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной
		 * строке была ровно одна единица, и вывести на экран.
		 */

		int[][] array = new int[3][4];
		int[][] ar = ar(array);
		System.out.println(array[2].length);
		PrintArray.print(ar);
		
	}

	public static int[][] ar(int[][] a) {
		
		for (int i = 0; i < a.length; i++) {
			a[i][0] = 1;
			for (int j = 1; j < 4; j++) {
				a[i][j] = 0;
			}
		}
		return a;
	}

}
