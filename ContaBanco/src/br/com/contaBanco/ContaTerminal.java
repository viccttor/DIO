package br.com.contaBanco;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Por favor, digite o n�mero da conta: ");
		int numeroConta = scan.nextInt();
		
		System.out.print("Por favor, digite o n�mero da ag�ncia: ");
		String agencia = scan.next();
		
		System.out.print("Por favor, digite o saldo da conta: ");
		double saldoConta = scan.nextDouble(); 
		System.out.print("Por favor, digite o nome do titular da conta: ");
		String nomeCliente = scan.next();
		
		System.out.println();
		System.out.println(String.format("Ol� %s, obrigado por criar uma conta em nosso banco, "
				+ "sua ag�ncia � %s , conta %d e seu saldo %.2f j� est� dispon�vel para saque.", nomeCliente, agencia, numeroConta, saldoConta));
		scan.close();
	}
	
}
