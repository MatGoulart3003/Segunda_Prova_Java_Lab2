package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {
	
	public static Scanner scan = new Scanner(System.in);
	public static int rangeArray = 100;
	public static void main(String[] args) {
		
		System.out.println("Bem vindo ao sistema de controle de Contas!!\n");
		do {
		imprimeMenu();
		int option = scan.nextInt();
		
		
		if (option == 3) {
			
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
}
