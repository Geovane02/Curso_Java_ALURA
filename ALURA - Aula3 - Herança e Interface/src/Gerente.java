
public class Gerente extends Funcionario {

	private int senha;
	
	public boolean autentica(int senha) {
		if(this.getSenha() == senha) {
			return true;
		}else {
		return false;
		}
	}
	
	
	
	public double getBonificacao() {
		//return super.salario; //super quer dizer que sempre vai pegar as variaveis da classe de cima
	
	//return (this.salario*0.1) + super.salario;
		return super.getBonificacao()+ super.getSalario(); //utiliza o reaproveitamento da auteração da classe funcionário, tudo o que alterar lá, auterá automaticamente aqui
	}
	
	
	
	
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	
	
}
