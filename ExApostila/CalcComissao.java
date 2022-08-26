import java.util.Scanner;

public class CalcComissao {
	public static void main(String[] args) {
		String nomeVend;
		double salVend, valTotalVendas, comissaoVend, salFinalVend;
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o nome do vendedor: ");
		nomeVend = in.nextLine();
		System.out.print("Digite o salario fixo do vendedor: ");
		salVend = in.nextDouble();
		System.out.print("Digite o valor total de vendas: ");
		valTotalVendas = in.nextDouble();
		comissaoVend = valTotalVendas * 0.15;
		salFinalVend = salVend + comissaoVend;
		System.out.println("Nome: "+nomeVend+"\nSalario fixo: R$"+salVend+"\nSalario final: R$"+salFinalVend);
		in.close();
	}
}
