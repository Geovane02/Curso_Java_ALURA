//não pode instanciar, criar objetos dessa classe, porque é abistrata



//O QUE SÃO CLASSES ABSTRATAS
//As classes abstratas são as que não permitem realizar qualquer tipo de instância. 
//São classes feitas especialmente para serem modelos para suas classes derivadas. 
//As classes derivadas, via de regra, deverão sobrescrever os métodos para realizar 
//a implementação dos mesmos.
public abstract class Funcionario {

	//atributos
	private String nome;
	private String cpf;   //private é usado so na mesma classe, não libera para outras classe filhos
	private double salario; 

	
	
	
	
	public double getBonificacao() {
		return this.salario * 0.05;
	}
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
	
}
