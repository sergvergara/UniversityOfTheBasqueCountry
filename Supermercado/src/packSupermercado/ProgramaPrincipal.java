package packSupermercado;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;


import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// Obtener la instancia de supermercado
		Supermercado supermercado = Supermercado.getSupermercado();

		// Añadir algunos productos
		supermercado.addProducto(new Producto("Producto1", "Sec1", 5.5f, LocalDate.of(2017, 12, 12)));
		supermercado.addProducto(new Producto("Producto2", "Sec1", 3.1f, LocalDate.of(2018, 12, 12)));
		supermercado.addProducto(new Producto("Producto3", "Sec2", 11f, LocalDate.of(2019, 12, 21)));

		// Mostrar los productos caducados
		
		/*
		 * List<Producto> caducados = supermercado.getProductosCaducados(); for
		 * (Producto producto : caducados) { System.out.println(producto); }
		 A continuación simplificado:
		 */ 
		supermercado.getProductosCaducados().stream().forEach( p -> {System.out.println(p);});

		// TODO: Implementar el mismo comportamiento con Java 8
		
		//TODO: mostrar los productos ordenados por precio
		supermercado.getInventario().stream().sorted(comparing(Producto::getPrecio)).forEach(System.out::println);
		

		// TODO: Obtener el precio del producto más barato por sección
		Map<String, Float> baratoPorSeccion = supermercado.getInventario()
														.stream()
														.collect(
																groupingBy(Producto::getSeccion,collectingAndThen(minBy(comparingDouble(Producto::getPrecio)),
																		p->p.get().getPrecio())));

		System.out.println(baratoPorSeccion);
		// TODO: Calcular la suma de los precios de todos los productos no
		// caducados
		
		Predicate <Producto> estaCaducado = p -> p.getFechaCaducidad().isBefore(LocalDate.now());
		
		
        double sumaPrecios = supermercado.getInventario().parallelStream().filter(estaCaducado.negate()).mapToDouble(Producto::getPrecio).sum();
        
        System.out.println("La suma de los precios es: " + sumaPrecios);
		
		
		
		
		

		// TODO: Mostrar los productos ordenados por precio. De menor a mayor.
		supermercado.getInventario().stream().sorted(comparing(Producto::getPrecio).reversed())
				.forEach(System.out::println);

		System.out.println(supermercado.getInventario().stream().min(comparing(Producto::getPrecio)).get());
	}

}
