package br.com.alura.servidor;

import java.io.PrintStream;

public class ComandoC2 implements Runnable {

	private PrintStream saida;
	public ComandoC2(PrintStream saida) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Executando comando C2");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		//saida.println("Comando C2 executado com sucesso!");
	}
	

}
