
public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		
		
		
		
		
			ContaPoupanca cp = new ContaPoupanca (222,222);
			cp.deposita(200.0);
			
			
			cc.tranfere(0, cp);
			cc.saca(100);
			
			System.out.println("CC: "+cc.getSaldo());
			System.out.println("CP: "+cp.getSaldo());
		

		
		
		
		
	}

}
