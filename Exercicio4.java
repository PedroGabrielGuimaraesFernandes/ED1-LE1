// Pedro Gabriel Guimarães Fernandes RA:10437465

import java.util.Scanner;

public class Exercicio4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];  
        for(int i = 0; i< 10; i++){
            System.out.println("Digite o número " + i + " do array");
            numbers[i] = scanner.nextInt();
        }
        for(int i = 9; i >= 0; i--){
            System.out.println( numbers[i]);
        }
    }
}