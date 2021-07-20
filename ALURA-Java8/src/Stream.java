import java.util.Arrays;
import java.util.List;

public class Stream {

	public static void main(String[] args) {
		List <String>lista1 = Arrays.asList("Santa Catarina","S�o Paulo","Paran�","Mato Grosso");
		//utilizando comando For
		for(String s : lista1) {
			System.out.println("Utilizando sem a op��o lambdas");
			System.out.println(s);
		}
		
		//Utilizando o comando ForEache pra utilizar a express�o Lambdas
		System.out.println("Utilizando com a op��o lambdas");
		lista1.forEach(x -> System.out.println(x));
		lista1.forEach(System.out::println);//utilizando esta expss�o n�o precisa passar o x como parametro,pois n�o estamos invocando m�todos
	}
}
