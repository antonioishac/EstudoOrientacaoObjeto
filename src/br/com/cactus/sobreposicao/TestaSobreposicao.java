package br.com.cactus.sobreposicao;

import java.text.ParseException;
import java.util.Date;

public class TestaSobreposicao {

	public static void main(String[] args) throws ParseException {

		ProdutoPerecivel pp = new ProdutoPerecivel();
		pp.descricao = "Sabão em pó omo multiação";
		pp.dataValidade = new Date();

		pp.imprime();

	}

}
