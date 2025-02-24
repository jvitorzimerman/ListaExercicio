/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaexercicio;

import java.util.Scanner;

/**
 *
 * @author joao
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro positivo: ");
        
        int numero = scanner.nextInt();
        
        if (numero < 0){
            System.out.println("Número inválido, Digite um número positivo.");
        } else{
       int fatorial = 1;

            
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
        
        scanner.close();
        
    } 
}
