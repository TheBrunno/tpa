import java.util.Scanner;
public class MargemLucro {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double produtoValor, margemLucro;
		String res= "s";
		while(res.equalsIgnoreCase("s")) {
			System.out.print("Digite o valor do produto: ");
			produtoValor = in.nextDouble();
			System.out.print("Digite a margem de lucro: (sem o sinal de porcentagem)");
			margemLucro = in.nextDouble();
			System.out.print("O preco de venda e: ");
			System.out.format("%.2f",(produtoValor + (produtoValor*margemLucro/100)));
			System.out.println("\nDeseja continuar? (s/n)");
			res = in.next();
		}
		System.out.println("Fim do programa");
	}
}
