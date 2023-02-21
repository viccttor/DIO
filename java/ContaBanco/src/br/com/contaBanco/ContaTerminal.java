package br.com.contaBanco;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Por favor, digite o número da conta: ");
		int numeroConta = scan.nextInt();
		
		System.out.print("Por favor, digite o número da agência: ");
		String agencia = scan.next();
		
		System.out.print("Por favor, digite o saldo da conta: ");
		double saldoConta = scan.nextDouble(); 
		System.out.print("Por favor, digite o nome do titular da conta: ");
		String nomeCliente = scan.next();
		
		System.out.println();
		System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, "
				+ "sua agência é %s , conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldoConta));
		scan.close();
	}
	
}
