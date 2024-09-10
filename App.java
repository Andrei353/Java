/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.app;

import entidade.conta;
import java.util.Locale;
import java.util.Scanner;
    
 
public class App{

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        conta Conta;
        
        System.out.print("Informe o numero de conta: ");
        int numero = sc.nextInt();
        
        System.out.print("Informe o nome do titular da conta: ");
        sc.nextLine();
        
        String titular = sc.nextLine();
        
        System.out.print("Informe se tem deposito inicial (y/n)?: ");
        char resposta = sc.next().charAt(0);
        if(resposta == 'y'){
          System.out.print("Informe o valor do deposito: ");
          double depInicial = sc.nextDouble();
          Conta = new conta(numero , titular, depInicial);
        }else{
          Conta = new conta(numero, titular);
        }
        
        System.out.print(Conta);
        System.out.print("Informe o valor do deposito: ");
        double depositoValor = sc.nextDouble();
        Conta.deposito(depositoValor);
        System.out.print(Conta);
            
           System.out.print("Informe o valor do saque: ");
           double saqueValor = sc.nextDouble();
           Conta.saque(saqueValor);
           System.out.print(Conta);
        
        
    }
}
