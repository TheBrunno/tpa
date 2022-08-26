import java.util.Scanner;
public class Rodizio {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o ultimo digito de sua placa: ");
		int p = in.nextInt();
		switch(p) {
			case 1: case 2: System.out.println("Não pode digirir na Segunda-Feira");
				break;
			case 3: case 4: System.out.println("Não pode digirir na Terça-feira");
				break;
			case 5: case 6: System.out.println("Não pode digirir na Quarta-feira");
				break;
			case 7: case 8: System.out.println("Não pode digirir na Quinta-feira");
				break;
			case 9: case 0: System.out.println("Não pode digirir na Sexta-feira");
				break;
			default:
				System.out.println("Numero invalido");
		}
	}
}
