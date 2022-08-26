import java.util.Scanner;

public class QtdeDias {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o numero do mes: ");
		int mes = in.nextInt();
		switch(mes) {
			case 4: case 6: case 9: case 11:
				System.out.println("O mes "+mes+" possui 30 dias"); break;
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("O mes "+mes+" possui 31 dias"); break;
			case 2:
				System.out.println("O mes "+mes+" possui 28 dias"); break;
			default:
				System.out.println("Digite um mes valido");
		}
	}
}
