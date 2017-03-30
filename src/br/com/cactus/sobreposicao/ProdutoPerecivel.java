package br.com.cactus.sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto {

	protected Date dataValidade;

	@Override
	public void imprime() {
		super.imprime();
		System.out.println("A data de validade do produto é: " + dataValidade);
	}

}
