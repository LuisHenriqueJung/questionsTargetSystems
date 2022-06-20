import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> recebeFibo = new ArrayList<>(30);
        int fibo = 1, soma = 0, aux, entrada;

        System.out.print("Digite um número de 1 até 30: ");
        entrada = sc.nextInt();
        System.out.println("Sequência Fibonacci:");
        for (int i = 0; i< 30 ;i++ ){
            aux = fibo;
            fibo = fibo + soma;
            soma = aux;
            recebeFibo.add(fibo);
            System.out.print(recebeFibo.get(i)+ " ");
            }
        System.out.println();
        if(recebeFibo.contains(entrada)){
            System.out.println(entrada + " pertence a sequência Fibonacci.");
        } else {
            System.out.println(entrada + " não pertence a sequência Fibonacci.");
        }

    }
}