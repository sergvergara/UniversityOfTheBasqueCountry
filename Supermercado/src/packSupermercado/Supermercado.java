package packSupermercado;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import jdk.internal.jline.Terminal;

import static java.util.stream.Collectors.*;

public class Supermercado {
	private static Supermercado mSupermercado = Supermercado();
	private List<Terminal>  listaTerminales;
	
	private List<Producto> listaProductos;
	private static Supermercado mSupermercado = new Supermercado();

	/**
	 * Constructor privado de la clase
	 */
	private Supermercado() {
		listaProductos = new ArrayList<>();
	}

	/**
	 * getSupermercado.
	 * Método estático que devuelve la instancia única de la clase
	 * @return la instancia única
	 */
	public static Supermercado getSupermercado() {
		return mSupermercado;
	}
	
	/**
	 * addProducto.
	 * Método que añade un nuevo producto a la lista de productos disponibles en el supermercado.
	 * @param pProd
	 */
	public void addProducto(Producto pProd) {
		listaProductos.add(pProd);
	}
	
	/**
	 * getProductosCaducados
	 * @return devuelve una lista que contiene los productos del supermercado que han caducado.
	 */

	public List<Producto> getProductosCaducados()
	{   //Expresiones lambda!!
		Predicate <Producto> estaCaducado = p -> p.getFechaCaducidad().isBefore(LocalDate.now());
		
		return filtrar(estaCaducado);
	}

	private List<Producto> filtrar(
			Predicate <Producto> pCond){
		
		return listaProductos.stream().filter(pCond).collect(toList()
									);
	}
	
	
	public void actualizarInventario() {
		//listaTerminales.stream().forEach(Terminal::actualizarInnventario)
	}
	
	
	public List<Producto> getInventario() {
		return new ArrayList<>(listaProductos);
		// return listaProductos
	}

}
