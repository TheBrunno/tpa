/*
 * 4-Criar um programa que leia o preço de um produto e a margem de lucro (em porcentagem). Calcule e apresente o preço de venda. Executar esse programa até que o usuário responda ‘N’ para a pergunta (‘Deseja continuar a execução? (S/N) ‘).
 */

import java.util.Scanner;

public class MargemLucro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double preco, margem;
        String resp = "s";
        
        do{
            System.out.print("Digite o valor do produto: ");
            preco = in.nextDouble();
            System.out.print("Digite a margem de lucro: ");
            margem = in.nextDouble();

            System.out.printf("O valor do produto será de: %.2f %n", (preco+((margem/100)*preco)));
            System.out.print("Deseja continuar? (S/N) ");
            resp = in.next();
        }while(resp.equalsIgnoreCase("s"));
        System.out.println("Fim do programa");
        in.close();
    }
}
