package ejercicio6_tp2;

import java.util.ArrayList;

public class Pedidos {
	
	private int nroDeCompra;
	private String fechaDeCompra;
	private String libro;
	private String cliente;
	private String estado;
	private ArrayList<Libros>nLibros;
	private ArrayList<Clientes>nClientes;
	private ArrayList<Pedidos>nPedidosProcesados;
	
	public Pedidos(int nroDeCompra, String fechaDeCompra, String libro, String cliente) {
		this.nroDeCompra = nroDeCompra;
		this.fechaDeCompra = fechaDeCompra;
		this.libro = libro;
		this.cliente = cliente;
		this.estado="";
		nLibros = new ArrayList<Libros>();
		nClientes = new ArrayList<Clientes>();
		nPedidosProcesados = new ArrayList<Pedidos>();
	}
	
	public String getFechaDeCompra() {
		return fechaDeCompra;
	}

	public void setFechaDeCompra(String fechaDeCompra) {
		this.fechaDeCompra = fechaDeCompra;
	}

	public String getLibro() {
		return libro;
	}

	public void setLibro(String libro) {
		this.libro = libro;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void agregarLibros(Libros libro){
		nLibros.add(libro);
	}
	
	public void agregarCliente(Clientes cliente){
		nClientes.add(cliente);
	}
	
	public void procesarPedidos(ArrayList<Pedidos> pendientes){
		Pedidos pedidoPendiente;
		for(int i=0; i<pendientes.size(); i++){
			pedidoPendiente = pendientes.get(i);
		Libros libro;
		for(int v=0; v<nLibros.size(); v++){
			libro = nLibros.get(v);
			if(pedidoPendiente.getLibro()==libro.getTituloLibro() && libro.getStock()>=1){
				nPedidosProcesados.add(pedidoPendiente);
				pendientes.remove(pedidoPendiente);
			}
			else{
				System.out.println("No hay suficiente stock");
			}
		} 	
		}
			
	}
	
	public String getValor(){
		return "Numero de compra: "+this.nroDeCompra+
				"\nFecha de compra: "+this.fechaDeCompra+
				"\nTitulo del Libro: "+this.libro+
				"\nCliente: "+this.cliente;
	}
	
	public void mostrarPedidosProcesados(){
		Pedidos pedidosProcesados;
		if(nPedidosProcesados.size()>0){
		for(int i=0; i<nPedidosProcesados.size(); i++){
			pedidosProcesados = nPedidosProcesados.get(i);
			System.out.println(pedidosProcesados.getValor());
		}
		}
		else{
			System.out.println("No hay pedidos Procesados");
		}
	}

}
