import java.util.Scanner;

public class Palindromo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int SIZE = 10;
		int a[] = new int[SIZE];
		boolean palindrome = true;
		
		for(int i=0; i<SIZE; i++) {
			System.out.print("Digite o "+(i+1)+"º numero do vetor: ");
			a[i] = in.nextInt();
		}
		
		for(int i=0; i<SIZE; i++) {
			if(a[i] != a[(SIZE-1)-i]) {
				palindrome = false;
				break;
			}
		}
		
		if(palindrome) {
			System.out.println("O vetor digitado eh um palindromo");
		}else {
			System.out.println("O vetor digitado nao eh um palindromo");
		}
		
		in.close();
	}
}
