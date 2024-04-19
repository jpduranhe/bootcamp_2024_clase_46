package clase_46.calculadora.persistencia;

import java.util.ArrayList;
import java.util.List;

import clase_46.calculadora.model.CalculoHistorico;

public class PersistidorList implements PersisteHistorico{
	
	private List<CalculoHistorico> listado= new ArrayList();

	@Override
	public void guardar(CalculoHistorico calculoHistorico) {
		listado.add(calculoHistorico);
		
	}

	@Override
	public List<CalculoHistorico> obtenerListado() {
		return listado;
	}

	@Override
	public CalculoHistorico obtenerHistorico(int posicion) {
		return listado.get(posicion);
	}

}
