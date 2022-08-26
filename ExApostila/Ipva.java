import java.util.Scanner;
public class Ipva {
	public static void main(String[] args) {
		double vVeiculo, ipva;
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o valor do veiculo: ");
		vVeiculo = in.nextDouble();
		ipva = vVeiculo*0.04;
		System.out.print("O valor do IPVA é: R$"+ipva);
		in.close();
	}
}
