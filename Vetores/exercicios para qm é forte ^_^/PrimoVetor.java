import java.util.Scanner;

public class PrimoVetor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int SIZE = 10;
		int a[] = new int[SIZE];
		boolean primo;
		
		for(int c=0; c<SIZE; c++) {
			System.out.print("Digite o "+(c+1)+"º numero: ");
			a[c] = in.nextInt();
		}
		
		for(int i=0; i<SIZE; i++) {
			primo = true;
			if(a[i] == 0 || a[i] == 1) {
				System.out.println("O numero "+a[i]+" nao eh primo");
				primo = false;
			}
			for(int j=2; j<a[i]; j++) {
				if(a[i]%j==0 && primo) {
					System.out.println("O numero "+a[i]+" nao eh primo");
					primo = false;
				}
			}
			if(primo) {
				System.out.println("O numero "+a[i]+" eh primo");
			}
		}
		in.close();
	}
}
