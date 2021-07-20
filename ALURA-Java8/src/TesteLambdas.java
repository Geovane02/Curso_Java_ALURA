
public class TesteLambdas {
	interface Numeros{
		double getValor (double x, double y);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Numeros soma = (double i, double j) -> (i+j);
		System.out.println(soma.getValor(20, 44));
	}

}
