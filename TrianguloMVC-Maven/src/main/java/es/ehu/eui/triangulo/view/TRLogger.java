package es.ehu.eui.triangulo.view;

import java.util.Observable;
import java.util.Observer;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import es.ehu.eui.triangulo.model.TrianguloRectangulo;

public class TRLogger implements Observer {
	private Logger logger;
	private TrianguloRectangulo modelo;
	
	public TRLogger(TrianguloRectangulo pTriangulo) {
		logger = Logger.getLogger(TRLogger.class);
		DOMConfigurator.configure(this.getClass().getResource("/logproperties.xml"));
		modelo = pTriangulo;
		modelo.addObserver(this);
		update(modelo, null);
	}

	public void update(Observable o, Object arg) {
		// TODO: modificar el codigo para que refleje los cambios en el log -- logger.info(mensaje)
	}

}
