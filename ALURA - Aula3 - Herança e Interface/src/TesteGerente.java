
public class TesteGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gerente g1=new Gerente();
		
		g1.setNome("Marcos");
		g1.setCpf("095.033.2435-12");
		g1.setSalario(5000.0);
		g1.setSenha(1234);
		
		
		
		
		
		
		
		
		
		System.out.println("Nome de Gerente: "+g1.getNome());
		System.out.println("CPF do Gerente: "+g1.getCpf());
		System.out.println("Salário do Gerente: "+g1.getSalario());
		g1.autentica(2345);
		boolean autentica = g1.autentica(1234);
		System.out.println(autentica);
		System.out.println("Abonificação: "+g1.getBonificacao());
		
		Funcionario ev=new EditorVideo();
		ev.setSalario(2500.0);
		
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		
		controle.registra(ev);
		
		System.out.println(controle.getSoma());
		
		
		
		
		System.out.println();
		
		
		
		
		
		
		
		
	}

}
