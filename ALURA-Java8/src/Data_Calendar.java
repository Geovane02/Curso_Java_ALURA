import java.util.Calendar;

public class Data_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar c = Calendar.getInstance();
		
		System.out.println("Data e hora atual: "+c.getTime());
		
		
		
		Calendar c2= Calendar.getInstance();
		System.out.println("Data/Hora Atual: "+c2.getTime());
		System.out.println("Ano: "+c2.get(Calendar.YEAR));
		System.out.println("Mês: "+c2.get(Calendar.MONTH));
		System.out.println("Dia do Mês "+c.get(Calendar.DAY_OF_MONTH));
		
	}

}
