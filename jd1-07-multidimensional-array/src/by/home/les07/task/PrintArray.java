package by.home.les07.task;

public class PrintArray {

	public static void print(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			
			System.out.print("{");
			
			for (int j = 0; j < mas[i].length - 1; j++) {
				System.out.print(mas[i][j] + "\t");
			}
			
			System.out.println(mas[i][mas[i].length - 1] + "}");
		}
	}
	
	public static void print(double[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			
			System.out.print("{");
			
			for (int j = 0; j < mas[i].length - 1; j++) {
				System.out.print(mas[i][j] + "\t");
			}
			
			System.out.println(mas[i][mas[i].length - 1] + "}");
		}
	}
}
