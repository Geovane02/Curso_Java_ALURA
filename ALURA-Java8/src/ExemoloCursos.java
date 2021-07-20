import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ExemoloCursos {
	public static void main(String[] args) {
		List<Cursos> cursos = new ArrayList<Cursos>();
		
		cursos.add(new Cursos("Pyton", 45));
		cursos.add(new Cursos("JavaScript", 150));
		cursos.add(new Cursos("Java 8", 113));
		cursos.add(new Cursos("C", 55));
		
		cursos.sort(Comparator.comparing(Cursos::getAlunos));
		//cursos.forEach(c -> System.out.println(c.getNome()));
		
		//imprimir cursos que tenha mais de 100 alunos
		cursos.stream().filter(c ->c.getAlunos() >= 100).forEach(c ->System.out.println(c.getNome()));
		
		//utilizando filtro para imprimir as quantidades de alunos maior ou igual a 100;
		cursos.stream().filter(c ->c.getAlunos() >= 100).map(c -> c.getAlunos()).forEach(total -> System.out.println(total));
		
		//somar a quantidade de alunos que forem maior ou igual a cem;
		int sum = cursos.stream().filter(c ->c.getAlunos() >= 100).mapToInt(Cursos :: getAlunos).sum();
		System.out.println(sum);
		
		//métodos para escolher um dos cursos aleatórios depois de filtrado
		Optional<Cursos> optionalCursos = cursos.stream().filter(c -> c.getAlunos() >=100).findAny();
		optionalCursos.ifPresent(c -> System.out.println(c.getNome()));
		
		}
			
		
}

