package compiler.tree;

import java.util.LinkedList;
import java.util.List;

import compiler.syntax.Simbolo;
import compiler.syntax.TabelaSimbolos;
import compiler.tree.command.DeclVariavel;

public class NomeArgs {
	private static LinkedList<DeclVariavel> paramFormais;
	private Tipo tipo;
	private String identificador;

	public NomeArgs(String identificar, LinkedList<DeclVariavel> paramFormais) {
		this.paramFormais = paramFormais;
//		this.tipo = tipo;
		this.identificador = identificar;
		Simbolo simbolo = new Simbolo(identificar, tipo, paramFormais);
//		tabela.put(simbolo);
//		tabela.criarTabelaLocal();
	}
	

	public static Boolean verificarSemantica() {
		//verificar tabela e adicionar ou dar erro.
		boolean result = true;
		for (DeclVariavel declVariavel : paramFormais) {
			if (!declVariavel.verificarSemantica()) {
				System.err.println("Erro ao verificar declVariavel!");
			}
		}
		return result;
	}

	public String gerarCodigoIntermediario(String filename) {
		return null;
	}
}
