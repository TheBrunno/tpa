import java.util.Scanner;

public class FatorialVetor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int SIZE = 15;
		int a[] = new int[SIZE];
		int b[] = new int[SIZE];
		int res = 0;
		
		for(int i=0; i<SIZE; i++) {
			System.out.print("Digite o "+(i+1)+"º numero: ");
			a[i] = in.nextInt();
		}
		
		for(int i=0; i<SIZE; i++) {
			res = 1;
			for(int j=a[i]; j>0; j--) {
				res *= j;
			}
			b[i] = res;
		}
		System.out.print("NUMEROS: [ ");
		for(int i=0; i<SIZE; i++) {
			System.out.print(a[i]);
			if(i+1 != SIZE) {
				System.out.print(", ");
			}
		}
		System.out.print(" ]\nFATORIAL: [ ");
		for(int i=0; i<SIZE; i++) {
			System.out.print(b[i]);
			if(i+1 != SIZE) {
				System.out.print(", ");
			}
		}
		System.out.print(" ]");
		in.close();
	}
}
