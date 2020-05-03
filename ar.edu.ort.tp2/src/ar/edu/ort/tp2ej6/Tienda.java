package ar.edu.ort.tp2ej6;

import java.util.ArrayList;

public class Tienda {
	private ArrayList<Pedido> lPendientes;
	private ArrayList<Pedido> lCompletos;
	private ArrayList<Stock> lStock;
	private int nroCompra;
	
	public Tienda() {
		this.lPendientes = new ArrayList<Pedido>();
		this.lCompletos = new ArrayList<Pedido>();
		this.lStock = new ArrayList<Stock>();
		this.nroCompra = 0;
	}
	//composicion
	public void nuevoPedido(String fechaCompra, Libro libro, Cliente cliente) {
		nroCompra++;
		Pedido nuevoPedido = new Pedido(nroCompra,fechaCompra, libro, cliente);
		agregarPedido(nuevoPedido);
	}
	
	private void agregarPedido(Pedido pedido) {
		this.lPendientes.add(pedido);
	}
	//composicion
	public void agregarLibro(Libro libro,int cantidad) {
		int ubicacionEnStock = buscarLibroEnStock(libro);
		if(ubicacionEnStock<0) {
			Stock sumarLibro = new Stock(libro, cantidad);
			this.lStock.add(sumarLibro);
		}else {
			this.lStock.get(ubicacionEnStock).actualizarCantLibros(cantidad);
		}
	}
	
	public void procesarPedidos() {
		int ubicacion;
		Libro libro;
		Pedido pedido;
		int i = 0;
		while(i<this.lPendientes.size()){
			pedido = this.lPendientes.get(i);
			libro = pedido.getLibro();
			ubicacion = buscarLibroEnStock(libro);
			if(this.lStock.get(ubicacion).reservarLibro()) {
				pedido = this.lPendientes.remove(i);
				this.lCompletos.add(pedido);
			}else
				i++;
		}
		System.out.println("PROCESANDO PEDIDOS");
	}

	private int buscarLibroEnStock(Libro libro) {
		int ubicacionEnStock = -1;
		int i = 0;
		Libro libroAux;
		while(i<this.lStock.size() && ubicacionEnStock == -1) {
			libroAux = this.lStock.get(i).getLibro();
			if(libroAux.getTitulo().equals(libro.getTitulo())&&libroAux.getAutor().equals(libro.getAutor()) ) {
				ubicacionEnStock = i;
			}else {
				i++;
			}
		}
		return ubicacionEnStock;
	}
	
	public void mostraPendientes() {
		System.out.println("Lista de pedididos pendientes:");
		mostrar(this.lPendientes);		
	}
	public void mostrarCompletos() {
		System.out.println("Lista de pedidos completados:");
		mostrar(this.lCompletos);
	}
	private void mostrar(ArrayList<Pedido> lPedidos) {
		if(lPedidos.size()<=0)
			System.out.println("sin pedidos");
		else
			for (Pedido pedido : lPedidos) {
				System.out.println(pedido);
			}
	}
	public void mostrarStock() {
		System.out.println("Catálogo:");
		if(lStock.size()<=0)
			System.out.println("Vacío");
		else
			for (Stock libro : lStock) {
				System.out.println(libro);
			}
	}

}
