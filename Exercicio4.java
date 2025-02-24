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


public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int somaIdade = 0;
        int maiorIdade = 0;
        int menorIdade = 999999999;
        double mediaIdade = 0;
        String nomeNovo = "";
        
        for (int i = 1; i <=3 ; i++){
                System.out.println("Digite o nome da "+i+"ª pessoa: ");
                String nome = scanner.nextLine();
            
                System.out.println("Digite a idade de "+nome+": ");
                int idade = scanner.nextInt();
                scanner.nextLine();
                
                somaIdade += idade;
                
                
                if (idade >=18){
                    maiorIdade++;
                }
                if (idade < menorIdade) {
                menorIdade = idade;
                nomeNovo = nome;
            }
                
                mediaIdade = somaIdade/3;
        }
        System.out.println("\nResultados:");
        System.out.println("Soma das idades: " + somaIdade);
        System.out.println("Média das idades: " + mediaIdade);
        System.out.println("Número de pessoas maiores de idade: " + maiorIdade);
        System.out.println("A pessoa mais nova é: " + nomeNovo);

        scanner.close();
    }
}
