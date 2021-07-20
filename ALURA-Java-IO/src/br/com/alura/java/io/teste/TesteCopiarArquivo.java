package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;



public class TesteCopiarArquivo {
	public static void main(String[] args) throws IOException { 
		//Fluxo de entrada com arquivos
		FileInputStream fis = new FileInputStream("lorem.txt");
		InputStreamReader isr =new InputStreamReader(fis); 
		BufferedReader br = new BufferedReader(isr); 
		
		
		//fluxo de saida
		OutputStream fos = new FileOutputStream("lorem3.txt");
		Writer osw =new OutputStreamWriter(fos); 
		BufferedWriter bw = new BufferedWriter(osw);
			
		String linha = br.readLine();
		
			while (linha !=null) {	
			bw.write(linha);
			bw.newLine();
			linha=br.readLine();
			
		}
		
		
		br.close();
		bw.close();
		
		
		
	}

}
