// Pedro Gabriel Guimarães Fernandes RA:10437465

import java.util.Scanner;

public class Exercicio7{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();
        

        System.out.println("A frase escrita contem " + contarVogais(frase) + " vogais");
    }

    public static int contarVogais(String palavras){
        int resultado = 0;
        char[] caracteres = palavras.toLowerCase().toCharArray();

        for(int i = 0; i<palavras.length();i++){
            if("a".charAt(0) == caracteres[i] || "e".charAt(0) == caracteres[i] || "i".charAt(0) == caracteres[i] 
            || "o".charAt(0) == caracteres[i] || "u".charAt(0) == caracteres[i] ){
                resultado += 1;
            }
        }
        return resultado;
    }

}