package org.formacion.isp;

public interface ProcesadorTextoCorregido {

	public void nueva (String palabra);	
	public String texto ();
	public boolean correcto (Idioma idioma);
	
}
