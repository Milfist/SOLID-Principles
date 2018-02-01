package org.formacion.srp;

import java.util.stream.Collectors;

public class RecomendadorPrintImpl implements RecomendadorPrint {
	
	private Recomendador recomendador;
	
	public RecomendadorPrintImpl(Recomendador recomendador) {
		super();
		this.recomendador = recomendador;
	}

	public String recomendacionesCSV (Cliente cliente) {
		
		return recomendador.recomendaciones(cliente).stream()
		      .map(p -> (p.getTitulo() + "," + p.getDirector() + "," + p.getGenero()))
		      .collect(Collectors.joining("\n"));
	}
}
