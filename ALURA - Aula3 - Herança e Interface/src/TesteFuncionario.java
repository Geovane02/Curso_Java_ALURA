
public class TesteFuncionario {
public static void main(String[] args) {
	
	Funcionario nico = new Gerente();
	
	nico.setNome("Geovane");
	nico.setCpf("000.564.326-07");
	nico.setSalario(1600);
	
	System.out.println("nome: "+nico.getNome());
	System.out.println("Valor da Abonificação: "+nico.getBonificacao());
	
	
	
	
	
	
	
}
}
