package sample;

public class TaskThree {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8, 10 };
		int target = 6;
		int index = linearSearch(arr, target);
		if (index == -1) {
			System.out.println("Элемент не найден в массиве.");
		} else {
			System.out.println("Индекс элемента " + target + " в массиве: " + index);
		}

	}

	public static int linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
