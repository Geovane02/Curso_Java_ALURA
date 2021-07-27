package br.com.alura.servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class ServidorTarefas {
	
	
	
	

	private ServerSocket servidor;
	private ExecutorService threadPool;
	private AtomicBoolean estaRodando;

	public ServidorTarefas() throws IOException {
		// TODO Auto-generated constructor stub
		System.out.println("--- Iniciando servidor---");
		this.servidor=new ServerSocket(12345);//estabelecendo a conexão		
		//serve para controlar a quantidade de Threads e reaproveitar as mesmas Threads, caso um clenta se desconecte do  Servidor
		//ExecutorService threadpool= Executors.newFixedThreadPool(2);
		this.threadPool= Executors.newFixedThreadPool(4);//newCachedThreadPool();//nesse local pode gerar quantas Threads forem necessários
		this.estaRodando = new AtomicBoolean(true);
		
	}

	public void rodar() throws IOException {
		while (this.estaRodando.get()) {
			try {
				Socket socket = servidor.accept(); //cliente se conectando atraves do socket
				System.out.println("Aceitando novo cliente na porta "+socket.getPort());
				
				//CRIANDO UM THREAD PARA CADA CLIENTE
				DistribuirTarefas distribuirTarefas = new DistribuirTarefas(threadPool, socket,this);
				//Thread threadCliente = new Thread(distribuirTarefas);
				//threadCliente.start();
				
				threadPool.execute(distribuirTarefas);
			} catch (SocketException e) {
				System.out.println("SocketException, está rodando "+this.estaRodando);
			}			
		}
		
	}
	
	public void parar() throws IOException {
		this.estaRodando.set(false);
		servidor.close();
		threadPool.shutdown();		
	}
	
	public static void main(String[] args) throws Exception {
		ServidorTarefas servidor = new ServidorTarefas();
		servidor.rodar();
		servidor.parar();
	}

}
