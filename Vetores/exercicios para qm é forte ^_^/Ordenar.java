import java.util.Scanner;

public class Ordenar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int SIZE = 10;
		int a[] = new int[SIZE];
		int b[] = new int[SIZE];
		
		for(int i=0; i<SIZE; i++) {
			System.out.print("Digite o "+(i+1)+"º termo do vetor a: ");
			a[i] = in.nextInt();
		}
		
		a = ordenar(a, SIZE);
		
		for(int i=0; i<SIZE; i++) {
			b[i] = -a[i];
		}
		
		b = ordenar(b, SIZE);
		
		for(int i=0; i<SIZE; i++) {
			b[i] = -b[i];
		}
		
		
		for(int i=0; i<SIZE; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0; i<SIZE; i++) {
			System.out.print(b[i]+" ");
		}
		
		in.close();
	}
	
	public static int[] ordenar(int vetor[], int SIZE) {
		int trns;
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<i; j++) {
				if(vetor[j] > vetor[i]) {
					trns = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = trns;
				}
			}
		}
		return vetor;
	}
}
