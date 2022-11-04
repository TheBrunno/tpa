import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int ant=0, at=1, prox=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um numero para ver ate ele na serie de fibonacci");
		int n = in.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(at+" ");
			prox=at+ant;
			ant=at;
			at=prox;
		}
	}
}
