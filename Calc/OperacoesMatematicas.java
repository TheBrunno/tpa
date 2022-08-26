import java.util.Scanner;

public class OperacoesMatematicas {
	public static void main(String[] args) {
		double v1, v2, soma, subt, mult, divis;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite o valor 1: ");
		v1 = in.nextDouble();
		System.out.print("Digite o valor 2: ");
		v2 = in.nextDouble();
		soma = v1+v2;
		subt = v1-v2;
		mult = v1*v2;
		divis = v1/v2;
		System.out.println("Soma: "+soma+". Subtração: "+subt+". Multiplicação: "+mult+". Divisão: "+divis);
		in.close();
	}
}
