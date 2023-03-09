package sample;

import java.util.Scanner;

public class TaskTwo {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите размер массива: ");
		int size = scanner.nextInt();

		int[] arr = new int[size];

		System.out.println("Заполните массив:");
		for (int i = 0; i < size; i++) {
			System.out.print("Элемент " + i + ": ");
			arr[i] = scanner.nextInt();
		}

		System.out.println("Массив:");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
