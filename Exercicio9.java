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

public class Exercicio9 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        double valorTotal = 0;
        
        System.out.println("Digite o preço do produto: ");
        double precoProd = scanner.nextDouble();
        
        System.out.println("Escolha a forma de pagamento");
        System.out.println("1 - À vista em dinheiro ou cheque, recebe 10% de desconto");
        System.out.println("2 - À vista no cartão de crédito,recebe 15% de desconto");
        System.out.println("3 - Em duas vezes, preço normal de etiqueta sem juros;");
        System.out.println("4 - Em três vezes, preço normal de etiqueta mais juros de 10%");
        int codigo = scanner.nextInt();
         
         switch(codigo){
             case 1 -> {
                
                 valorTotal = precoProd - (precoProd*0.10);
                 break;
            } case 2 -> {
                 
                 valorTotal = precoProd - (precoProd*0.15);
                 break;
            }
            case 3 -> {
                 
                 valorTotal = precoProd;
                 break;
            }case 4 -> {
                 
                 valorTotal = precoProd + (precoProd * 0.10);
                 break;
            }
            default->{
                
                System.out.println("Código de condição de pagamento inválido.");
                
            }
         }
         
         System.out.println("valor total do produto é: "+valorTotal);
         
        }
         
    }
    


