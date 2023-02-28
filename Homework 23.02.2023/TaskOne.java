package sample;

public class TaskOne {

	public static void main(String[] args) {

		// Написать программу которая вычислит и выведет на экран площадь треугольника
		// если
		// известны его стороны (sideA = 0.3, sideB = 0.4, sideC = 0.5). Для вычисления
		// использовать формулу Герона.

		double sideA = 0.3;
		double sideB = 0.4;
		double sideC = 0.5;

		double p = (sideA + sideB + sideC) / 2;

		double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));

		System.out.println("Площадь ▲ = " + area + " (единица измерения)");
	}

}


