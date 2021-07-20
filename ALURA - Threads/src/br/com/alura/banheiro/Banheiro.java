package br.com.alura.banheiro;

public class Banheiro {
	
	public void fazNumero1() {
		
		String nome = Thread.currentThread().getName();
		System.out.println(nome+" batendo na porta");
		//sincroniza o tempo 
	synchronized (this) {
		System.out.println(nome+" Entrando no banheiro");
		System.out.println(nome+" Fazendo coisas rapidas");
		//fazendo tratamendo de erro Surround with try/catch
				try {
					Thread.sleep(5000);//travando a execução em 10segundos
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
		System.out.println(nome+" Dando descarga");
		System.out.println(nome+" Lavando a mão");
		System.out.println(nome+" Saindo do banheiro");
	}
	}
		
	
		

	public void fazNumero2() {
		String nome = Thread.currentThread().getName();
		System.out.println(nome+" batendo na porta");
		synchronized (this) {
		System.out.println(nome+" Entrando no banheiro");
		System.out.println(nome+" Fazendo coisas demora");
		
		//fazendo tratamendo de erro Surround with try/catch
		try {
			Thread.sleep(10000);//travando a execução em 10segundos
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println(nome+" Dando descarga");
		System.out.println(nome+" Lavando a mão");
		System.out.println(nome+" Saindo do banheiro");
		}
	}
}
