import java.util.Scanner;
public class PorcentagemMencaoNew {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String mencao = null;
		int mb = 0, b = 0, r = 0, i = 0;
		System.out.print("Digite a quantidade de alunos: ");
		int qtdeAlunos = in.nextInt();
		for(int inx=1;inx<=qtdeAlunos;inx++) {
			System.out.print("Digite a mencao do aluno "+inx+": ");
			mencao = in.next();
			switch(mencao) {
				case "MB": case "mb": case "Mb": case "mB":
					mb+=1;
					break;
				case "B": case "b":
					b+=1;
					break;
				case "R": case "r":
					r+=1;
					break;
				case "I": case "i":
					i+=1;
					break;
				default:
					System.out.println("Invalido");
			}
		}
		double porcMb = mb*100/qtdeAlunos;
		double porcB = b*100/qtdeAlunos;
		double porcR = r*100/qtdeAlunos;
		double porcI = i*100/qtdeAlunos;
		System.out.println("A porcentagem de cada nota e:\n"
				+ "\n MB = "+porcMb+"%"
				+ "\n B = "+porcB+"%"
				+ "\n R = "+porcR+"%"
				+ "\n I = "+porcI+"%");
	}
}
