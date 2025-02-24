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
public class Exercicio6 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;   
        
        
        while (true) {
         
        
        
         System.out.println("Digite um número positivo para somar ou negativo para encerrar: ");
            int numero = scanner.nextInt();
            
  
            if (numero >= 0){
                soma += numero;
                System.out.println("Soma dos numeros digitados: " +soma);  
                
            } else{
                System.out.println("Programa encerrado");
                break;
            } 
        
      
        }
        
        System.out.println("A soma total dos numeros são: "+soma);
        scanner.close(); 
    }
}
       
    

