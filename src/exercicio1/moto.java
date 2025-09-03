package exercicio1;

public class moto extends Veiculo{
	private int cilindrada;
	private double precoDiaria;

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public moto(String Modelo, int cilindrada, double precoDiaria) {
        super(Modelo);
        this.cilindrada = cilindrada;
        this.precoDiaria = precoDiaria;
	}
        
	public double calcularAluguel(int dias) {
		double valor = (precoDiaria * dias) * 0.95;
		return valor;
	}
	
}