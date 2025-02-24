// Pedro Gabriel Guimarães Fernandes RA:10437465

import java.util.Scanner;

public class Exercicio5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = scanner.nextInt();
        
        System.out.println("O maior é " + max(num1, num2) + " e o menor é " + min(num1, num2));
    }

    public static int min(int num1, int num2){
        int menor;
        if(num1 < num2){
            menor = num1;
        } else {
            menor = num2;
        }
        return menor;
    }

    public static int max(int num1, int num2){
        int maior;
        if(num1 > num2){
            maior = num1;
        } else {
            maior = num2;
        }
        return maior;
    }
}