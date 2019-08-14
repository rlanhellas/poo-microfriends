package br.com.microfriends.poo;

public class Main {

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente();
		conta1.setCliente("RONALDO");
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.setCliente("RONALDO - CONTA PP");
		cp.setDiaAniversario(10);
		
		System.out.println("Cliente da Conta CC = "+conta1.getCliente());
		System.out.println("Cliente da Conta PP = "+cp.getCliente());
		
	}

}
