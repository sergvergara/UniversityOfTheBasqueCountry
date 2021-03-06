#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model;

import java.util.Observable;

import static java.lang.Math.*;

/**
 * Esta clase representa un triangulo rectangulo. 
 * Constituye el modelo de la aplicacion, para lo extiende
 * la clase {@link java.util.Observable Observable}.
 *
 * @author mikel
 *
 */
public class TrianguloRectangulo extends Observable {
	
	// Atributos
	private int base;
	private int altura;
	private double hipotenusa;
	
	/**
	 * Crea un triangulo rectangulo con la base y altura indicados
	 * @param pBase -- la base 
	 * @param pAltura -- la altura
	 * @require pBase >= 0 && pAltura >= 0
	 */
	public TrianguloRectangulo(int pBase, int pAltura) {
		if (pBase <0||pAltura<0) {
			throw new IllegalArgumentException();
		}
		base = pBase;
		altura = pAltura;
		setHipotenusa();
	}

	// Getters
	
	/**
	 * Devuelve el valor de la base
	 * @return la base
	 * @ensure result >= 0
	 */
	public int getBase() {
		return base;
	}
	
	/**
	 * Devuelve el valor de la altura
	 * @return la altura
	 * @ensure result >= 0
	 */
	public int getAltura() {
		return altura;
	}
	
	/**
	 * Devuelve el valor de la hipotenusa
	 * @return la hipotenusa
	 * @ensure result >= 0
	 */
	public double getHipotenusa() {
		return hipotenusa;
	}

	/**
	 * Establece el nuevo valor de la base
	 * @param pBase -- la base
	 * @require pBase >= 0 
	 */
	public void setBase(int pBase) {
		// TODO: Implementar este metodo
		if (pBase<0) {
			throw new IllegalArgumentException();
		}
		base = pBase;
		setHipotenusa();
	}

	/**
	 * Establece el nuevo valor de la altura
	 * @param pAltura -- la altura
	 * @require pAltura >= 0 
	 */
	public void setAltura(int pAltura) {
		// TODO: Implementar este metodo
		if (pAltura<0) {
			throw new IllegalArgumentException();
		}
		altura = pAltura;
		setHipotenusa();
	}

	/**
	 * @param hipotenusa the hipotenusa to set
	 */
	private void setHipotenusa() {
		this.hipotenusa = sqrt(pow(base,2) + pow(altura,2));
		setChanged();
		notifyObservers();
	}
	
// TODO: modifica la clase para que avise a las vistas de que se han producido cambios
}
