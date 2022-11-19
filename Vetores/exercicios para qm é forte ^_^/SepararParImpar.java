import java.util.Scanner;

public class SepararParImpar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int SIZE = 20;
		int a[] = new int[SIZE];
		int b[] = new int[SIZE];
		int qtdP = 0;
		int qtdI = 0;
		
		// input
		for(int i=0;i<SIZE;i++) {
			System.out.print("Digite o "+(i+1)+"º numero: ");
			a[i] = in.nextInt();
		}
		
		//processing
		for(int i=0; i<SIZE; i++) {
			if(a[i] % 2 == 0) {
				b[qtdP] = a[i];
				qtdP++;
			}
		}
		qtdI = qtdP;
		for(int i=0; i<SIZE; i++) {
			if(a[i] % 2 == 1) {
				b[qtdI] = a[i];
				qtdI++;
			}
		}
		
		//output
		for(int i=0; i<SIZE; i++) {
			System.out.print(b[i]+" ");
		}
		in.close();
	}
}
