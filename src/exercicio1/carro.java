package exercicio1;

public class carro extends Veiculo{
	private int quantidadePortas;
	private double precoDiaria;

	private int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	public carro(String Modelo, int quantidadePortas, double precoDiaria) {
		super(Modelo);
		this.quantidadePortas = quantidadePortas;
		this.precoDiaria = precoDiaria;
	}
	public double calcularAluguel(int dias) {
		double valor = precoDiaria * dias;
		double taxaLimpeza = 50.0;
		return valor + taxaLimpeza;
	}
	
}