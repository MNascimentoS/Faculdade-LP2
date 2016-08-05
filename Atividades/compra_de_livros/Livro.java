package compra_de_livros;

public class Livro {
	String nome;
	String autor;
	int ano;
	int paginas;
	float valor;
	
	Livro(String nome, String autor, int ano, int paginas, float valor){
		this.nome = nome;
		this.autor = autor;
		this.ano = ano;
		this.paginas = paginas;
		this.valor = valor;
	}
	
	/*Sets e Gets*/
	void set_nome(String nome){this.nome = nome;}
	String get_nome(){return nome;}
	void set_autor(String autor){this.autor = autor;}
	String get_autor(){return autor;}
	void set_ano(int ano){this.ano = ano;}
	int get_ano(){return ano;}
	void set_paginas(int paginas){this.paginas = paginas;}
	int get_paginas(){return paginas;}
	
	void imprimir_dados(){
		System.out.println("Nome: " + get_nome() + "\n" + "Autor: " + get_autor() + "\n" + "Ano: " + get_ano() + "\n" + "Paginas: " + get_paginas());
	}
	
	void comprarLivro(ContaBancaria conta, int quantidade){
		if(conta.get_saldo()>(valor*quantidade)){
			conta.sacar(quantidade*valor);
			System.out.println("Operação Realizada com Sucesso.");
		}else{
			System.out.println("Operação Negada.");
		}
	}
}
