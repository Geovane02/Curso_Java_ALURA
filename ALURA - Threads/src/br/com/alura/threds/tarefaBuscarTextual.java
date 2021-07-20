package br.com.alura.threds;

import java.awt.Container;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class tarefaBuscarTextual implements Runnable {

	private String nomeArquivo;
	private String nome;
	public tarefaBuscarTextual(String nomeArquivo, String nome) {
		this.nomeArquivo = nomeArquivo;
		this.nome= nome;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Scanner scanner = new Scanner(new File(nomeArquivo));
			int numeroLinha=1;
			//procurar linha por linha
			//enquanto existe próxima linha
			while(scanner.hasNextLine()) {
				String linha = scanner.nextLine();//me dá a próxima linha
				
				if (linha.contains(nome)) {
					System.out.println(nomeArquivo+" - "+numeroLinha+" - "+linha);
				}
				numeroLinha++;
			}
			
			
			scanner.close();
			
			
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
			//e.printStackTrace();
		}
	}

}
