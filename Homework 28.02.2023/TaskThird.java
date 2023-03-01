package sample;

import java.util.Scanner;

public class TaskThird {

	public static void main(String[] args) {
		
		// Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей. Дано: a, 
		// b, c – стороны предполагаемого треугольника. Напишите программу, которая укажет, существует ли 
		// такой треугольник или нет

		int sideA;
		int sideB;
		int sideC;

		Scanner scan = new Scanner(System.in);

		System.out.println("Введите значение для первой стороны ▲ :");
		sideA = scan.nextInt();

		System.out.println("Введите значение для второй стороны ▲ :");
		sideB = scan.nextInt();

		System.out.println("Введите значение для третьей стороны ▲ :");
		sideC = scan.nextInt();

		if ((sideA + sideB) > sideC && (sideB + sideC) > sideA && (sideC + sideA) > sideB) {
			System.out.println("Треугольник со сторонами - " + sideA + ", " + sideB + ", " + sideC + " - существует.");
		} else {
			System.out.println("Треугольника со сторонами - " + sideA + ", " + sideB + ", " + sideC + " - не существует.");
		}

	}

}