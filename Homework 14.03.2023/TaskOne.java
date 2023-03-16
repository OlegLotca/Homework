package sample;

public class TaskOne {

	public static void main(String[] args) {

		int[] numbers = { 5, 3, 8, 2, 7, 9, -5, 11, 25, 66 };
		int maxNumber = findMax(numbers);
		System.out.println("Максимальное число: " + maxNumber);
	}

	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
