import java.util.*;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int invoice[][][] = new int[15][2][3];
		Scanner inp = new Scanner(System.in);

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 2; j++) {
				for (int h = 0; h < 2; h++) {
					System.out.println("Enter the value:");
					invoice[i][j][h] = inp.nextInt();
				}
			}
		}
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 2; j++) {
				for (int h = 0; h < 2; h++) {
					System.out.println(invoice[i][j][h]);
				}
			}
		}

	}
}