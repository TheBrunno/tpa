import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int anoNasc;
		
		System.out.println("Digite o ano de nascimento");
		anoNasc = in.nextInt();
	
		
		if ((anoNasc%4==0 && anoNasc%100!=0) || (anoNasc%4==0 && anoNasc%100==0 && anoNasc%400==0)) {
			System.out.println("É um ano bissexto");
		}else {
			System.out.println("Não é um ano bissexto");
		}
		
		in.close();
	}
}
