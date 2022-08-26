import java.util.Scanner;
public class Cantina {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o codigo do item: ");
		int pesq = in.nextInt();
		switch(pesq) {
			case 1:
				System.out.println("Cachorro quente --- R$ 8,00");
				break;
			case 2:
				System.out.println("Cheeseburger --- R$ 12,00");
				break;
			case 3:
				System.out.println("X-Salada --- R$ 15,00");
				break;
			case 4:
				System.out.println("Misto Quente --- R$ 11,00");
				break;
			case 5:
				System.out.println("Pao na chapa --- R$ 6,00");
				break;
			default:
				System.out.println("Digite um numero de item valido");
		}
	}
}
