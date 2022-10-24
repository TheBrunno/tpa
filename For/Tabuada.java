/*
 * 2-Criar  um  programa  que  calcule  e  apresente  a  tabuada  de  um  número inteiro  digitado  pelo usuário.
 */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número inteiro para ver sua tabuada: ");
        int t = in.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(t+" x "+i+" = "+t*i);
        }
        in.close();
    }
}