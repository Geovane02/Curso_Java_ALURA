
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
public class Cursos {

	private String nome;
	private int alunos;
	
	
	public Cursos(String nome, int i) {
		super();
		this.nome = nome;
		this.alunos = i;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getAlunos() {
		return alunos;
	}


	public void setAlunos(int alunos) {
		this.alunos = alunos;
	}
		
	
}


