package classes;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExtensoTest {

	@Test
	public void test() {
		Extenso e = new Extenso();
		
		//testa primeiro numeros
		assertEquals("zero", e.numero_por_Extenso(0));
        assertEquals("um", e.numero_por_Extenso(1));
        assertEquals("dois", e.numero_por_Extenso(2));
        assertEquals("tres", e.numero_por_Extenso(3));
        assertEquals("dezenove", e.numero_por_Extenso(19));
        
        //testa ate 99
        assertEquals("dez", e.numero_por_Extenso(10));
        assertEquals("vinte", e.numero_por_Extenso(20));
        assertEquals("trinta e um", e.numero_por_Extenso(31));
        assertEquals("vinte e nove", e.numero_por_Extenso(29));
        assertEquals("noventa e nove", e.numero_por_Extenso(99));
        
        //testa ate 999
        
        assertEquals("cem", e.numero_por_Extenso(100));
        assertEquals("cento e dois", e.numero_por_Extenso(102));
        assertEquals("duzentos e tres", e.numero_por_Extenso(203));
        assertEquals("cento e dez", e.numero_por_Extenso(110));
        assertEquals("quinhentos", e.numero_por_Extenso(500));
        assertEquals("novecentos e noventa e nove", e.numero_por_Extenso(999));
        assertEquals("novecentos", e.numero_por_Extenso(900));
        
        //teste ate 999999
        
        
        
        


        
        
        
        
	}

}
