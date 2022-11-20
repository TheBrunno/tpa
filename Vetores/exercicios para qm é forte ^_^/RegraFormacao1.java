import java.util.Scanner;

public class RegraFormacao1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int SIZE = 10;
		int a[] = new int[SIZE];
		int b[] = new int[SIZE];
		
		for(int i=0; i<SIZE; i++) {
			System.out.print("Digite o "+(i+1)+"º elemento: ");
			a[i] = in.nextInt();
		}
		
		for(int i=0; i<SIZE; i++) {
			if(a[i] % 2 == 0) {
				b[i] = 1;
			}else {
				b[i] = 0;
			}
		}
		
		for(int i=0; i<SIZE; i++) {
			System.out.print(b[i]+" ");
		}
		
		in.close();

	}
}
