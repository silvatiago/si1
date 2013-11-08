package classes;

import java.util.Scanner;

public class Extenso {

	public Extenso() {
	}

	public String numero_por_Extenso(int numero_passado) {

		if (numero_passado == 100) {
			return "cem";
		}
		if (numero_passado == 1000) {
			return "mil";
		}
		if (numero_passado == 1000000) {
			return "um milhao";
		}
		if (numero_passado == 1000000000){
			return "um bilhao";
		}

		if (numero_passado >= 0 && numero_passado < 20) {
			String[] array_inicial = { "zero", "um", "dois", "tres", "quatro",
					"cinco", "seis", "sete", "oito", "nove", "dez", "onze",
					"doze", "treze", "quatorze", "quize", "dezesseis",
					"dezessete", "dezoito", "dezenove" };

			return array_inicial[numero_passado];
		}

		if (numero_passado >= 20 && numero_passado < 100) {
			String[] array_das_Dezenas = { "vinte", "trinta", "quarenta",
					"cinquenta", "sessenta", "setenta", "oitenta", "noventa" };
			int divisao = numero_passado / 10;

			int rest = numero_passado % 10;

			if (rest == 0) {
				return array_das_Dezenas[divisao - 2];
			} else {
				return array_das_Dezenas[divisao - 2] + " e " + numero_por_Extenso(rest);
			}
		}

		if (numero_passado > 100 && numero_passado < 1000) {
			String[] array_das_Centenas = { "cento", "duzentos", "trezentos",
					"quatrocentos", "quinhentos", "seiscentos", "setecentos",
					"oitocentos", "novecentos" };
			int divisao = numero_passado / 100;

			int rest = numero_passado % 100;

			if (rest == 0) {
				return array_das_Centenas[divisao - 1];
			} else {
				return array_das_Centenas[divisao - 1] + " e " + numero_por_Extenso(rest);
			}
		}

		if (numero_passado > 1000 && numero_passado < 1000000) {
			int divisao = numero_passado / 1000;
			
			int rest = numero_passado % 1000;
			

			if (rest == 0) {
				if (rest <= 19) {
					
					return numero_por_Extenso(divisao) + " mil";
				}

			}
			if (rest != 0) {
				if (divisao > 1) {
					if (rest < 100 || rest % 100 == 0) {
						return numero_por_Extenso(divisao) + " mil e " + numero_por_Extenso(rest);
					}
					return numero_por_Extenso(divisao) + " mil " + numero_por_Extenso(rest);

				} else {
					if (rest < 100 || rest % 100 == 0) {
						return "mil e " + numero_por_Extenso(rest);
					}
					return "mil " + numero_por_Extenso(rest);
				}
			}

		}
		if(numero_passado >1000000 && numero_passado <1000000000){
			int divisao = numero_passado / 1000000;
			
			int rest = numero_passado % 1000000;
			
			if (rest == 0) {
				if (rest <= 19) {
					
					return numero_por_Extenso(divisao) + " milhoes";
				}
			}
			if(numero_passado > 1000000 && numero_passado < 2000000 && rest<= 1000){
				return numero_por_Extenso(divisao) + " milhao e " + numero_por_Extenso(rest);
				
			}
			else if(numero_passado > 1000000 && numero_passado < 2000000 && rest >1000){
				return numero_por_Extenso(divisao) + " milhao " + numero_por_Extenso(rest);
			}
			
			if (rest != 0) {
				if (divisao > 1) {
					if (rest < 100 || rest % 1000 == 0) {
						return numero_por_Extenso(divisao) + " milhoes e " + numero_por_Extenso(rest);
					}
					else if(rest > 100){
						return numero_por_Extenso(divisao) + " milhoes " + numero_por_Extenso(rest);
					}
					return numero_por_Extenso(divisao) + " milhoes " + numero_por_Extenso(rest);

				} else {
					if (rest < 100 || rest % 1000 == 0) {
						return "milhoes e " + numero_por_Extenso(rest);
					}
					else if(rest > 100){
						return numero_por_Extenso(divisao) + " milhoes " + numero_por_Extenso(rest);
					}
					return "milhoes " + numero_por_Extenso(rest);
				}
			}
		}
		

		return null;
	}

}
