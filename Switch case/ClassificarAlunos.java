import java.util.Scanner;
public class ClassificarAlunos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite a idade do aluno: ");
		int idade = in.nextInt();
		switch(idade) {
			case 6:
				System.out.println("Alunos com 6 anos sao \"Dente de Leite\"");
				break;
			case 7:
				System.out.println("Alunos com 7 anos sao \"Junior\"");
				break;
			case 8:
				System.out.println("Alunos com 8 anos sao \"Junior Max\"");
				break;
			case 9:
				System.out.println("Alunos com 9 anos sao \"Junior Master\"");
				break;
			case 10:
				System.out.println("Alunos com 10 anos sao \"Master\"");
				break;
			default:
				System.out.println("Alunos com "+idade+" anos nao podem participar das aulas");
		}
	}
}
