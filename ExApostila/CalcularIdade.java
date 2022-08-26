import java.util.Scanner;
public class CalcularIdade {
	public static void main(String[] args) {
		int anoNasc, anoAtual, idade;
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o ano de nascimento: ");
		anoNasc = in.nextInt();
		System.out.print("Digite o ano atual: ");
		anoAtual = in.nextInt();
		idade = anoAtual - anoNasc;
		System.out.print("A idade é: "+idade);
		in.close();
	}
}
