package alugel_imovel;
import javax.swing.JOptionPane;

public class Contrato {
	private int numero;
	private int meses_quant;
	private int prest_pagas;
	private int prest_atraso;
	private int meses_despejo;
	private float valor;
	private float juros;
	
	Contrato(int numero,
			 int prest_pagas,
			 int prest_atraso,
			 int meses_quant,
			 int meses_despejo,
			 float juros,
			 float valor)
	{
		set_numero(numero);
		set_prest_pagas(prest_pagas);
		set_prest_atraso(prest_atraso);
		set_meses_quant(meses_quant);
		set_meses_despejo(meses_despejo);
		set_valor(valor);
		set_juros(juros);
	}
	
	Contrato(int numero,
			 int juros,
			 int meses_quant,
			 int meses_despejo,
			 float valor)
	{
		set_numero(numero);
		set_meses_quant(meses_quant);
		set_meses_despejo(meses_despejo);
		set_valor(valor);
		set_juros(juros);
	}
	
	/*   Getters e Setters   */
	public int get_numero() {return numero;}
	public void set_numero(int numero) {this.numero = numero;}
	public int get_meses_quant() {return meses_quant;}
	public void set_meses_quant(int meses_quant) {this.meses_quant = meses_quant;}
	public int get_prest_pagas() {return prest_pagas;}
	public void set_prest_pagas(int prest_pagas) {this.prest_pagas = prest_pagas;}
	public int get_prest_atraso() {return prest_atraso;}
	public void set_prest_atraso(int prest_atraso) {this.prest_atraso = prest_atraso;}
	public int get_meses_despejo() {return meses_despejo;}
	public void set_meses_despejo(int meses_despejo) {this.meses_despejo = meses_despejo;}
	public float get_valor() {return valor;}
	public void set_valor(float valor) {this.valor = valor;}
	public float get_juros() {return juros;}
	public void set_juros(float juros) {this.juros = (juros/100) * get_valor();}
	
	/*   Demais Métodos   */
	public void prest_sem_juros(){
		JOptionPane.showMessageDialog(null, get_valor());
	}
	
	public void prest_juros_mes(){
		JOptionPane.showMessageDialog(null, get_valor() + get_juros());
	}
	
	public void calc_prest_total(){
		JOptionPane.showMessageDialog(null, (get_valor()*get_prest_atraso())+get_juros());
	}
	
	public void pagar(){
		this.prest_pagas++;
		JOptionPane.showMessageDialog(null, "Pago com sucesso");
	}
	
	public void despejar(){
		if(meses_despejo < prest_atraso && meses_quant > 6){
			JOptionPane.showMessageDialog(null, "Despejado");
		}else{
			JOptionPane.showMessageDialog(null, "Não pode realizar o despejo");
		}
	}
}
