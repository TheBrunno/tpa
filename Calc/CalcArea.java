import java.util.Scanner;

public class CalcArea {
	public static void main(String[] args) {
		double r, area;
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o raio da circunferencia: ");
		r = in.nextDouble();
		area = 3.141592*r*r;
		System.out.print("A area da circunferencia é: "+ area);
		in.close();
	}
}
