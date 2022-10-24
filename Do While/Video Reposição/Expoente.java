import java.util.Scanner;

public class Expoente{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a base: ");
        int b = in.nextInt();
        System.out.print("Digite o expoente: ");
        int e = in.nextInt();
        int i = 0;
        int total = 1;
        do{
            total = total*b;
            i++;
        }while(i<e);
        System.out.println(total);
        in.close();
    }
}