package sample;

import java.util.Scanner;

public class TaskTwo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите ширину прямоугольника: ");
		int width = scanner.nextInt();
		System.out.print("Введите высоту прямоугольника: ");
		int height = scanner.nextInt();

		drawRectangle(width, height);
	}

	public static void drawRectangle(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
