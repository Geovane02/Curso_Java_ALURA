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
import java.io.PrintStream;
//import java.io.Reader;
import java.io.Writer;

public class TesteEscritaPrintStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	
		

		//Fluxo de saida PrintStream 
		PrintStream ps = new PrintStream("lorem6.txt");
		ps.println("Cursos ALURA");	
		ps.println();
		ps.println("Java IO - PrintStream");	
		ps.println("Testando Comando de Atalho PrintStream");
		ps.close(); 
		

	}

}
