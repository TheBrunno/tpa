import java.util.Scanner;

public class Raizes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int SIZE = 10;
		double a[] = new double[SIZE];
		double b[] = new double[SIZE];
		
		for(int i=0; i<SIZE; i++) {
			System.out.print("digite o item "+(i+1)+" do vetor: ");
			a[i] = in.nextDouble();
		}
		
		for(int i=0;i<a.length;i++) {
			b[i] = Math.sqrt(a[i]);
			if (i == 0) {
				System.out.print("[");
			}else {
				System.out.print(", ");
			}
			System.out.print(b[i]);
			if(i == SIZE-1) {
				System.out.print("]");
			}
		}
		in.close();
	}
}
