import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		
		//ordenando palavras em ordem alfabeticas
		List<String> palavras = new ArrayList<String>();
		
		palavras.add("Alura");
		palavras.add("Editora de códigos");
		palavras.add("cielom");
		
		Collections.sort(palavras);
		System.out.println(palavras);
		
		
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		palavras.sort(comparador);
		System.out.println(palavras);
		
		
		//ordenar nomes por linhas
		Consumer<String> consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);

	}

}

class ImprimeNaLinha implements Consumer<String>{

	@Override
	public void accept(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
		
	}
	
}




//ordenando palvras por tamanho
class ComparadorPorTamanho implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length() < s2.length())
			return -1;
		if(s1.length() > s2.length())
			return 1;
		
		return 0;
	}
	
	
}