import java.util.Scanner;
public class Somatorio {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int SIZE = 10;
		int a[] = new int[SIZE];
		int b[] = new int[SIZE];
		
		for(int i=0; i<SIZE; i++) {
			System.out.print("Digite o termo "+(i+1)+":");
			a[i] = in.nextInt();
		}
		
		for(int i=0; i<SIZE; i++){
			for(int j=0; (j+i)<SIZE; j++) {
				b[i] += a[j+i];
			}
		}
		
		for(int i=0; i<SIZE; i++) {
			System.out.print(b[i]+" ");
		}
		in.close();

	}
}
