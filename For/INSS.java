
/*
 * 1-Criar um programa que leia o salário de funcionário e calcule e apresente o desconto do INSS que será de:
 *      •Caso o salário esteja abaixo de R$ 2000,00 o desconto será de 8,5%;
 *      •Caso o salário seja igual ou acima de R$ 2000,00 o desconto será de 11%.
 * Repita o procedimento para os 4 funcionários da empresa.
 */

import java.util.Scanner;

public class INSS {
    public static void main(String[] args) {
        double salario = 0;
        double desc = 0;
        Scanner in = new Scanner(System.in);
        for(int i=4;i>=1;i--){
            System.out.print("Digite o salário: ");
            salario = in.nextInt();
            if(salario < 2000){
                desc = 0.085;
            }else{
                desc = 0.11;
            }
            salario = salario - (salario*desc);
            System.out.printf("O salario final será de: %.2f %n", salario);
        }
        in.close();
    }
}