import java.util.Scanner;
public class SomaQuadrado {
	public static void main (String[] args) {
		int a,b,c,soma;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um numero");
		a = in.nextInt();
		System.out.println("Digite outro numero");
		b = in.nextInt();
		System.out.println("Digite outro numero");
		c = in.nextInt();
		soma = a*a+b*b+c*c; 
		System.out.println("A soma dos quadrados de " + a + " , " + b + " e " + c + " é igual a " + soma);
		in.close();
	}
}
