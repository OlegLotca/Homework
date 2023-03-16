package sample;

public class TaskThree {

	public static void main(String[] args) {

		for (int i = 2; i <= 11; i++) {
			System.out.println(String.format("%." + i + "f", Math.PI));
		}
	}

}
