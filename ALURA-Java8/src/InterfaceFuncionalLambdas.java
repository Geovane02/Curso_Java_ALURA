
public class InterfaceFuncionalLambdas {

	interface Num{ //Interface Funcional
		double getValue(); //método abstrato
		
	}
	
	
	interface ValorNumerico{
		boolean teste(int n);
	}
	
	interface ValorNumerico2{
		boolean teste(int n1,int n2);
	}
	
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

			Num n; //declarando variavel tipo Num, atribui nome n
			//atribuir redultado tipo Lambda na variavel n
			n = () -> 3.555;
			System.out.println(n.getValue());
			
			Num n2;
			n2 = () -> Math.random() * 100;
			System.out.println(n2.getValue());
			
			
			
			ValorNumerico isPar = (int i) -> (i % 2)==0; //calculando resto da divisão
			System.out.println(isPar.teste(89));
			System.out.println(isPar.teste(90));
			
			
			ValorNumerico2 isDiv = (x,y) -> (x%y)==0;
			System.out.println(isDiv.teste(2,5));
			
			
			ValorNumerico2 a = (int x, int y)-> {
				
				int w = x + y;
				return w > 1000;
				
		
			
				
			}
			;
			
	}

}
