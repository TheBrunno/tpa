import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número para ver a sequência de Fibonacci até ele: ");
        int n = in.nextInt();
        int ant = 0;
        int i = 0;
        int ac = 1;
        int prox = 0;

        do{
            prox = ant+ac;
            ant = ac;
            ac = prox;
            System.out.print(ant);
            if(n-1 != i){
                System.out.print(" -> ");
            }
            i++;
        }while(i<n);
        in.close();
    }
}
