// Pedro Gabriel Guimarães Fernandes RA:10437465

import java.util.Scanner;

public class Exercicio2{
    public static void main(String[] args){
        System.out.print("Digite uma letra: ");
        Scanner scanner = new Scanner(System.in);
        String letra = scanner.nextLine();
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println("A letra escolhida foi uma Vogal"); 
        } else{
            System.out.println("A letra escolhida foi uma Consoante");
        }
        scanner.close();
    }
}