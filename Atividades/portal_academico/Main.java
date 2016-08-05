package portal_academico;
import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.cadastrar_matricula();
		JOptionPane.showMessageDialog(null, "Matricula: " + aluno1.get_matricula());
		aluno1.cadastrar_quant_materias();
		JOptionPane.showMessageDialog(null, "Quantidade Materias: " + aluno1.get_quant_materias());

	}
}
