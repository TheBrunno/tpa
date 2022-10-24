/*
 * 2-Criar  um  programa  que  calcule  e  apresente  a  tabuada  de  um  número inteiro  digitado  pelo usuário.
 */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número inteiro para ver sua tabuada: ");
        int t = in.nextInt();
        int i = 1;
        do{
            System.out.println(t+" x "+i+" = "+t*i);
            i++;
        }while(i<=10);
        in.close();
    }
}
