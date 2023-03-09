package sample;

import java.util.Scanner;

public class TaskTwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number;
		System.out.println("Введите число, для которого нужно вывести таблицу умножения:");
		number = sc.nextInt();

		for (int i = 1; i <= 10; i++) {

			System.out.println(number + " * " + i + " = " + (number * i));

		}

	}

}
