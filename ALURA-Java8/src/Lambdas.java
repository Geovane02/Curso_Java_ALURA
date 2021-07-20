
public class Lambdas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("======Inicio do Teste======");

//implemendação da classe anonima Runnable

//criando uma variavel r1 do tipo Runnable, depois vai atribuir uma instacia do tipo Runnable
Runnable r1 = new Runnable() {
	@Override
	public void run() {
		System.out.println("Estudando as expressão Lambda 1");
	}
		
	};
	
	
	Runnable r2;
		r2 = () //lista de argumentos
		-> //Seta indica que estamos trabalhando com expressão Lambdas
		System.out.println("Estudando as expressão Lambda 2"); //CORPO
	
	
	//invocando o método rum para emprimir as mensagens.
	r1.run();
	r2.run();
	}

}
