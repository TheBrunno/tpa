import java.util.Scanner;

public class UsuarioNovoEVelho {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] nomes = new String[5];
		int[] idades = new int[5];
		int maiorPos = 0;
		int menorPos = 0;
		int pos = 0;
		
		for(int i=0; i<=4; i++) {
			System.out.print("Digite o nome: ");
			nomes[i] = in.next();
			System.out.print("Digite a idade: ");
			idades[i] = in.nextInt();
		}
		
		for(int i : idades) {
			if(i>=idades[maiorPos]) {
				maiorPos = pos;
			}
			if(i<=idades[menorPos]) {
				menorPos = pos;
			}
			pos++;
		}
		
		System.out.print("O usuario mais novo e: "+nomes[menorPos]+" com "+idades[menorPos]+" anos e o mais velho e: "+nomes[maiorPos]+" com "+idades[maiorPos]+" anos.");
		in.close();
	}
}
