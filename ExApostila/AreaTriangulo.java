import java.util.Scanner;
public class AreaTriangulo {
	public static void main(String[] args) {
		double base, altura, area;
		Scanner in = new Scanner(System.in);
		System.out.print("Digite a base do triangulo: ");
		base = in.nextDouble();
		System.out.print("Digite a altura do triangulo: ");
		altura = in.nextDouble();
		area = base*altura/2;
		System.out.print("A area do triangulo é: "+area);
		in.close();
	}
}
