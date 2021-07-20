
public class Teste {

	public static void main(String[] args) {
		
		
		FuncionarioTexte f1 = new FuncionarioTexte();
		FuncionarioTexte f2 = new FuncionarioTexte();
		FuncionarioTexte f3 = new FuncionarioTexte();
		
		f1.setNome("Carlos Juliano");
		f1.setCpf("098.038.083-29");
		f1.setSalario(3000.30);
		//f1.setTipo(0);
		
		f2.setNome("Railson Montes");
		f2.setCpf("098.000.083-00");
		f2.setSalario(5000.0);
		f2.setTipo(1);
		
		f3.setNome("Julia Marcondes");
		f3.setCpf("345.000.084-00");
		f3.setSalario(20000);
		f3.setTipo(2);
		
		
		System.out.println("-------DADOS DO FUNCIONÁRIO------");
		System.out.println("NOME: "+f1.getNome());
		System.out.println("CPF: "+f1.getCpf());
		System.out.println("TIPO: "+f1.getTipo());
		System.out.println("SALÁRIO: "+f1.getSalario());
		System.out.println("BONIFICAÇÃO: "+f1.getBonificacao());
		System.out.println("");
		
		System.out.println("-------DADOS DO GERENTE------");
		System.out.println("NOME: "+f2.getNome());
		System.out.println("CPF: "+f2.getCpf());
		System.out.println("TIPO: "+f2.getTipo());
		System.out.println("SALÁRIO: "+f2.getSalario());
		System.out.println("BONIFICAÇÃO: "+f2.getBonificacao());
		System.out.println("");
		
		System.out.println("-------DADOS DO DIRETOR------");
		System.out.println("NOME: "+f3.getNome());
		System.out.println("CPF: "+f3.getCpf());
		System.out.println("TIPO: "+f3.getTipo());
		System.out.println("SALÁRIO: "+f3.getSalario());
		System.out.println("BONIFICAÇÃO: "+f3.getBonificacao());
		System.out.println("");
		
		

	}

}
