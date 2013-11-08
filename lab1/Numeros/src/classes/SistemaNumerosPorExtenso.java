package classes;

import java.util.Scanner;

public class SistemaNumerosPorExtenso {

	public static void main(String[] args) {
		Extenso extenso = new Extenso();
		String Numero = "";
		System.out.print("Insira um número de 0 a 1000000000: ");
		
		while (Numero.equals("")) {
			Scanner numero_entrada = new Scanner(System.in);
			Numero = numero_entrada.nextLine();
			
			
			try {
				System.out.println("O Numero " + Numero + " por extenso é: "
						+ extenso.numero_por_Extenso(Integer.parseInt(Numero)));
			} 
			catch (Exception e) {
				Numero = "";
				System.out.print("Insira um numero de 0 a 1000000000: ");
			}
		}
	}

}
