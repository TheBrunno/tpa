import java.util.Scanner;
public class VerificarElementoVetor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int SIZE = 10;
		int a[] = new int[SIZE];
		boolean storage = false;
		
		for(int i=0; i<SIZE; i++) {
			System.out.print("Digite o "+(i+1)+"º numero: ");
			a[i] = in.nextInt();
		}
		
		System.out.print("Digite o elemento X: ");
		int x = in.nextInt();
		
		for(int i=0; i<SIZE; i++) {
			if(x == a[i]) {
				storage = true;
				break;
			}
		}
		
		if(storage) {
			System.out.print("O numero "+x+" esta armazenado no vetor");
		}else {
			System.out.println("O numero "+x+" nao esta armazenado no vetor");
		}
		in.close();
	}
}
