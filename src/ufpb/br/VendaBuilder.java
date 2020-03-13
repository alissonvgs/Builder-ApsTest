package ufpb.br;

public class VendaBuilder {
	
Venda venda;
	
	public VendaBuilder() {
		venda = new Venda();
	}
	
	public VendaBuilder Data(String data) {
		venda.setData(data);
		return this;
	}
	
	public VendaBuilder ClientePF(String nome, String cpf) {
		venda.setCliente(new ClientePF(nome, cpf));
		return this;
	}
	
	public VendaBuilder ClientePJ(String razaoSocial, String cnpj) {
		venda.setCliente(new ClientePJ(razaoSocial,cnpj));
		return this;
	}
	
	public VendaBuilder Frete(double valor) {
		venda.setFrete(new Frete(valor));
		return this;
	}
	
	public VendaBuilder Funcionario(String nome) {
		venda.setFuncionario(new Funcionario(nome));
		return this;
	}
	
	public VendaBuilder Item(int quantidade, Produto produto) {
		venda.addItem(new ItemVenda(quantidade, produto));
		return this;
	}
	
	public Venda Build() {
		return venda;
	}
}
