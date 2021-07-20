package br.com.alura.java.io.teste;


import java.io.BufferedWriter;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
//import java.io.Reader;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	
		

		//Fluxo de saida FileWriter
		FileWriter fw = new FileWriter("lorem5.txt");
		fw.write("Cursos ALURA");
		fw.write("\n");
		fw.write("Java IO");
		fw.write(System.lineSeparator());//comando para separer linhas, tambem pode utilizar \n
		fw.write("Testando Comando de Atalho FileWriter");
		
		
		
	
		
		
		
		fw.close(); 
		

	}

}
