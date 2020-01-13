package Carro;

public class veiculo {

	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, double preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
		this.preco = preco;
	}

	public veiculo() {
		// TODO Auto-generated constructor stub
	}

	public void acelerar() {
		if (isLigado == true) {
			this.velocidade = 70;
			this.litrosCombustivel -= 1;
			System.out.println("A velocidade do carro é:" + this.velocidade);
		} else {
			System.out.println("O carro não está ligado.");
		}
	}

	public int li;

	public void abastecer(int qtdLitros) {
		if (this.litrosCombustivel + qtdLitros == 100) {

			System.out.println("O tanque está cheio.");
		} else if (this.litrosCombustivel + qtdLitros >= 100) {
			this.litrosCombustivel = 100;
			li = qtdLitros - litrosCombustivel;
			System.out.println("O tanque está cheio, porém, sobrou: " + li +" litros de gasolina");
		} else {
			this.litrosCombustivel += qtdLitros;
			System.out.println("O tanque não está cheio.");
		}
	}

	public void frear() {
		if (isLigado == true) {
			this.velocidade -= 20;
			System.out.println("A velocidade do carro após freiar é: " + velocidade);
		} else {
			System.out.println("O carro não está ligado.");
		}
	}

	public void pintar(String cor) {
		this.cor = cor;
		System.out.println("A cor do carro:" + cor);

	}

	public void ligar() {
		if (isLigado == true) {
			System.out.println("O carro está ligado.");
		} else {
			System.out.println("O carro não está ligado.");
		}

	}

	public void desligar() {
		if (isLigado == true) {
			System.out.println("O carro desligou.");
		} else {
			System.out.println("O carro ainda está ligado.");
		}

	}

}
