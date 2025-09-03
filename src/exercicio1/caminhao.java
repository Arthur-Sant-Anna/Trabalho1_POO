package exercicio1;

public class caminhao extends Veiculo{

	private double capacidadeCarga;
	private double precoDiaria;
	
	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}


	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public caminhao(String Modelo, double capacidadeCarga, double precoDiaria) {
        super(Modelo);
        this.capacidadeCarga = capacidadeCarga;
        this.precoDiaria = precoDiaria;
    }
	
	public double calcularAluguel(int dias) {
		double valor = (precoDiaria * dias) + 200.0;
		return valor;
	}
	
	
}