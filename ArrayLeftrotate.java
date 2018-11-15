import java.io.*;
import java.util.*;



public class ArrayLeftrotate {

	// Complete the rotLeft function below.
	static int[] rotLeft(int[] a, int d) {
		int temp = 0;
		if (a.length !=1){
			for (int j = 0; j<d; j++){
				temp = a[0];
				for (int i=1; i<a.length; i++){
					a[i-1] = a[i];
				}
				a[a.length-1] = temp;
			}
		}
		return a;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {


		String[] nd = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nd[0]);

		int d = Integer.parseInt(nd[1]);

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}

		int[] result = rotLeft(a, d);

		for (int s:result) {
			System.out.print(s + " ");
		}


		scanner.close();
	}
}
