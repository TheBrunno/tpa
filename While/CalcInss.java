import java.util.Scanner;
public class CalcInss {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double salario, desc, novoSalario;
		int i=1;
		while (i<=4) {
			System.out.print("\nDigite o salario do "+i+" funcionario: ");
			salario = in.nextDouble();
			if (salario>=2000) {
				System.out.println("\nDesconto de 11%");
				desc = 0.11*salario;
				novoSalario = salario-desc;
				System.out.print("Seu salario tera o desconto de: R$");
				System.out.format("%.2f", desc);
				System.out.print(" Ficando: R$");
				System.out.format("%.2f", novoSalario);
			}else {
				System.out.println("\ndesconto de 8,5%");
				desc = 0.085*salario;
				novoSalario = salario-desc;
				System.out.print("Seu salario tera o desconto de: R$");
				System.out.format("%.2f", desc);
				System.out.print(" Ficando: R$");
				System.out.format("%.2f", novoSalario);
			}
			i++;
		}
	}
}
