package org.formacion.srp;

import java.util.List;

import org.junit.Test;

import org.junit.Assert;

public class TestRecomendador {

	@Test
	public void test() {
		Recomendador r = new RecomendadorImpl();
		
		List<Pelicula> recomenaciones = r.recomendaciones(BBDD.JUAN);
		
		Assert.assertFalse(recomenaciones.contains(BBDD.ET));
	}
	
	@Test 
	public void test_formato() {
		RecomendadorPrint r = new RecomendadorPrintImpl(new RecomendadorImpl());
		
		String csv = r.recomendacionesCSV(BBDD.JUAN);
		
		String esperado = "Salvar al soldado Ryan,Spielberg,belico";
		
		Assert.assertEquals(esperado, csv);

	}

}
