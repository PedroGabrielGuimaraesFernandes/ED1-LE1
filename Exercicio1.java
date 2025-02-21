// Pedro Gabriel Guimarães Fernandes RA:10437465

import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite um segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Antes da troca valor 1 é igual a " + num1 + " e o valor 2 é " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Depois da troca valor 1 é igual a " + num1 + " e o valor 2 é " + num2);
        
        scanner.close();
    }  
}