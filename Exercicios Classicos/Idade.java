import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		double idade, qtd1=0, qtd2=0, qtd3=0, qtd4=0, qtd5=0, somaTotal;
		double porc1,porc2,porc3,porc4,porc5;
		Scanner in = new Scanner(System.in);
		for(int i=1;i<=15;i++) {
			System.out.println("Digite a idade do usuario "+i);
			idade=in.nextInt();
			if (idade<=15) {
				qtd1++;
			}else if(idade <= 30) {
				qtd2++;
			}else if(idade <= 45) {
				qtd3++;
			}else if(idade <= 60) {
				qtd4++;
			}else{
				qtd5++;
			}
		}
		System.out.println("Na faixa etaria 1, tem "+qtd1+" pessoas");
		System.out.println("Na faixa etaria 2, tem "+qtd2+" pessoas");
		System.out.println("Na faixa etaria 3, tem "+qtd3+" pessoas");
		System.out.println("Na faixa etaria 4, tem "+qtd4+" pessoas");
		System.out.println("Na faixa etaria 5, tem "+qtd5+" pessoas\n");
		
		somaTotal=qtd1+qtd2+qtd3+qtd4+qtd5;
		porc1= (qtd1*100)/(somaTotal);
		porc2= (qtd2*100)/(somaTotal);
		porc3= (qtd3*100)/(somaTotal);
		porc4= (qtd4*100)/(somaTotal);
		porc5= (qtd5*100)/(somaTotal);
		
		System.out.println(porc1+"% das pessoas estao na faixa etaria 1");
		System.out.println(porc2+"% das pessoas estao na faixa etaria 2");
		System.out.println(porc3+"% das pessoas estao na faixa etaria 3");
		System.out.println(porc4+"% das pessoas estao na faixa etaria 4");
		System.out.println(porc5+"% das pessoas estao na faixa etaria 5");
		in.close();
	}
}
