import java.util.Scanner;

public class TituloEleitor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int anoNasc, anoAtual, idade;
		
		System.out.println("Digite o ano de nascimento");
		anoNasc = in.nextInt();
		
		System.out.println("Digite o ano atual");
		anoAtual = in.nextInt();
		
		idade = anoAtual-anoNasc;
		System.out.println(idade+" anos");
		
		if (idade>=16) {
			System.out.println("Pode tirar o titulo de eleitor");
		}else {
			System.out.println("Não pode tirar o titulo de eleitor");
		}
		
		in.close();
	}
}
