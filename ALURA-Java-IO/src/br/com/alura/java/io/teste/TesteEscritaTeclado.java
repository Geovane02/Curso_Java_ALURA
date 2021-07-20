package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;


public class TesteEscritaTeclado {
	public static void main(String[] args) throws IOException { 
		//Fluxo de entrada com arquivos
		InputStream fis = System.in; //entrada de dados através do teclado;
		InputStreamReader isr =new InputStreamReader(fis); 
		BufferedReader br = new BufferedReader(isr); 		
		
		//fluxo de saida
		//OutputStream fos = new FileOutputStream("lorem4.txt");//saída de dados referente o que foi digitado
		OutputStream fos = System.out; //saida para console.
		Writer osw =new OutputStreamWriter(fos); 
		BufferedWriter bw = new BufferedWriter(osw);
			
		String linha = br.readLine();
		
			while (linha !=null && !linha.isEmpty()) {	
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha=br.readLine();
			
		}		
		
		br.close();
		bw.close();
		
	}

}
