import java.util.Scanner;

public class ClassificarPessoas {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o ano atual: ");
		int anoAtual = in.nextInt();
		System.out.print("Digite seu ano de nascimento: ");
		int anoNasc = in.nextInt();
		int idade = anoAtual - anoNasc;
		if(idade < 10) {
			System.out.println("Criança");
		}
		if(idade >= 10 && idade < 18) {
			System.out.println("Adolescente");
		}
		if(idade >=18 && idade < 60) {
			System.out.println("Adulto");
		}
		if(idade >= 60) {
			System.out.println("Idoso");
		}
		in.close();
	}
}
