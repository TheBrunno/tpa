import java.util.Scanner;
public class NovoEVelho {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=1, idadeMax=0, idadeMin=0, idade;
		String nome="", nomeMax="", nomeMin="";
		while(i<=10) {
			System.out.print("Digite o nome do usuario "+i+":");
			nome = in.next();
			System.out.print("Digite a idade do usuario "+i+":");
			idade = in.nextInt();
			System.out.println();
			if(idade>idadeMax) {
				idadeMax = idade;
				nomeMax = nome;
			}
			if(idade<idadeMin || i==1) {
				idadeMin = idade;
				nomeMin = nome;
			}
			i++;
		}
		System.out.println("O usuario \""+nomeMax+"\" e o mais velho(a), com "+idadeMax+" anos");
		System.out.println("O usuario \""+nomeMin+"\" e o mais novo(a), com "+idadeMin+" anos");
	}
}
