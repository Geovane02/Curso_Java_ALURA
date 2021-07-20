import java.util.Arrays;
import java.util.List;

public class Stream {

	public static void main(String[] args) {
		List <String>lista1 = Arrays.asList("Santa Catarina","São Paulo","Paraná","Mato Grosso");
		//utilizando comando For
		for(String s : lista1) {
			System.out.println("Utilizando sem a opção lambdas");
			System.out.println(s);
		}
		
		//Utilizando o comando ForEache pra utilizar a expressão Lambdas
		System.out.println("Utilizando com a opção lambdas");
		lista1.forEach(x -> System.out.println(x));
		lista1.forEach(System.out::println);//utilizando esta expssão não precisa passar o x como parametro,pois não estamos invocando métodos
	}
}
