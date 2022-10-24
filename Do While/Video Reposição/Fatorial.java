import java.util.Scanner;


public class Fatorial{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número inteiro para ver seu fatorial: ");
        int n = in.nextInt();
        int i = n-1;
        do{
            n = n*i;
            i--;
        }while(i>=1);
        System.out.println(n);
        in.close();
    }
}