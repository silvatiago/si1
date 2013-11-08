package classes;

public class Extenso {
    
    public Extenso(){       
    }

    public String numero_por_Extenso(int numero_passado) {
            
            if (numero_passado >= 0 && 
            		numero_passado < 20 ){
            	String[] array_inicial = {"zero", "um", "dois", "tres", "quatro", "cinco", "seis", 
            								"sete", "oito", "nove", "dez", "onze", "doze", "treze", 
            								"quatorze", "quize", "dezesseis", "dezessete", "dezoito", "dezenove"};

                    return array_inicial[numero_passado];
            }
            
            if (numero_passado >= 20 && 
            		numero_passado < 100){
            		String[] array_das_Dezenas = {"vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
                    int divisao = numero_passado/10;
                    int rest = numero_passado%10;
                    
                    if(rest == 0){
                            return array_das_Dezenas[divisao-2];
                    }else{
                            return array_das_Dezenas[divisao-2] + " e " + numero_por_Extenso(rest);
                    }
            }
            
           if (numero_passado == 100){
                return "cem";
        }
           if (numero_passado == 1000){
               return "mil";
       }
           
       
        
        if (numero_passado > 100 && numero_passado < 1000){
                String[] array_das_Centenas = {"cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"}; 
                int num2 = numero_passado/100;
                int resto = numero_passado%100;
                
                if(resto == 0){
                        return String.format("%s", array_das_Centenas[num2-1]);
                }else{
                        return String.format("%s e %s", array_das_Centenas[num2-1], numero_por_Extenso(resto));
                }
        }
            
        
        if (numero_passado > 1000 && numero_passado < 1000000){
                int num2 = numero_passado/1000;
                int resto = numero_passado%1000;
                
                if (resto == 0){
                        if(resto <= 19){
                                return String.format("%s mil", numero_por_Extenso(num2));
                        }
        
                }
                if (resto != 0){
                        if(num2 > 1){
                                if(resto < 100 || resto%100 == 0){
                                        return String.format("%s mil e %s", numero_por_Extenso(num2), numero_por_Extenso(resto));
                                }
                                return String.format("%s mil %s", numero_por_Extenso(num2), numero_por_Extenso(resto));
                        
                        
                        }else{
                                if(resto < 100 || resto%100 == 0){
                                        return String.format("mil e %s", numero_por_Extenso(resto));
                                }                                        
                                return String.format("mil %s", numero_por_Extenso(resto));
                        }
                }
                
        }
        
            
			return null;
    }
    public static void main(String[] args) {
		Extenso e = new Extenso();
		System.out.println(e.numero_por_Extenso(1500));
	}

}
