package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.Conta;

public class Questao1 {
	
	public static Scanner scan = new Scanner(System.in);
	public static int rangeArray = 100;
	public static void main(String[] args) {
		
		Conta conta [] = new Conta[rangeArray];
		Conta contaVar = new Conta ();
		System.out.println("Bem vindo ao sistema de controle de Contas!!\n");
		
		do {
		imprimeMenu();
		int option = scan.nextInt();
		scan.nextLine();
		if (option == 1) {
			
			cadastro (conta, contaVar);
			System.out.println(conta[0].descricao);
			System.out.println(conta[0].valor);
			System.out.println(conta[0].dataVenc);
			System.out.println(conta[0].tipo);
		
		}
		
		else if (option == 3) {
			
			break;
			
		}
		
		}while(true);
		scan.close();
	}
	
	public static void imprimeMenu () {
		
		
		System.out.println("Digite uma das opções à seguir para continuar:\n\n");
		System.out.println("1 - Cadastro de Conta: ");
		System.out.println("2 - Ver Saldo: ");
		System.out.println("3 - Sair:\n\n");
		
	}
	public static void cadastro (Conta [] conta, Conta contaVar) {
		
		for (int i = 0; i < rangeArray; i++) {
			
			if (conta[i] == null) {
				
				System.out.println("Digite a DESCRIÇÃO da conta à ser cadastrada:");
				contaVar.descricao = scan.nextLine();
				System.out.println("Digite o VALOR desta conta:");
				contaVar.valor = scan.nextFloat();
				scan.nextLine();
				System.out.println("Digite a DATA DE VENCIMENTO desta conta:");
				contaVar.dataVenc = scan.nextLine();
				System.out.println("Digite se a conta é uma DESPESA ou uma RECEITA:\n ");
				
				
				
				do {
					System.out.println("Para DESPESA digite 1, para RECEITA digite 2");
					int indice = scan.nextInt();
					if (indice == 1) {
						contaVar.tipo = "Despesa";
						break;
					}else if (indice == 2) {
						contaVar.tipo = "Receita";
						break;
					}else {
						System.out.println("Valor inválido!! Digite um valor valido:");
					}
					
				}while (true);
				
				
			}
			
			conta[i] = contaVar;
			break;
		}
		
	}
	
}
