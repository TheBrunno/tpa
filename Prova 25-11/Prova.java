import java.util.*;
public class Prova {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int SIZE = 5;
		double precos[] = new double[SIZE];
		double soma=0;
		double media=0;
		double maisCaro=0;
		
		for(int i=0; i<SIZE; i++) {
			System.out.print("Digite o valor do "+(i+1)+"º produto: ");
			precos[i] = in.nextDouble();
			soma += precos[i];
		}
		
		media = soma/SIZE;
		
		for(int i=0; i<SIZE; i++) {
			if(precos[i] > maisCaro) {
				maisCaro = precos[i];
			}
		}
		
		System.out.println("A soma dos valores de todos os produtos é: "+soma);
		System.out.println("A media dos valores é: "+media);
		System.out.println("O valor do produto mais caro é: "+maisCaro);
		
		if(soma <= 150) {
			System.out.println("Com 150 reais, a dona de casa CONSEGUE comprar todos os produtos");
		}else {
			System.out.println("Com 150 reais, a dona de casa NAO CONSEGUE comprar todos os produtos");
		}
	}
}
