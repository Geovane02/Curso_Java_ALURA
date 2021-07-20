package br.com.alura.java.io.teste;


import java.io.BufferedWriter;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
//import java.io.Reader;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	
		

		//Fluxo de entrada com arquivos
		OutputStream fos = new FileOutputStream("lorem2.txt");
		//tratamento de exceção
		Writer osw =new OutputStreamWriter(fos); 
		BufferedWriter bw = new BufferedWriter(osw);
	
		bw.write("Cursos ALURA");
		bw.newLine();
		bw.newLine();
		bw.write("Pitanga - Paraná");
		
		
		
	
		
		
		
		bw.close(); 
		

	}

}
