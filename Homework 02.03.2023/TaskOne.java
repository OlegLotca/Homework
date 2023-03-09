package sample;

import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long factorial = 1;

		System.out.println("Введите число:");
		int n = sc.nextInt();

		if (n > 4 && n < 16) {
			for (int i = 1; i <= n; i++) {
				factorial = factorial * i;
			}
			System.out.println("Факториал числа " + n + " = " + factorial);
		} else {
			System.out.println("Введенные вами данные некорректны, пожалуйста, проверьте число");
		}
	}
}