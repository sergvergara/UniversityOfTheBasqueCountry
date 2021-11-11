#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import ${package}.view.SemaforoCoches;
import ${package}.view.SemaforoPeatones;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		SemaforoCoches sc = new SemaforoCoches();
		SemaforoPeatones sp = new SemaforoPeatones();
	}
}
