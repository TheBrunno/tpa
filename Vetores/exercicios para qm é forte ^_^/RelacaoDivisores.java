import java.util.Scanner;

public class RelacaoDivisores {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int SIZE = 3;
		int a[] = new int[SIZE];
		
		// input
		for(int i=0; i<SIZE; i++) {
			System.out.print("Digite o "+(i+1)+"º numero: ");
			a[i] = in.nextInt();
		}
		
		// processing and output
		for(int i=0; i<SIZE; i++) {
			System.out.print("( "+a[i]+" ) ");
			for(int c=1; c<=a[i]; c++) {
				if(a[i]%c==0) {
					System.out.print(c);
					if(c != a[i] && c != a[i]-1) {
						System.out.print(" -> ");
					}
				}
			}
			System.out.println();
		}
		in.close();
	}
}
