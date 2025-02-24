/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicio;


import java.util.Scanner;

/**
 *
 * @author joao
 */
public class Exercicio2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        int soma = 0;
        
        for (int i = 1; i <= numero; i++){
            if ( i % 2 != 0){
            soma +=i;
        }
        }
        
        System.out.println("A soma de todos os números ímapres entre 1 e " +numero+ " é: " +soma);
        
        scanner.close();
    }
    
}
