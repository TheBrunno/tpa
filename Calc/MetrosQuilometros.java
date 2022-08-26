import java.util.Scanner;
public class MetrosQuilometros {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double met, km;
		System.out.println("Digite o quantidade de metros: ");
		met = in.nextDouble();
		km = met / 1000;
		System.out.println(met+"m é igual a "+km+"km");
		in.close();
	}
}
