import java.util.Scanner;

public class AgenciaViagens {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1 - ILHABELA");
		System.out.println("2 - FERNANDO DE NORONHA");
		System.out.print("Qual o numero do destino: ");
		double valTotal;
		int des = in.nextInt();
		if(des != 1 && des != 2) {
			System.out.println("Digite um numero de destino valido");
		}else {
			System.out.print("Quantos dias voce ira ficar na cidade: ");
			int dias = in.nextInt();
			if(des == 1) {
				if(dias>=2 && dias<=5) {
					valTotal = dias*240;
				}else if(dias>=6 && dias<=10) {
					valTotal = dias*220+130;
				}else {
					valTotal = dias*210+150;	
				}
			}else {
				if(dias>=2 && dias<=5) {
					valTotal = dias*400+100;
				}else if(dias>=6 && dias<=10) {
					valTotal = dias*410+150;
				}else {
					valTotal = dias*420+200;
				}				
			}
			System.out.println("Voce devera pagar: "+valTotal);
		}
		in.close();
	}
}
