
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class Datas {
	public static void main(String[] args) {
		//pega a data de hoje e imprime.
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		//método para registrar outra data
		LocalDate olimpiadasRio = LocalDate.of(2022, Month.JUNE, 5);
		
		//descobrir quantos anos faltam para as iniciar as olimpiadas
		
		int anos = olimpiadasRio.getYear() - hoje.getYear();
		
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, olimpiadasRio);
		System.out.println("Anos "+periodo.getYears()+", Dias "+periodo.getDays());
		
		
		
		
				}

}
