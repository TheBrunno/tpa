import java.util.Scanner;

public class DescParcelas {
	public static void main(String[] args) {
		double vTotal, vTotalDesc, vParcela;
		int qtdeParcelas;
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o valor total: ");
		vTotal = in.nextDouble();
		System.out.print("Digite a quantidade de parcelas: ");
		qtdeParcelas = in.nextInt();
		vTotalDesc = vTotal - vTotal * 0.1;
		vParcela = vTotalDesc / qtdeParcelas;
		System.out.println("O valor da parcela é: "+vParcela);
		in.close();
	}
}
