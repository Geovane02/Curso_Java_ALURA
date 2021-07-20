
public class TesteLambida {


	interface Numeros{
	
		double valores(double n1, double n2);
	}
	
	interface Numeros2{
		int valor(int n1,int n2);
	}
	public static void main(String[] args) {
		
		
		
		Numeros soma =(x,y)-> x+y;
		System.out.println();
		System.out.println(soma.valores(32, 43));
		
		
		
		Numeros2 mult = (a,b)-> a*b;
		System.out.println(mult.valor(4, 3));
		
		
		

	}

}
