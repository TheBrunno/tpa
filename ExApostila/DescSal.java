import java.util.Scanner;

public class DescSal {
	public static void main(String[] args) {
		double descSal, salBruto;
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o salario bruto: ");
		salBruto = in.nextDouble();
		descSal = salBruto-(salBruto*0.06);
		System.out.print("O salario com o desconto do vale transporte é: "+ descSal);
		in.close();
	}
}
