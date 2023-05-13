import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int[] a = new int[4];
			int sum = 0;
			for (int i = 0; i < 4; i++) {
				a[i] = fs.nextInt();
				sum += a[i];
			}
			boolean monop = false;
			for (int i = 0; i < 4; i++) {
				if (a[i] > sum - a[i]) {
					monop = true;
				}
			}
			System.out.println(monop ? "YES" : "NO");
		}
		fs.close();
	}
}
