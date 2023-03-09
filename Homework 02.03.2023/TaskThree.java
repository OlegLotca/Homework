package sample;

import java.util.Scanner;

public class TaskThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите ширину прямоугольника и нажмите (Enter)");
		int width = sc.nextInt();
		System.out.println("Введите высоту прямоугольника и нажмите (Enter)");
		int height = sc.nextInt();

		if (height > 0 && width > 0) {
			for (int i = 1; i <= height; i++) {
				for (int j = 1; j <= width; j++) {
					if (j == 1 || j == width || i == 1 || i == height) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("Такого прямоугольника не существует, проверьте введенные вами данные.");
		}

	}

}