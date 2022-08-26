import java.util.Scanner;
public class Baskara {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o coeficiente A: ");
		int a = in.nextInt();
		System.out.print("Digite o coeficiente B: ");
		int b = in.nextInt();
		System.out.print("Digite o termo independente C: ");
		int c = in.nextInt();
		int d = b*b-4*a*c;
		if(d > 0) {
			double x1 = ((-b + Math.sqrt(d)) / (2*a));
			double x2 = ((-b - Math.sqrt(d)) / (2*a));
			System.out.println("O X1 = "+x1+" E o X2 = "+x2);
		}else {
			System.out.println("Nao existe raizes dentre os numeros reais");
		}
		in.close();
	}
}
