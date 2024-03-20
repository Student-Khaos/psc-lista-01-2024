package com.mycompany.mediarit;

    import java.util.Scanner;

public class Mediarit {
    public static void main(String[] args) {
    
        Scanner ler = new Scanner(System.in);

        System.out.println("Por favor, insira trÃªs nÃºmeros:");

        // LÃª 
        double n1 = ler.nextDouble();
        double n2 = ler.nextDouble();
        double n3 = ler.nextDouble();

        // MÃ©dia
        double maior = Math.max(n1, Math.max(n2, n3));
        double menor = Math.min(n1, Math.min(n2, n3));
        double media = (n1 + n2 + n3) / 3;

        // Imprime
        System.out.println("A mÃ©dia dos nÃºmeros Ã©: " + media);
        System.out.println("O maior nÃºmero Ã©: " + maior);
        System.out.println("O menor nÃºmero Ã©: " + menor);
                
        
    
        
    }
}
