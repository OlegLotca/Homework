package sample;

import java.util.Scanner;

public class TaskSecond {

	public static void main(String[] args) {
		
		// Есть девятиэтажный дом, в котором 5 подъездов. Номер подъезда начинается с единицы. На 
		// одном этаже 4 квартиры. Напишите программу которая, получит номер квартиры с клавиатуры, и 
		// выведет на экран, на каком этаже, какого подъезда расположена эта квартира. Если такой 
		// квартиры нет в этом доме, то нужно сообщить об этом пользователю.

		int floor;
		int entrance;
		int apartmentNumber;
		int maxApartmentNumber = 4 * 9 * 5;

		Scanner scan = new Scanner(System.in);

		System.out.println("Введите номер вашей квартиры:");
		apartmentNumber = scan.nextInt();

		if (apartmentNumber > maxApartmentNumber || apartmentNumber <= 0) {
			System.out.println("Квартиры под номером " + apartmentNumber
					+ " в нашем доме нет. Пожалуйста, напишите номер квартиры от 1 до " + maxApartmentNumber + ".");
		} else {
			entrance = (apartmentNumber - 1) / (4 * 9) + 1;
			floor = ((apartmentNumber - 1) % (4 * 9) / 4 + 1);
			System.out.println("Квартира находится в - " + entrance + " подъезде, на - " + floor + " этаже.");
		}
	}
}