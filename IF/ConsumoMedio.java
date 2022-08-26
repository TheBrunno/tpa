import java.util.Scanner;

public class ConsumoMedio {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite a distancia: (KM)");
		double distancia = in.nextInt();
		System.out.print("Digite a capacidade do tanque: (L)");
		double capacidade = in.nextInt();
		double gasto = distancia / capacidade;
		if(gasto>=10) {
			System.out.println("Economico");
		}else {
			System.out.println("Nao economico");
		}
		in.close();
	}
}
