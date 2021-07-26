package br.com.alura.cliente;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
//import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class ClienteTarefas {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 12345);
		System.out.println("Conexão estabelecida");
		
		
		
		
		//ENVIANDO DADOS PARA O SERVIDOR
		Thread threadEnviaComando = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					System.out.println("ENVIANDO DADOS DO SERVIDOR");
					PrintStream saida = new PrintStream(socket.getOutputStream());
					Scanner teclado = new Scanner(System.in);
					while(teclado.hasNextLine()) {
						String  linha = teclado.nextLine();
							if(linha.trim().equals("")) {
								break;
							}
						saida.println(linha);
					}
					saida.close();
					teclado.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			
			
		});
		
		//RECEBENDO DADOS DO SERVIDOR		
		Thread threadRecebeResposta = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					System.out.println("RECEBENDO DADOS DO SERVIDOR");
					Scanner respostaServidor = new Scanner(socket.getInputStream());
					while(respostaServidor.hasNextLine()) {
						String linha = respostaServidor.nextLine();
						System.out.println(linha);
					}
					
					respostaServidor.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
				
			}
			
		});
		
		threadEnviaComando.start();
		threadRecebeResposta.start();
		threadEnviaComando.join();
		
		System.out.println("Fechando conexão socket do cliente");
		socket.close();
		
	}

}
