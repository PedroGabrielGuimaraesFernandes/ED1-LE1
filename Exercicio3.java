// Pedro Gabriel Guimarães Fernandes RA:10437465

import java.util.Scanner;

public class Exercicio3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float[] numbers = new float[10];  
        for(int i = 0; i< 10; i++){
            System.out.println("Digite o número " + i + " do array");
            numbers[i] = scanner.nextFloat();
        }

        float maior = numbers[0];
        float menor = numbers[0];


        for(int i = 0; i< 10; i++){
            if(numbers[i] > maior){
                maior = numbers[i];
                continue;
            } else if(numbers[i] < menor){
                menor = numbers[i];
                continue;
            }
        }

        System.out.print("O maior é " + maior + " e o menor é " + menor);
    }
}