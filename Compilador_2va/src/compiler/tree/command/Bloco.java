package compiler.tree.command;

import java.util.ArrayList;
import java.util.List;

import compiler.tree.Tipo;


public class Bloco implements Comando {
	private List<Comando> comandos;

	public Bloco() {
		this.comandos = new ArrayList<Comando>();
	}

	public Bloco(List<Comando> comandos) {
		this.comandos = comandos;
	}

	public void add(Comando cmd) {
		this.comandos.add(cmd);
	}

	@Override
	public Boolean verificarSemantica() {
		boolean result = true;
		for (Comando comando : comandos) {
			comando.verificarSemantica();
		}
		return result;
	}
	
	@Override
	public Tipo getTipo() {
		return null;
	}

	@Override
	public String gerarCodigoIntermediario(String filename) {
		return null;
	}
}
