import java.util.Scanner;

public class IdadeVelhoNovoMedia {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade, idadeV=0, idadeN=0;
		double somaIdades=0;
		for(int i=1;i<=10;i++) {
			System.out.println("Digite a idade do usuario "+i+":");
			idade = in.nextInt();
			somaIdades+=idade;
			if(idade > idadeV) {
				idadeV = idade;
			}
			if(idade < idadeN || i==1) {
				idadeN = idade;
			}
		}
		System.out.println("O usuario mais velho é: "+ idadeV);
		System.out.println("O usuario mais novo é: "+idadeN);
		System.out.println("A média das idades é: "+(somaIdades/10));
	}
}
