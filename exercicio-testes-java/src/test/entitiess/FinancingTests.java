package test.entitiess;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {
	

	@Test
	private void ConstructorShouldInstanciateWhenValidArguments() {
		
		Financing f1 = new Financing(300000.0,2000.0,300);
		
		f1.entry();
		
		Assertions.assertEquals(0,f1.quota());
	}
}