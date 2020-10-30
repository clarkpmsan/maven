package tn.esprit;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {

	Calcul calcul = new Calcul();

	@Test
	public void testCalculerSom(){
		
		Assert.assertEquals(10, calcul.calculerSom(8, 2));
		
	}
	
	@Test
	public void testCalculDiff(){
		
		Assert.assertEquals(3, calcul.calculerDiff(5, 2));
	}
	
	
}
