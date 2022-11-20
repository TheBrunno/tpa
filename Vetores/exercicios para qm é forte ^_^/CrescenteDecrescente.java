import java.util.Arrays;
import java.util.Scanner;

public class CrescenteDecrescente {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int SIZE = 10;
		int a[] = new int[SIZE];
		int b[] = new int[SIZE];
		int c[] = new int[SIZE];
		
		for(int i=0; i<SIZE; i++) {
			System.out.print("Digite o "+(i+1)+"º numero do vetor: ");
			a[i] = in.nextInt();
			b[i] = a[i];
			c[i] = a[i];
		}
		
		Arrays.sort(b);
		
		for(int i=0; i<SIZE; i++) {
			c[i] = -c[i];
		}
		
		Arrays.sort(c);
		
		for(int i=0; i<SIZE; i++) {
			c[i] = -c[i];
		}
		
		System.out.print("B - ");
		for(int i=0; i<SIZE; i++) {
			System.out.print(b[i] + " ");
		}
		
		System.out.print("\nC - ");
		for(int i=0; i<SIZE; i++) {
			System.out.print(c[i] + " ");
		}
		
		in.close();

	}
}
