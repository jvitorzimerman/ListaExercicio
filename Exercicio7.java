/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicio;

/**
 *
 * @author joao
 */

import java.util.Scanner;
public class Exercicio7 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int fx_um = 0;
        int fx_dois = 0;
        int fx_tres = 0;
        int fx_quatro = 0;
        int maiorIdade = 0;
        
        while (true) { 
            System.out.println("Digite a idade (ou -1 para encerrar): ");
            int idade = scanner.nextInt();
            
            if (idade>= 0 && idade <=15){
                fx_um++;
         } else if(idade >=16 && idade <= 40){
             fx_dois++;           
         }else if(idade >=41 && idade <= 60){
             fx_tres++;           
         }else if(idade <61){
             fx_quatro++;
         }  
        
            if (idade > maiorIdade){
            maiorIdade = idade;
            }
            else if (idade <0) {
             System.out.println ("Programa encerrado! ");
            break;
            }
      }
        System.out.println("Pessoas na faixa de 0 a 15 anos: " +fx_um);
        System.out.println("Pessoas na faixa de 16 a 40 anos: " +fx_dois);
        System.out.println("Pessoas na faixa de 41 a 60 anos: " +fx_tres);
        System.out.println("Pessoas com mais de 60 anos: " +fx_quatro);
        System.out.println("A maior idade registrada foi: " +maiorIdade);

        scanner.close();
    }
}
   

