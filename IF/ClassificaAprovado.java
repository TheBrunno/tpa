import java.util.Scanner;

public class ClassificaAprovado {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		double n1 = in.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double n2 = in.nextDouble();
		double m = (n1+n2)/2;
		if(m<3) {
			System.out.println("Reprovado");
		}else if(m>=6) {
			System.out.println("Aprovado");
		}else {
			System.out.println("O Aluno precisara passar por um exame");
			System.out.print("Digite a nota do exame: ");
			double nEx = in.nextDouble();
			double mEx = (m+nEx)/2;
			if(mEx>=6) {
				System.out.println("Aprovado");
			}else {
				System.out.println("Reprovado");
			}
		}
		in.close();
	}
}
