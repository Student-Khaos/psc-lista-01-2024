
package maquina_de_vendas;

import java.util.Scanner;
public class Maquina_de_vendas {

   

    public static void main(String[] args) {
      // Preços, variáveis
        Scanner ler = new Scanner(System.in);
        
        int refrigerante = 3;
        int suco = 7;
        int vitamina = 9;
        int chips = 5;
        int salgados = 3;
        int doces = 2;
     
        System.out.println("Seja bem-vindo a Máquina de Vendas Automática");
        System.out.println("Escolha entre as seguintes opções: ");
        System.out.println("1 – Refrigerante R$3,00");
        System.out.println("2 – Suco R$7,00");
        System.out.println("3 – Vitamina R$8,00");
        System.out.println("4 - Chips R$ 5,00");
        System.out.println("5 - Salgados R$ 4,00");
        System.out.println("6 - Doces R$2,00");
        System.out.print("Digite a opção desejada: ");
        int opcao = ler.nextInt();
        
        if (opcao < 1 || opcao > 8){
            System.out.println("Opção inválida");
        }
        
        int valor = 0;
        String produto = "";
        
        switch (opcao){
            case 1:
                valor += refrigerante;
                produto = "Refrigerante";
                break;
                
            case 2:
                valor += suco;
                produto = "Suco";
                break;
                
            case 3:
                valor += vitamina;
                produto = "Vitamina";
                break;
                
            case 4:
                valor += chips;
                produto = "Chips";
                break;
                
            case 5: 
                valor += salgados;
                produto = "Salgados";
                break;
                
            case 6:
                valor += doces;
                produto = "Doces";
                break;
            
            default: 
                System.out.println("Compra cancelada.");
                return;
        }
        
       System.out.println("Insira o valor pago: ");
        int pago = ler.nextInt();
        
        switch (pago) {
            case 2:
            case 5:
            case 10:
            case 50:
                break;
                
            default:
                System.out.println("Nota inválida. Insira uma nota de 2, 5, 10 ou 50.");
                return;
        }
        
        if (pago < valor) {
            System.out.println("Valor pago insuficiente!");
        } 
                    


        else {
            
            int troco = pago - valor;
                        
            

            System.out.println("Recibo");
            System.out.println("Produto: " + produto);
            System.out.println("Valor do produto: R$" + valor);
            System.out.println("Valor pago: R$" + pago);
            System.out.println("Troco: R$" + troco);
        }
    }
}
               
               
               
    
