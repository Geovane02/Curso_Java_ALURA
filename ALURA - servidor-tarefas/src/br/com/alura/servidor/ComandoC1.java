package br.com.alura.servidor;

import java.io.PrintStream;

public class ComandoC1 implements Runnable {

	private PrintStream saida;
	public ComandoC1(PrintStream saida) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Executando comando C1");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		//saida.println("Comando C1 executado com sucesso!");
		System.out.println("Comando C1 executado com sucesso!");
	}
	

}
