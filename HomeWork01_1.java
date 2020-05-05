package java_day08;

public class HomeWork01_1 {
	static int[][] arr = new int[5][5];
	static int num = 1;
	static int i = 0;

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				num = (i * 5) + 1;
				for (int j = 0; j < 5; j++) {
					arr[i][j] = num++;
				}
			} else {
				if (i == 1) {
					num = (i % 2) * 10;
					for (int j = 0; j < 5; j++) {
						arr[i][j] = num--;
					}
				} else {
					num = 20;
					for (int j = 0; j < 5; j++) {
						arr[i][j] = num--;
					}
				}
			}
		}
		printArr();

	}

	public static void printArr() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] == 0 ? "\t" : arr[i][j] + "\t");

			}
			System.out.println();
		}

	}
}
