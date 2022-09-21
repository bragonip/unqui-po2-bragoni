package ar.edu.unq.po2.tp5;

//import java.util.*;

public class Caja implements Agencia {

	private MercadoCentral mercado;
	private Double montoTotal = 0d;

	public Caja(MercadoCentral mercado) {
		this.setMercado(mercado);
	}

	public MercadoCentral getMercado() {
		return this.mercado;
	}

	private void setMercado(MercadoCentral mercado) {
		this.mercado = mercado;
	}

	public Double getMontoTotal() {
		return this.montoTotal;
	}

	private void setMontoTotal(Double montoTotal) {
		this.montoTotal = montoTotal;
	}

//	public void registrarProductos(List<ProductoEmpresa> productos) {
//		this.setMontoTotal(0d);
//		productos.stream().forEach(producto -> this.registrarProducto(producto));
//	}

	public void registrarProducto(ProductoEmpresa producto) {
		this.setMontoTotal(this.getMontoTotal() + producto.getPrecio());
		this.restarProductoDeStock(producto);
	}

	public void restarProductoDeStock(ProductoEmpresa producto) {
		this.getMercado().restarProducto(producto);
	}

//	public void pagarFacturas(List<Factura> facturas) {
//		this.setMontoTotal(0d);
//		facturas.stream().forEach(factura -> this.registrarPago(factura));
//	}

	@Override
	public void registrarPago(Factura factura) {
		// TODO Auto-generated method stub
	}

}
