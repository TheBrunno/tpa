import java.util.Scanner;
public class Fatorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite um numero para ver seu fatorial: ");
		int n = in.nextInt();
		int i = n-1;
		while(i >= 1) {
			n = n*i;
			i--;
		}
		System.out.println(n);
	}
}
