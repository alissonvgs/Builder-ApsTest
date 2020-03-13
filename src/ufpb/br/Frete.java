package ufpb.br;

public class Frete {
	private double valor;

	public Frete(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "\nFrete: R$:" + this.valor;
	}

}
