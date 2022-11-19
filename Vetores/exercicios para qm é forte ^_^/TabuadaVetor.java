import java.util.Scanner;

public class TabuadaVetor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int SIZE = 5;
		int a[] = new int[SIZE];
		
		// input
		for(int i=0; i<SIZE; i++) {
			System.out.print("Digite o "+(i+1)+"º numero: ");
			a[i] = in.nextInt();
		}
		
		// processing and output
		for(int i=0; i<SIZE; i++) {
			for(int j=1; j<=10; j++) {
				System.out.println(a[i]+" x "+j+" = "+a[i]*j);
			}
			System.out.println();
		}
		
		in.close();
	}
}
