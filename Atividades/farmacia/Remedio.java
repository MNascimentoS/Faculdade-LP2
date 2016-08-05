package farmacia;
import javax.swing.JOptionPane;
public class Remedio {
	protected int codigo;
	protected String nome;
	protected String nome_fabricante;
	protected String principio_ativo;
	protected String validade;
	protected float custo;
	
	Remedio(int codigo,
			String nome,
			String nome_fabricante,
			String principio_ativo,
			String validade,
			float custo)
	{
		this.codigo = codigo;
		this.nome = nome;
		this.nome_fabricante = nome_fabricante;
		this.principio_ativo = principio_ativo;
		this.validade = validade;
		this.custo = custo;
	}
	
	/*   Getters e Setters   */
	public int getCodigo() {return codigo;}
	public void setCodigo(int codigo) {this.codigo = codigo;}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public String getNome_fabricante() {return nome_fabricante;}
	public void setNome_fabricante(String nome_fabricante) {this.nome_fabricante = nome_fabricante;}
	public String getPrincipio_ativo() {return principio_ativo;}
	public void setPrincipio_ativo(String principio_ativo) {this.principio_ativo = principio_ativo;}
	public String getValidade() {return validade;}
	public void setValidade(String validade) {this.validade = validade;}
	public float getCusto() {return custo;}
	public void setCusto(float custo) {this.custo = custo;}
	
	/*   Demais Metodos   */
	public float preco_venda(){
		return (float) (this.custo * (30/100.0)) + this.custo;
	}
	public void imprimir(){
		JOptionPane.showMessageDialog(null, "Codigo: " + codigo + "\n" +
											"Nome: " + nome + "\n" +
											"Nome do Fabricante: " + nome_fabricante + "\n" +
											"Principio Ativo: " + principio_ativo + "\n" +
											"Validade: " + validade + "\n" +
											"Custo de Fabricação: " + custo + "\n" +
											"Preço do Medicamento: " + preco_venda());
	}
	
}
