import java.util.Scanner;

public class ConsumoMedio {
	public static void main(String[] args) {
		double distanciaKm, combustivelL, consumo;
		Scanner in = new Scanner(System.in);
		System.out.print("Digite a dist�ncia total do percurso: (KM)");
		distanciaKm = in.nextDouble();
		System.out.print("Digite a quantidade de combustivel gasto no percurso: (L)");
		combustivelL = in.nextDouble();
		consumo = distanciaKm/combustivelL;
		System.out.println("O consumo por Km � "+consumo+"L");
		in.close();
	}
}
