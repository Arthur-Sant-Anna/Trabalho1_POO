package exercicio1;

public class Main {
	public static void main(String[] args) {
		 int diasAluguel = 5;

	        carro carro = new carro("Toyota Corolla", 4, 150.0);
	        carro.setPlaca("ABC-1234");

	        moto moto = new moto("Honda CB500", 500, 80.0);
	        moto.setPlaca("XYZ-5678");

	        caminhao caminhao = new caminhao("Volvo FH", 18.0, 300.0);
	        caminhao.setPlaca("JKL-9012");

	        System.out.println("Modelo: " + carro.getModelo());
	        System.out.println("Placa: " + carro.getPlaca());
	        System.out.println("Valor do aluguel para " + diasAluguel + " dias: R$ " + String.format("%.2f", carro.calcularAluguel(diasAluguel)));

	        System.out.println("Modelo: " + moto.getModelo());
	        System.out.println("Placa: " + moto.getPlaca());
	        System.out.println("Valor do aluguel para " + diasAluguel + " dias: R$ " + String.format("%.2f", moto.calcularAluguel(diasAluguel)));

	        System.out.println("Modelo: " + caminhao.getModelo());
	        System.out.println("Placa: " + caminhao.getPlaca());
	        System.out.println("Valor do aluguel para " + diasAluguel + " dias: R$ " + String.format("%.2f", caminhao.calcularAluguel(diasAluguel)));

	    }
	}
