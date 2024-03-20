package com.mycompany.mediarit;

    import java.util.Scanner;

public class Mediarit {
    public static void main(String[] args) {
    
        Scanner ler = new Scanner(System.in);

        System.out.println("Por favor, insira três números:");

        // Lê
        double n1 = ler.nextDouble();
        double n2 = ler.nextDouble();
        double n3 = ler.nextDouble();

        // Média
        double maior = Math.max(n1, Math.max(n2, n3));
        double menor = Math.min(n1, Math.min(n2, n3));
        double media = (n1 + n2 + n3) / 3;

        // Imprime
        System.out.println("A média dos números é: " + media);
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
                
        
    
        
    }
}
