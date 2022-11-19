import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		
		System.out.println("Digite o número");
		n = in.nextInt();
		
		if (n%2==0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
		
		in.close();
	}
}
