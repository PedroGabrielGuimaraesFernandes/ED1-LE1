// Pedro Gabriel Guimarães Fernandes RA:10437465

import java.util.Scanner;

public class Exercicio6{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número a ser multiplicado: ");
        float num1 = scanner.nextFloat();
        System.out.println("Digite o multiplicador: ");
        int num2 = scanner.nextInt();
        
        System.out.println("o Número a ser multiplicado foi "+ num1 + " , e o multiplicador foi " + num2 + 
        " , O resultado da multiplicação foi " + mulComAdicao(num1, num2));
    }

    public static float mulComAdicao(float num, int multiplicador){
        float resultado = 0;
        for(int i = 0; i<multiplicador;i++){
            resultado += num;
        }
        return resultado;
    }

}