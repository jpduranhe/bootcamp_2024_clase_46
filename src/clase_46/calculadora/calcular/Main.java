package clase_46.calculadora.calcular;

import java.util.List;

import clase_46.calculadora.model.CalculoHistorico;
import clase_46.calculadora.persistencia.PersisteHistorico;
import clase_46.calculadora.persistencia.PersistidorList;

public class Main {

	public static void main(String[] args) {
		
		PersisteHistorico persistidor= new PersistidorList();
		Calculadora calc= new Calculadora(persistidor);
		
		
		calc.sumar(5, 20);
		calc.sumar(8, 12);
		
		calc.dividir(2, 0);
		
		List<CalculoHistorico> listado= persistidor.obtenerListado();
		
		for(CalculoHistorico ch :listado) {
			System.out.println(ch);
		}

	}

}
