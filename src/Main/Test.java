package Main;

import Carro.veiculo;

public class Test {

	public static void main(String[] args) {

		veiculo v1 = new veiculo("Chevrolet", "Cobalt", "FLZ1234", "azul", 0f, true, 100, 0, 50000);
		veiculo v2 = new veiculo();

		v1.acelerar();
		v1.abastecer(200);
		v1.acelerar();
		v1.frear();
		v1.pintar(null);
		v1.ligar();
		v1.desligar();

	}
}