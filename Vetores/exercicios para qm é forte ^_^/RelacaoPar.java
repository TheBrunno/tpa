import java.util.Scanner;
public class RelacaoPar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int SIZE = 10;
		int a[] = new int[SIZE];
		
		for(int c=0; c<SIZE; c++) {
			System.out.print("Digite o "+(c+1)+"º numero: ");
			a[c] = in.nextInt();
		}
		
		for(int i=0; i<SIZE; i++) {
			System.out.print("( "+a[i]+" ) ");
			for(int j=0; j<=a[i]; j+=2) {
				System.out.print(j);
				if(j != a[i] && j != a[i]-1) {
					System.out.print(" -> ");
				}
			}
			System.out.println();
		}
		in.close();
	}
}
