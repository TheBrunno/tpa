import java.util.Scanner;

public class Inverso {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int SIZE = 10;
		
		int a[] = new int[SIZE];
		int b[] = new int[SIZE];

		for(int i=0; i<SIZE; i++){
			System.out.print("Digite o "+(i+1)+"º numero: ");
			a[i] = in.nextInt();
		}
		
		for(int i=(a.length-1);i>=0;i--) {
			b[a.length-1-i] = a[i];
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
			if(i<a.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]);
			if(i<b.length-1) {
				System.out.print(", ");
			}
		}
		
		in.close();
	}
}
