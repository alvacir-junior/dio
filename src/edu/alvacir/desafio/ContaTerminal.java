package edu.alvacir.desafio;

import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        boolean continuar = true;
        char resposta;
        Scanner sc = new Scanner(System.in);
            while (continuar) {
                   
                    criarConta(sc);
                    System.out.println("Deseja realizar um novo cadastro ? Y para sim OU N para não: ");
                    resposta = sc.next().toUpperCase().charAt(0);
                    if(resposta == 'Y'){
                        continuar = true;
                        sc.nextLine();
                    }else if(resposta == 'N'){
                        continuar = false;
                        sc.close();
                    }else {
                        System.out.println("Desculpe não foi possivel compreender sua resposta. Finalizando atendimento...");
                        continuar = false;
                    }
                   
            }
            
    }

    public static void criarConta(Scanner sc){
            int numero;
            String agencia;
            String nome;
            double saldo;

            System.out.println("Digite o seu nome: ");
                nome = sc.nextLine();
            System.out.println("Digite o numero da conta: ");
                numero = sc.nextInt();
            System.out.println("Por favor digite o numero da Agencia: ");
                agencia = sc.next();
            System.out.println("Digite o Saldo: ");
                saldo = sc.nextDouble();

            System.out.println("Olá ".concat(nome)
                                            .concat(", Obrigado por criar uma conta em nosso banco, sua agencia é ")
                                                .concat(agencia)
                                                    .concat(", conta ")
                                                        .concat(Integer.toString(numero))
                                                            .concat(" e seu saldo ")
                                                                    .concat(Double.toString(saldo))
                                                                        .concat(" já está disponivel para saque. \n"));
                                                                       
            
        }
}
