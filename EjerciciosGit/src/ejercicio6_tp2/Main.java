package ejercicio6_tp2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Libros libroUno= new Libros("Julio Cortazar", "Rayuela", "Cuspide", 3 );
		Libros libroDos= new Libros("Ernesto Sabato", "tunel", "Santillana", 3 );
		Libros libroTres= new Libros("Roberto Fontanarrosa", "Nada del otro mundo ", "Carlota", 3 );
		
		Clientes clienteUno = new Clientes("Ezequiel Cherone", 33346114, "chero2005@hotmail.com", "El indio 196");
		Clientes clientedos = new Clientes("Javier Cherone", 30346114, "javichero@hotmail.com", "Merlo 765");
		
		Pedidos pedido = new Pedidos(100, "29/04/2020", "Rayuela", "Ezequiel Cherone");
		Pedidos pedido2 = new Pedidos(110, "02/05/2020", "tunel", "Javier Cherone");
		ArrayList<Pedidos> nPedidosPendientes = new ArrayList<Pedidos>();
		
		pedido.agregarLibros(libroUno);
		pedido.agregarCliente(clienteUno);
		nPedidosPendientes.add(pedido);
		pedido.procesarPedidos(nPedidosPendientes);
		pedido.mostrarPedidosProcesados();
		System.out.println("Lista de pedidos Confirmados: ");
		System.out.println();
		
		pedido.mostrarPedidosProcesados();
		
		System.out.println();
		
		pedido2.agregarLibros(libroDos);
		pedido2.agregarCliente(clientedos);
		nPedidosPendientes.add(pedido2);
		pedido2.procesarPedidos(nPedidosPendientes);
		
		pedido2.mostrarPedidosProcesados();
		
	}

}
