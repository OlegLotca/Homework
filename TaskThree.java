package sample;

import java.util.Scanner;

public class TaskThree {

	public static void main(String[] args) {

		// Один литр топлива стоит 1.2$. Ваш автомобиль тратит на 100 км пути 8 литров
		// топлива.
		// Вы собрались в поездку в соседний город. Расстояние до этого города
		// составляет 120
		// км. Вычислите и выведите на экран сколько вам нужно заплатить за топливо для
		// поездки

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter fuel price for 1 liter ($) and press (Enter)");
			double priceForOneLiter = sc.nextDouble();
			System.out.println("Enter your consumption (l) and press (Enter)");
			double consumption = sc.nextDouble();
			System.out.println("Enter your distance (km) and press (Enter)");
			double distance = sc.nextDouble();

			double totalSum;

			totalSum = (consumption * priceForOneLiter * distance) / 100;

			System.out.println("Всего вы должны заплатить за " + distance + " km - " + totalSum + " $");
		}

	}

}