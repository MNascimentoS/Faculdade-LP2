package compra_de_livros;

public class ContaBancaria {
	int agencia;
	int numero;
	boolean especial;
	float saldo;
	float limite;
	
	ContaBancaria(int agencia, int numero, boolean especial){
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;
		this.limite = 200;
		this.especial = especial;
	}
	
	/*Sets e Gets*/
	void set_especial(boolean especial){this.especial = especial;}
	boolean get_especial(){return especial;}
	void set_limite(float limite){this.limite = limite;}
	float get_limite(){return limite;}
	float get_saldo(){return saldo;}
	
	void depositar(float saldo){this.saldo += saldo;}
	
	void sacar(float valor){
		if(saldo >= valor){
			saldo -= valor;
		}else if(especial && (valor - saldo) <= limite){
			valor -= saldo;
			saldo = 0;
			limite -= valor;
		}else{
			System.out.println("Não foi possivel realizar o saque");
		}
	}
	
	
}
