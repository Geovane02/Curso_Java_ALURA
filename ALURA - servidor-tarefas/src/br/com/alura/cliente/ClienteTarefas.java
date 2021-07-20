package br.com.alura.cliente;

//import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class ClienteTarefas {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 12345);
		System.out.println("Conexão estabelecida");
		
		Scanner teclado = new Scanner(System.in);
		teclado.nextLine();
		
		
		
		socket.close();
		
	}

}
