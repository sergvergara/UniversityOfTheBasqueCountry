#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import ${package}.model.TrianguloRectangulo;
import ${package}.view.TRLogger;
import ${package}.view.VentanaTrianguloGrafico;
import ${package}.view.VentanaTrianguloTexto;

public class ProgramaTresVistasTriangulo {

	public static void main(String[] args) {
		TrianguloRectangulo tr = new TrianguloRectangulo(10,100);
		// TODO: Descomenta las lineas 
		// TRLogger trLogger = new TRLogger(tr);
		VentanaTrianguloTexto vTT = new  VentanaTrianguloTexto(tr);
		vTT.setVisible(true);
		// VentanaTrianguloGrafico vTG = new VentanaTrianguloGrafico(tr);
		// vTG.setVisible(true);
	}

}
