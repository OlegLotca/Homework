package sample;

import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String text;
		System.out.println("Введите какой-нибудь текст на английском языке:");

		text = sc.nextLine();
		text = text.toLowerCase();

		int count = 0;
		char[] symbols = text.toCharArray();
		for (int i = 0; i < symbols.length; i++) {
			char s = symbols[i];

			if (s == 'b') {
				count += 1;
			}
		}
		System.out.println("Количество символа 'b' в этом тексте: " + count);

	}

}