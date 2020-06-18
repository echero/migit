package ar.edu.ort.tp2.ej6;
//comentario de prueba
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Libro> lLibros = new ArrayList<Libro>();
		lLibros.add(new Libro("Julio Verne", "El piloto del Danubio", "Editorial1"));
		lLibros.add(new Libro("Gabriel Garcia Marquez", "Cien años de soledad", "Editorial1"));
		lLibros.add(new Libro("Miguel de Cervantes", "Don Quijote de la Mancha", "Editorial2"));
		lLibros.add(new Libro("William Shakespeare", "Hamlet", "Editorial3"));
		lLibros.add(new Libro("Antoine de Saint Exupery", "El principito", "Editorial2"));
		lLibros.add(new Libro("Margaret Mitchell", "Lo que el viento se llevo", "Editorial1"));
		lLibros.add(new Libro("Herman Melville", "Moby-Dick", "Editorial1"));
		lLibros.add(new Libro("Charles Lutwidge", "Alicia en el pais de las maravillas", "Editorial2"));
		lLibros.add(new Libro("J.R.R Tolkiee", "El señor de los anillos", "Editorial3"));
		lLibros.add(new Libro("Jonathan Swift", "Los viajes de Gulliver", "Editorial2"));
		ArrayList<Cliente> lClientes = new ArrayList<Cliente>();
		lClientes.add(new Cliente("Cliente uno", 28937137, "cliente@uno", "direccion cliente uno"));
		lClientes.add(new Cliente("Cliente dos", 28937137, "cliente@dos", "direccion cliente dos"));
		lClientes.add(new Cliente("Cliente tres", 28937137, "cliente@tres", "direccion cliente tres"));
		lClientes.add(new Cliente("Cliente cuatro", 28937137, "cliente@cuatro", "direccion cliente cuatro"));
		lClientes.add(new Cliente("Cliente cinco", 28937137, "cliente@cinco", "direccion cliente cinco"));
		lClientes.add(new Cliente("Cliente seis", 28937137, "cliente@seis", "direccion cliente seis"));
		lClientes.add(new Cliente("Cliente siete", 28937137, "cliente@siete", "direccion cliente siete"));
		lClientes.add(new Cliente("Cliente ocho", 28937137, "cliente@ocho", "direccion cliente ocho"));
		lClientes.add(new Cliente("Cliente nueve", 28937137, "cliente@nueve", "direccion cliente nueve"));
		lClientes.add( new Cliente("Cliente diez", 28937137, "cliente@diez", "direccion cliente diez"));
		
		String fechaCompra = "02/05/2020";
		
		Tienda t = new Tienda();
		t.mostrarStock();
		t.mostraPendientes();
		for (int i = 0; i < 10; i++) {
			t.agregarLibro(lLibros.get(i), (i+1));
			t.nuevoPedido(fechaCompra, lLibros.get(i), lClientes.get(i));
			t.nuevoPedido(fechaCompra, lLibros.get(i), lClientes.get(i));
		}
		t.mostrarStock();
		t.mostraPendientes();
		t.mostrarCompletos();
		t.procesarPedidos();
		t.mostraPendientes();
		t.mostrarCompletos();
		t.mostrarStock();
	}

}
