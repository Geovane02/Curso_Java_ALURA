package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;



public class TesteLeitura {
	public static void main(String[] args) throws IOException { //para receber um arquivo é preciso fazer um throws
		
		
		//Fluxo de entrada com arquivos
		FileInputStream fis = new FileInputStream("lorem.txt");//comando para receber um arquivo
		
		
		//tratamento de exceção
		InputStreamReader isr =new InputStreamReader(fis); //transformando Bytes e bates em caracter
		BufferedReader br = new BufferedReader(isr); //carregando os caracteres de uma linha
		String linha = br.readLine();//comando que faz a leitura de uma unica linha
		
		
		
		//código para ler todo o arquivo
		while (linha !=null) {
			//saida de dados
			System.out.println(linha);
			linha=br.readLine();
			
		}
		
		
		br.close(); //fechando fluxo de entrada
		
		
		
	}

}
