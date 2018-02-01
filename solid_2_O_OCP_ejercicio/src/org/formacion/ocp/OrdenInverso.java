package org.formacion.ocp;

import java.util.Collections;
import java.util.List;

public class OrdenInverso implements Orden{

	@Override
	public List<Integer> ordenar(List<Integer> lista) {
		Collections.reverse(lista);
		return lista;
	}

}
