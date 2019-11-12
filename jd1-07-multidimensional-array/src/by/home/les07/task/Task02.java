package by.home.les07.task;

public class Task02 {

	public static void main(String[] args) {

		/*
		 * 2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами
		 * из [0, 9].
		 */

		int[][] array = new int[2][3];

		int[][] ar = ar(array);
		PrintArray.print(ar);
	}

	public static int[][] ar(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 9);
			}
		}
		return a;
	}

}
