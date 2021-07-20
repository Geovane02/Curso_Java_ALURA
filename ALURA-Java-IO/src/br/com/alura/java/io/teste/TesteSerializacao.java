package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	//String nome = "Nico Steppat";
		//criando o objeto.bim
		//ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("Objeto.bin"));
		//oss.writeObject(nome);
		//oss.close();
		
		//visualizando o objeto.bim
		//ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Objeto.bin"));
		//String nome = (String) ois.readObject();
		//ois.close();	
		//System.out.println(nome);
	
	Cliente cliente = new Cliente();
	cliente.nome = "Nico";
	cliente.cpf="12345678905";
	cliente.profissao="Programador";
	
	Cliente cliente2 = new Cliente();
	cliente2.setNome("Nico");
	cliente2.setCpf("09876543219");
	cliente2.setProfissao("Motorista");
	
	
	ObjectOutputStream oss1 = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
	oss1.writeObject(cliente);
	oss1.close();
	ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("cliente.bin"));
	cliente = (Cliente) ois2.readObject();
	ois2.close();	
	System.out.println(cliente.nome+", "+cliente.cpf+", "+cliente.profissao);
	
	
		ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("cliente.bin"));		
		oss.writeObject(cliente2);		
		oss.close();
	
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		cliente2 = (Cliente) ois.readObject();
		ois.close();	
		System.out.println(cliente2.getNome()+", "+cliente2.getCpf()+", "+cliente2.getProfissao());
	
		
		
	
	
	
	
	
	
	
}
}
