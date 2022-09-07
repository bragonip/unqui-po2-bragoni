package ar.edu.unq.po2.tp3;

public class Rectangulo {

	private Point origen;
	private int base;
	private int altura;

	public Rectangulo(Point origen, int base, int altura) {

		this.setOrigen(origen);
		this.setBase(base);
		this.setAltura(altura);

	}

	public Point getOrigen() {
		return origen;
	}

	public void setOrigen(Point origen) {
		this.origen = origen;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int perimetro() {
		return 2 * (this.getBase() + this.getAltura());
	}

	public int area() {
		return this.getBase() * this.getAltura();
	}

	public boolean esHorizontal() {
		return this.getBase() >= this.getAltura();
	}

	public boolean esVertical() {
		return this.getBase() <= this.getAltura();
	}
}
