package restaurante;

public class Main {
	public static void main(String[] args){
		Conta conta1 = new Conta(1, "31/07/2016");
		conta1.setQuant_comida(1.56f);
		conta1.setQuant_bebida(3);
		conta1.setQuant_sobremesa(2);
		conta1.setForma_pagamento("cartao de debito");
		conta1.imprimir();
	}
}
