package sample;

import java.util.Random;

public class TaskThree {

	public static void main(String[] args) {
		Random random = new Random();

		int[] firstArray = new int[15];

		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = random.nextInt(100);
		}

		int[] secondArray = new int[30];

		System.arraycopy(firstArray, 0, secondArray, 0, firstArray.length);

		for (int i = firstArray.length; i < secondArray.length; i++) {
			secondArray[i] = firstArray[i - firstArray.length] * 2;
		}

		System.out.println("Первый массив:");
		for (int i = 0; i < firstArray.length; i++) {
			System.out.print(firstArray[i] + " ");
		}

		System.out.println("\nВторой массив:");
		for (int i = 0; i < secondArray.length; i++) {
			System.out.print(secondArray[i] + " ");
		}
	}
}
