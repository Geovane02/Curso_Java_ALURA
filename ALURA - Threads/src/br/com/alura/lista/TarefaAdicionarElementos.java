package br.com.alura.lista;

public class TarefaAdicionarElementos implements Runnable {

	private Lista lista;
	private int numeroDoThread;
	public TarefaAdicionarElementos(Lista lista, int numeroDoThread) {
		this.lista = lista;
		this.numeroDoThread = numeroDoThread;
		
	}

	@Override
	public void run() {
		for (int i = 0; i<10;i++) {
			lista.adicionarElementos("Thread "+numeroDoThread+" - "+i);
		}

	}

}
