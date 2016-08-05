package alugel_imovel;

public class Main {
	public static void main(String[] args) {
		Contrato contrato1 = new Contrato(5, 10, 3, 7, 2, 2.5f, 130.50f);
		contrato1.prest_sem_juros();
		contrato1.prest_juros_mes();
		contrato1.calc_prest_total();
		contrato1.pagar();
		contrato1.despejar();
	}
}
