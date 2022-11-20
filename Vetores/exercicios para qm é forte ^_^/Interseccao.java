import java.util.Scanner;

public class Interseccao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int SIZE = 10;
		int a[] = new int[SIZE];
		int b[] = new int[SIZE];
		int sizeC = 0;
		int lastPositionC = 0;
		
		for(int i=0; i<SIZE; i++) {
			System.out.print("Digite o elemento nº "+(i+1)+" no vetor A: ");
			a[i] = in.nextInt();
		}

		for(int i=0; i<SIZE; i++) {
			System.out.print("Digite o elemento nº "+(i+1)+" no vetor B: ");
			b[i] = in.nextInt();
		}
		
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				if(b[j] == a[i]) {
					sizeC++;
					break;
				}
			}
		}
		
		int c[] = new int[sizeC];
		
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				if(b[j] == a[i]) {
					c[lastPositionC] = a[i];
					lastPositionC++;
					break;
				}
			}
		}
		
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]+" ");
		}
		in.close();
	}
}
