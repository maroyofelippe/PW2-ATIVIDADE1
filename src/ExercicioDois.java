
public class ExercicioDois {
	
	public static boolean possoIrBanco(String diaSemana, int hora) {
		
		if (diaSemana.equalsIgnoreCase("s�bado") || diaSemana.equalsIgnoreCase("domingo")) {
			return false;
		}else if (hora < 10 || hora > 16) {
			return false;
		}else {
			return true;
		}
	}
	
	public static void main(String[] args) {
		String diaDaSemana = "SEGUNDA";
		int horaBanco = 15;
		
		if (possoIrBanco(diaDaSemana, horaBanco) == true) {
			System.out.println("Na " + diaDaSemana + " �s " + horaBanco + " voc� pode ir ao banco!");
		}else {
			System.out.println(diaDaSemana + " �s " + horaBanco + " voc� n�o pode ir ao banco!");
		}
	}

}
