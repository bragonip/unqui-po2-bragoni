package ar.edu.unq.po2.tp3;

public class Rectangulo {

	private Point leftDown;
	private Point leftUp;
	private Point rightDown;
	private Point rightUp;

	public Rectangulo(Point origen, int base, int altura) {
		this.setCorners(origen, base, altura);
	}

	public void setCorners(Point origen, int base, int altura) {
		this.setLeftDown(origen);
		this.setLeftUp(origen, altura);
		this.setRightDown(origen, base);
		this.setRightUp(base, altura);
	}

	public Point getLeftDown() {
		return leftDown;
	}

	private void setLeftDown(Point leftDown) {
		this.leftDown = leftDown;
	}

	public Point getLeftUp() {
		return leftUp;
	}

	private void setLeftUp(Point origen, int altura) {
		Point newPoint = new Point(0, altura);
		this.leftUp = origen.addPoint(newPoint);
	}

	public Point getRightDown() {
		return rightDown;
	}

	private void setRightDown(Point origen, int base) {
		Point newPoint = new Point(base, 0);
		this.rightDown = origen.addPoint(newPoint);
	}

	public Point getRightUp() {
		return rightUp;
	}

	private void setRightUp(int base, int altura) {
		this.rightUp = new Point(base, altura);
	}

	private int base() {
		return this.getLeftDown().getX() - this.getRightDown().getX();
	}

	private int altura() {
		return this.getLeftDown().getY() - this.getLeftUp().getY();
	}

	public int perimetro() {
		return 2 * (this.base() + this.altura());
	}

	public int area() {
		return this.base() * this.altura();
	}

	public boolean esHorizontal() {
		return this.base() >= this.altura();
	}

	public boolean esVertical() {
		return this.base() <= this.altura();
	}

}
