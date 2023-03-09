package sample;

public class TaskOne {

	public static void main(String[] args) {

		int[] numbers = { 0, 5, 2, 4, 7, 1, 3, 19 };
		int count = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				count++;
			}
		}

		System.out.println("Количество нечетных чисел: " + count);
	}
}
