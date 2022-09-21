package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends ProductoEmpresa {

	public ProductoCooperativa(Double precio) {
		super(precio);
	}

	@Override
	public Double getPrecio() {
		return super.getPrecio() * 0.9;
	}

}
