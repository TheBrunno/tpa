import java.util.Scanner;
public class ClassificarSigno {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o dia que voce nasceu: ");
		int dia = in.nextInt();
		System.out.print("Digite o numero do mes que voce nasceu: ");
		int mes = in.nextInt();
		switch(mes) {
			case 1:
				if(dia >= 1 && dia <= 19) {
					System.out.println("Capricornio");
				}else if(dia > 19 && dia <= 31) {
					System.out.println("Aquario");
				}
				break;
			case 2:
				if(dia >= 1 && dia <= 18) {
					System.out.println("Aquario");
				}else if(dia > 18 && dia <= 28) {
					System.out.println("Peixes");
				}
				break;
			case 3:
				if(dia >= 1 && dia <= 20) {
					System.out.println("Peixes");
				}else if(dia > 20 && dia <= 31) {
					System.out.println("Aries");
				}
				break;
			case 4:
				if(dia >= 1 && dia <= 20) {
					System.out.println("Aries");
				}else if(dia > 20 && dia <= 30) {
					System.out.println("Touro");
				}
				break;
			case 5:
				if(dia >= 1 && dia <= 20) {
					System.out.println("Touro");
				}else if(dia > 20 && dia <= 31) {
					System.out.println("Gemeos");
				}
				break;
			case 6:
				if(dia >= 1 && dia <= 20) {
					System.out.println("Gemeos");
				} else if(dia > 20 && dia <= 30) {
					System.out.println("Cancer");
				}
				break;
			case 7:
				if(dia >= 1 && dia <= 22) {
					System.out.println("Cancer");
				}else if(dia > 22 && dia <= 31) {
					System.out.println("Leao");
				}
				break;
			case 8:
				if(dia >= 1 && dia <= 22) {
					System.out.println("Leao");
				}else if(dia > 22 && dia <= 31) {
					System.out.println("Virgem");
				}
				break;
			case 9:
				if(dia >= 1 && dia <= 22) {
					System.out.println("Virgem");
				}else if(dia > 22 && dia <= 30) {
					System.out.println("Libra");
				}
				break;
			case 10:
				if(dia >= 1 && dia <= 22) {
					System.out.println("Libra");
				}else if(dia > 22 && dia <= 31) {
					System.out.println("Escorpiao");
				}
				break;
			case 11:
				if(dia >= 1 && dia <= 21) {
					System.out.println("Escorpiao");
				}else if(dia > 21 && dia <= 30) {
					System.out.println("Sagitário");
				}
				break;
			case 12:
				if(dia >= 1 && dia <= 21) {
					System.out.println("Sagitário");
				}else if(dia > 21 && dia <= 31) {
					System.out.println("Capricornio");
				}
				break;
			default:
				System.out.println("Digite um mes valido");
		}
	}
}
