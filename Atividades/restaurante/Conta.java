package restaurante;
import javax.swing.JOptionPane;

public class Conta {
	int numero;
	String data;
	float quant_comida;
	int quant_bebida;
	int quant_sobremesa;
	String forma_pagamento;
	
	Conta(int numero, String data){
		this.numero = numero;
		this.data = data;
	}
	
	/*   Getters e Setters   */
	public int getNumero() {return numero;}
	public void setNumero(int numero) {this.numero = numero;}
	public String getData() {return data;}
	public void setData(String data) {this.data = data;}
	public float getQuant_comida() {return quant_comida;}
	public void setQuant_comida(float quant_comida) {this.quant_comida = quant_comida;}
	public int getQuant_bebida() {return quant_bebida;}
	public void setQuant_bebida(int quant_bebida) {this.quant_bebida = quant_bebida;}
	public int getQuant_sobremesa() {return quant_sobremesa;}
	public void setQuant_sobremesa(int quant_sobremesa) {this.quant_sobremesa = quant_sobremesa;}
	public String getForma_pagamento() {return forma_pagamento;}
	public void setForma_pagamento(String forma_pagamento) {
		forma_pagamento = forma_pagamento.toUpperCase();
		if (forma_pagamento.equals("DINHEIRO") ||
			forma_pagamento.equals("CARTAO DE CREDITO") ||
			forma_pagamento.equals("CARTAO DE DEBITO"))
		{
			this.forma_pagamento = forma_pagamento;	
		}else{
			JOptionPane.showMessageDialog(null, "Metodo de pagamento inválido");
		}
	}
	
	
	/*   Demais Metodos   */
	private float calc_kilos(){
		return quant_comida * 30;
	}
	private float calc_bebidas(){
		return (float) quant_bebida * 2;
	}
	private float calc_sobremesa(){
		return (float) (quant_sobremesa * 3.5);
	}
	private float calc_desconto(){
		float preco, desconto = 0;
		preco = valor_total();
		switch(getForma_pagamento()){
			case "CARTAO DE CREDITO": desconto = 0;
				break;
			case "CARTAO DE DEBITO": desconto = (float) (preco * 5/100.0);
				break;
			case "DINHEIRO": desconto = (float) (preco * 10/100.0);
				break;
			default: JOptionPane.showMessageDialog(null, "Escolha uma forma de pagamento antes");
				break;
		}
		return desconto;
	}
	private float valor_total(){
		float preco = 0;
		preco += calc_kilos();
		preco += calc_bebidas();
		preco += calc_sobremesa();
		return preco;
	}
	public void imprimir(){
		JOptionPane.showMessageDialog(null, "Preço da comida: " + calc_kilos() + "\n" +
											"Preço da bebidas: " + calc_bebidas() + "\n" +
											"Preço da sobremesa: " + calc_sobremesa() + "\n\n" +
											"Desconto: " + calc_desconto() + "\n" +
											"Valor total: " + (valor_total() - calc_desconto()));
		
	}
}
