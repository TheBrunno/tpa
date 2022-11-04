import java.util.Scanner;

public class Primo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int n = in.nextInt();
		boolean primo = true;
		if(n==1) {
			primo=false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				primo=false;
			}
		}
		if(primo) {
			System.out.println("O numero "+n+" é primo");
		}else {
			System.out.println("O numero "+n+" não é primo");
		}
	}
}
