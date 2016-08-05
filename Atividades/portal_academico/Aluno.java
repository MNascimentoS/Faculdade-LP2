package portal_academico;
import javax.swing.JOptionPane;
public class Aluno{
	private String nome_aluno;
	private String matricula;
	private int quant_materias;
	private int quant_cursadas;
	
	Aluno(){}
	
	Aluno(String nome_aluno, String matricula){
		this.nome_aluno = nome_aluno;
		this.matricula = matricula;
	}
	
	/*   Sets e Gets   */
	public void set_nome(String nome_aluno){this.nome_aluno = nome_aluno;}
	public String get_nome(){return this.nome_aluno;}
	public void set_matricula(String matricula){this.matricula = matricula;}
	public String get_matricula(){return this.matricula;}
	public void set_quant_materias(int quant_materias){this.quant_materias = quant_materias;}
	public int get_quant_materias(){return this.quant_materias;}
	public void set_quant_cursadas(int quant_cursadas){this.quant_cursadas = quant_cursadas;}
	public int get_quant_cursadas(){return this.quant_cursadas;}
	
	void cadastrar_nome(){
		String nome;
		nome = JOptionPane.showInputDialog(
				"Digite o nome do Aluno", 
				"Nome do Aluno");
		set_nome(nome);
	}
	
	void cadastrar_matricula(){
		String matricula;
		matricula = JOptionPane.showInputDialog(
						"Digite o numero de matricula", 
						"Matricula");
		set_matricula(matricula);
	}
	
	void cadastrar_quant_materias(){
		String aux;
		int quant_materias;
		aux = JOptionPane.showInputDialog(
						"Digite a quantidade de matérias", 
						"Matérias");
		quant_materias = Integer.parseInt(aux);
		set_quant_materias(quant_materias);
	}
	
}
