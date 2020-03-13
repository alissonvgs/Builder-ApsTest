package ufpb.br;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	
	private List<ItemVenda> itens;
	private String data;
	private Cliente cliente;
	private Frete frete;
	private Funcionario funcionario;
	
	public Venda() {
		this.itens = new ArrayList<ItemVenda>();
	}
	
	public void addItem(ItemVenda item) {
		this.itens.add(item);
	}
	
	public List<ItemVenda> getItens(){
		return this.itens;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Frete getFrete() {
		return frete;
	}
	
	public void setFrete(Frete frete) {
		this.frete = frete;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public String toString() {
		return "Data: "+this.data
				+this.cliente
				+this.itens
				+this.frete
				+this.funcionario;
	}

	

}
