// Pedro Gabriel Guimarães Fernandes RA:10437465

import java.util.Scanner;

public class Exercicio8{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o x1: ");
        float x1 = scanner.nextFloat();
        System.out.println("Digite o y1: ");
        float y1 = scanner.nextFloat();
        System.out.println("Digite o r1: ");
        float r1 = scanner.nextFloat();
        System.out.println("Digite o x2: ");
        float x2 = scanner.nextFloat();
        System.out.println("Digite o y2: ");
        float y2 = scanner.nextFloat();
        System.out.println("Digite o r2: ");
        float r2 = scanner.nextFloat();
        
        if(haColisaoEntreCirculos(x1, y1, r1, x2, y2, r2)){
            System.out.println("Os Circulos colidiram");
        }else{
            System.out.println("Não houve colisão");
        }


    }

    public static boolean haColisaoEntreCirculos(float x1, float y1, float r1, float x2, float y2, float r2){
        float a = x2-x1;
        float b = y2-y1;
        
        double distEntreCir= Math.sqrt( 
            Math.pow(a, 2) + Math.pow(b, 2)
        );
        if(distEntreCir < (r1 + r2)){
            return true;
        }

        return false;
    }

}