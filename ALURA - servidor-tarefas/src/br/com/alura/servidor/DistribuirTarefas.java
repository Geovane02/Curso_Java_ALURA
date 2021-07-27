package br.com.alura.servidor;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;

import javax.management.RuntimeErrorException;

public class DistribuirTarefas implements Runnable{

	private Socket  socket;
	private ServidorTarefas servidor;
	private ExecutorService threadPool;
	private Socket socket2;
	private ServidorTarefas servidor2;
	
	public DistribuirTarefas(ExecutorService threadPool, Socket socket, ServidorTarefas servidor) {
		this.threadPool = threadPool;
		socket2 = socket;
		this.socket = socket;
		servidor2 = servidor;
		this.servidor = servidor;
	}

	@Override
	public void run() {
		try {
			System.out.println("Distribuido tarefas para "+ socket);
			Scanner entradaCliente=new Scanner(socket.getInputStream());
			PrintStream saidaCliente = new PrintStream(socket.getOutputStream());
			while (entradaCliente.hasNextLine()) {
				String comando = entradaCliente.nextLine();
				System.out.println("Comando recebido "+comando);
				switch (comando) {
				case "c1": {
					saidaCliente.println("Confirmação comando C1");
					ComandoC1 c1 = new ComandoC1(saidaCliente);
					this.threadPool.execute(c1);
					break;
				}
				case "c2": {
					saidaCliente.println("Confirmação comando C2");
					ComandoC2 c2 = new ComandoC2(saidaCliente);
					this.threadPool.execute(c2);
					break;
				}
				case "c3": {
				
					break;
				}
				case "fim": {
					System.out.println("Desligando servidor");
					servidor.parar();
				}

				default:
					saidaCliente.println("Comando não encontrado");
					break;
				}
			
				System.out.println(comando);
			
			//Thread.sleep(20000);
			}
			saidaCliente.close();
			entradaCliente.close();
		} catch (Exception e) {
			//e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
