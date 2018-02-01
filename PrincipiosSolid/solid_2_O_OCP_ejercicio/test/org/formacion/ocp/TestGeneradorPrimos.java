package org.formacion.ocp;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.Assert;
import static org.hamcrest.CoreMatchers.*;

public class TestGeneradorPrimos {
	
	@Test
	public void test_orden_natural() {
		
		GeneradorPrimos generador = new GeneradorPrimosImpl();
		List<Integer> expected = Arrays.asList(2,3,5,7,11,13);
		
		Orden o = new OrdenNatural();
		
		Assert.assertThat(generador.primos(15, (Orden)o), is(expected));
	}	

	@Test
	public void test_orden_inverso() {
		
		GeneradorPrimos generador = new GeneradorPrimosImpl();
		List<Integer> expected = Arrays.asList(13,11,7,5,3,2);
		
		Orden o = new OrdenInverso();
		
		Assert.assertThat(generador.primos(15, (Orden)o), is(expected));
	}	

}
