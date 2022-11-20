import java.util.Scanner;

public class RegraFormacao2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int SIZE = 10;
		int a[] = new int[SIZE];
		int b[] = new int[SIZE];
		int c[] = new int[SIZE];
		
		for(int i=0; i<SIZE; i++) {
			System.out.print("Digite o "+(i+1)+"º elemento do vetor A: ");
			a[i] = in.nextInt();
		}
		for(int i=0; i<SIZE; i++) {
			System.out.print("Digite o "+(i+1)+"º elemento do vetor B: ");
			b[i] = in.nextInt();
		}

		for(int i=0; i<SIZE; i++) {
			if(a[i] > b[i]) {
				c[i] = 1;
			}else if(a[i] < b[i]) {
				c[i] = -1;
			}else {
				c[i] = 0;
			}
		}

		for(int i=0; i<SIZE; i++) {
			System.out.print(c[i]+" ");
		}
		
		in.close();
	}
}
