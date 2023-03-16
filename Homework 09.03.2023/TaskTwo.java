package sample;

import java.util.Scanner;

public class TaskTwo {

	public static void main(String[] args) {

		int maxLength = 0;
		String longestWord = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите несколько слов через 'Пробел':");
		String text = sc.nextLine();

		String[] words = text.split(" ");

		for (String word : words) {
			int length = word.length();

			if (length > maxLength) {
				maxLength = length;
				longestWord = word;
			}
		}

		System.out.println("Самое длинное слово: " + longestWord);
	}
}