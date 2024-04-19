package clase_46.calculadora.persistencia;

import java.util.List;

import clase_46.calculadora.model.CalculoHistorico;

public interface PersisteHistorico {

	void guardar(CalculoHistorico calculoHistorico);
	List<CalculoHistorico> obtenerListado();
	CalculoHistorico obtenerHistorico(int posicion);
}
