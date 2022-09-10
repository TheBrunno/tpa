import java.util.Scanner;
public class BaseExpoente {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite a base: ");
		int base = in.nextInt(), res=base;
		System.out.print("Digite um expoente: ");
		int expoente = in.nextInt(), i=1;
		while(i<expoente) {
			res = res*base;
			i++;
		}
		System.out.println(res);
	}
}
