import java.util.Scanner;

public class DiferençaVetores {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int SIZE = 10;
		int a[] = new int[SIZE];
		int b[] = new int[SIZE];
		int qtdeEquals = 0;
		int lastElement = 0;
		int lastPositionC = 0;
		boolean equals = false;
		
		for(int i=0; i<SIZE; i++) {
			System.out.print("Digite o elemento de nº "+(i+1)+" do vetor A: ");
			a[i] = in.nextInt();
		}
		for(int i=0; i<SIZE; i++) {
			System.out.print("Digite o elemento de nº "+(i+1)+" do vetor B: ");
			b[i] = in.nextInt();
		}
		
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				if(a[i] == b[j]) {
					qtdeEquals++;
					break;
				}
			}
		}
		
		int c[] = new int[SIZE-qtdeEquals];
		
		for(int i=0; i<SIZE; i++) {
			equals = false;
			for(int j=0; j<SIZE; j++) {
				lastElement = a[i];
				if(a[i] == b[j]) {
					equals = true;
					break;
				}
			}
			if(!equals) {
				c[lastPositionC] = lastElement;
				lastPositionC++;
			}
		}
		
		if(c.length == 0) {
			System.out.println("Os vetores possuem os mesmos elementos");
		}
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i] + " ");
		}
		
		in.close();

	}
}
