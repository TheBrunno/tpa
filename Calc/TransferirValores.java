import java.util.Scanner;
public class TransferirValores {
	public static void main(String[] args) {
		int a, b, c;
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o valor de A:");
		a = in.nextInt();
		System.out.print("Digite o valor de B:");
		b = in.nextInt();
		c = a;
		a=b;
		b=c;
		System.out.print("A: "+a+"\nB: "+b);
		in.close();
	}
}
