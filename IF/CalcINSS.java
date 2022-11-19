import java.util.Scanner;

public class CalcINSS {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double salario, inss;
		
		System.out.println("Digite o seu salario");
		salario = in.nextDouble();
		
		if (salario<=2500) {
			inss = salario*0.09;
		}else {
			inss = salario*0.11;
		}
		System.out.println("Seu salario bruto é R$"+salario+" , o INSS é R$"+inss+" , e o salario liquido é R$"+(salario-inss));
		in.close();
	}
}
