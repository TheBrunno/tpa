import java.util.Scanner;


public class MenorMaiorIdade {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res = 1, anoAt, anoNa, idade;
		System.out.print("Digite o ano atual: ");
		anoAt = in.nextInt();
		do {
			System.out.print("Digite o ano de nascimento: ");
			anoNa = in.nextInt();
			idade = anoAt-anoNa;
			System.out.println(idade+" anos");
			if (idade >= 18) {
				System.out.print("Maior de idade");
			}else {
				System.out.print("Menor de idade");
			}
			System.out.println("\nDeseja continuar a execução? (1-para SIM ou 2-para NÃO)");
			res = in.nextInt();
		}while(res!=2);
		System.out.println("---- Fim da execução ----");
		in.close();
	}
}
