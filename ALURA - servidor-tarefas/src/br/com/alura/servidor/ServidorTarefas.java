package br.com.alura.servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServidorTarefas {

	public static void main(String[] args) throws Exception {
		System.out.println("--- Iniciando servidor---");
		ServerSocket servidor=new ServerSocket(12345);//estabelecendo a conexão
		
		//serve para controlar a quantidade de Threads e reaproveitar as mesmas Threads, caso um clenta se desconecte do  Servidor
		//ExecutorService threadpool= Executors.newFixedThreadPool(2);
		ExecutorService threadpool= Executors.newCachedThreadPool();//nesse local pode gerar quantas Threads forem necessários
		
		
		
		while (true) {
			Socket socket = servidor.accept(); //cliente se conectando atraves do socket
			System.out.println("Aceitando novo cliente na porta "+socket.getPort());
			
			//CRIANDO UM THREAD PARA CADA CLIENTE
			DistribuirTarefas distribuirTarefas = new DistribuirTarefas(socket);
			//Thread threadCliente = new Thread(distribuirTarefas);
			//threadCliente.start();
			
			threadpool.execute(distribuirTarefas);
			
		}

	}

}
