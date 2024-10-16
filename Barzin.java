
package barzin;

import java.util.Scanner;

public class Barzin {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int qtdcerveja, qtdrefri, qtdespeto, ingresso = 0, consumo, couvert;
        int sex, total;
        String couverSt; 
        
        System.out.println("-------------------BAR DO NEPOBABY----------------");
        
        System.out.println("\nSexo F-[1] ou M-[2]:");
        sex = ler.nextInt();
        System.out.println("\nQuantidade de cervejas:");
        qtdcerveja = ler.nextInt();
        System.out.println("\nQuantidade de refrigerantes:");
        qtdrefri = ler.nextInt();
        System.out.println("\nQuantidade de espetihos:");
        qtdespeto = ler.nextInt();
        
        if(sex == 2){
            ingresso = 10;
        } else if(sex == 1){
            ingresso = 8;
        } else{
            System.out.println("SEXO INVÁLIDO!");
        }
        //consumo e preços
        qtdcerveja *= 5;
        qtdrefri *= 3;
        qtdespeto *= 7;
        consumo = qtdcerveja + qtdrefri + qtdespeto;
        
        if(consumo < 30){
            couvert = 4;
            couverSt = "Couvert: R$4"; 
        } else{
            couvert = 0;
            couverSt = "Isento de Couvert"; 
        } 
        
        total = qtdcerveja + qtdrefri + qtdespeto + ingresso + couvert;
        
        
        System.out.println("\n##RELATÓRIO##\n");
        System.out.printf("Consumo: R$%d\n", consumo);
        System.out.println(couverSt);
        System.out.printf("Ingresso: R$%d\n", ingresso);
        System.out.printf("\nValor a pagar: R$%d\n", total);
    }     
            
}
