import java.util.Scanner;

public class IdadeVelhoENovo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int anoAt, anoNa, idade, vel = 0, nov = 0;
		System.out.print("Digite o ano atual: ");
		anoAt = in.nextInt();
		for(int i = 1;i<=10;i++) {
			System.out.print("Digite o ano de nascimento do usuário "+i+":");
			anoNa = in.nextInt();
			idade = anoAt-anoNa;
			System.out.println(idade);
			if(idade < nov || i == 1) {
				nov = idade;
			}
			if(idade > vel) {
				vel = idade;
			}
		}
		System.out.println("O usuário mais velho tem "+vel+" anos, e o mais novo tem "+nov+" anos");
	}
}
