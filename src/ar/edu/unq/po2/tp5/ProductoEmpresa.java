package ar.edu.unq.po2.tp5;

public class ProductoEmpresa implements IRegistrable{

	private Double precio;

	public ProductoEmpresa(Double precio) {
		this.setPrecio(precio);
	}

	public Double getPrecio() {
		return this.precio;
	}

	private void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public void registrar(Caja caja) {
		// TODO Auto-generated method stub
		
	}

}
