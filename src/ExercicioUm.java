
public class ExercicioUm {
	
	public static boolean ehDiaSemana(String diaSemana){
		
		if (diaSemana == "Sabado" || diaSemana == "Domingo") {
			return false;
		}
		return true;
	}


	public static void main(String[] args) {
		
		String diaSemana = "Terça-feira";
		
		if (ehDiaSemana(diaSemana) == true) {
			System.out.println("Dia Util");
		}else {
			System.out.println("Final de Semana");
		}
		
		
	}
}
