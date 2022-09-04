import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite um numero para ver sua tabuada: ");
		int num = in.nextInt();
		int i=0;
		while(i<=10) {
			System.out.println(num+" X "+i+" = "+num*i);
			i++;
		}
	}
}
