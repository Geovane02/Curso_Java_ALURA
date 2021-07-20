package br.com.alura.threds;

public class Principal2 {
	public static void main(String[] args) {
		String nome="John";
		Thread threadAssinatura1 = new Thread(new tarefaBuscarTextual("Assinatura1.txt",nome));
		Thread threadAssinatura2 = new Thread(new tarefaBuscarTextual("Assinatura2.txt",nome));
		Thread threadAsutores = new Thread(new tarefaBuscarTextual("Autores.txt",nome));
		
		threadAssinatura1.start();
		threadAssinatura2.start();
		threadAsutores.start();
		
	}

}
