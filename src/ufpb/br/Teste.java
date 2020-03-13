package ufpb.br;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Teste extends TestCase {

	public String nomePF = "Taric";
	public String funcionario = "Luis";
	public Venda venda;
	public Produto produto;

	@Test
	public void testClientePF() {
		produto = new Produto("Banana", 2.00);
		venda = new VendaBuilder().Data("10/10/2020").ClientePF("Taric", "000.000.000-00").Frete(10.00).Item(1, produto)
				.Funcionario("Luis").Build();

		assertEquals("Data: 10/10/2020" + "\nCliente: " + nomePF + " | CPF: 000.000.000-00["
				+ "\nItem: Banana | Preço: R$: 2.0 | Quantidade: 1]" + "\nFrete: R$:10.0" + "\nFuncionario: "
				+ funcionario, venda.toString());
	}

	@Test
	public void testClientePJ() {
		Produto produto = new Produto("Pão", 5.00);
		venda = new VendaBuilder().Data("10/10/2020").ClientePJ("Monstros SA", "xx.xxx.xxx/xxxx-xx").Frete(70.00)
				.Item(50, produto).Funcionario("Luis").Build();

		assertEquals("Data: 10/10/2020" + "\nCliente: Monstros SA | CNPJ: xx.xxx.xxx/xxxx-xx["
				+ "\nItem: Pão | Preço: R$: 5.0 | Quantidade: 50]" + "\nFrete: R$:70.0" + "\nFuncionario: "+funcionario,
				venda.toString());
	}

}