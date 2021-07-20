package br.com.bytebank.banco.texte;
import br.com.bytebank.banco.modelo.*;
public class TesteContas {

	public static void main(String[] args) {
	ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		
		
		
		
		//deve colocar o nome do pacote e depois o nome da conta.
		br.com.bytebank.banco.modelo.ContaPoupanca cp = new br.com.bytebank.banco.modelo.ContaPoupanca (222,222);
			cp.deposita(200.0);
			
			
			cc.tranfere(0, cp);
			cc.saca(100);
			
			System.out.println("CC: "+cc.getSaldo());
			System.out.println("CP: "+cp.getSaldo());
		

		
		
		
		
	}

}
