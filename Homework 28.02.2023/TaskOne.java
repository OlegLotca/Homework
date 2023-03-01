package sample;

import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {

		// Написать программу которая считает 4 целых числа с клавиатуры и выведет на
		// экран самое большое из них.

		Scanner sc = new Scanner(System.in);

		int number1;
		int number2;
		int number3;
		int number4;
		int highestNumber;

		System.out.println("Enter the first any number and press (Enter)");
		number1 = sc.nextInt();

		System.out.println("Enter the second any number and press (Enter)");
		number2 = sc.nextInt();

		System.out.println("Enter the third any number and press (Enter)");
		number3 = sc.nextInt();

		System.out.println("Enter the fourth any number and press (Enter)");
		number4 = sc.nextInt();

		highestNumber = number1;

		if (number2 > highestNumber) {
			highestNumber = number2;
		}
		if (number3 > highestNumber) {
			highestNumber = number3;
		}
		if (number4 > highestNumber) {
			highestNumber = number4;
		}

		System.out.println("The highest number is - " + highestNumber);

	}
}