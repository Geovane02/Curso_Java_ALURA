import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class InterfaceFuncionalPredicate {
	
	
	public static void filtro(List<String> lista, Predicate<String> condicao) {
		for (String s:lista)
			if(condicao.test(s))
				System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista1 = Arrays.asList("Santa Catarina","Paraná","São Paulo","Ceará");
		System.out.println("Lista de cidades que começam com a letra P");
		filtro(lista1, (s)->s.startsWith("P"));
		System.out.println("-----------------------------------------------");
		
		System.out.println("Lista de cidades que terminam com a letra a");
		filtro(lista1, (s)->s.endsWith("a"));
		System.out.println("-----------------------------------------------");
		
		System.out.println("Imprimir toda a lista");
		filtro(lista1, (s)->true);
		System.out.println("-----------------------------------------------");
		
		System.out.println("Imprimir nome de cidades com mais de 10 caracteres");
		filtro(lista1, (s)->s.length()>10);
		System.out.println("-----------------------------------------------");
	}

}
