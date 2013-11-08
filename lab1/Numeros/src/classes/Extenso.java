package classes;
public class Extenso {
    
    public Extenso(){       
    }

    public String numero_por_Extenso(int numero_passado) {
            
            if (numero_passado >= 0 && numero_passado < 20 ){
            	String[] array_inicial = {"zero", "um", "dois", "tres", "quatro", "cinco", "seis", 
            								"sete", "oito", "nove", "dez", "onze", "doze", "treze", 
            								"quatorze", "quize", "dezesseis", "dezessete", "dezoito", "dezenove"};

                    return array_inicial[numero_passado];
            }
            
            if (numero_passado >= 20 && numero_passado < 100){
            		String[] array_das_Dezenas = {"vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
                    int num2 = numero_passado/10;
                    int resto = numero_passado%10;
                    
                    if(resto == 0){
                            return String.format("%s", array_das_Dezenas[num2-2]);
                    }else{
                            return String.format("%s e %s", array_das_Dezenas[num2-2], numero_por_Extenso(resto));
                    }
            }
			return null;
    }

}
