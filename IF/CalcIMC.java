import java.util.Scanner;
public class CalcIMC {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite a altura: ");
		double altura = in.nextDouble();
		System.out.print("Digite o peso: ");
		double peso = in.nextDouble();
		double imc = peso/(altura*altura);
		System.out.println("Seu IMC e: "+imc);
		if(imc <18.5) {
			System.out.println("Excesso de magreza");
		}else if(imc < 25) {
			System.out.println("Peso normal");
		}else if(imc < 30) {
			System.out.println("Excesso de peso");
		}else if(imc < 35) {
			System.out.println("Obesidade (grau I)");
		}else if(imc < 40) {
			System.out.println("Obesidade (grau II)");
		}else {
			System.out.println("Obesidade (grau III)");
		}
		in.close();
	}
}
