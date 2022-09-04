package ar.edu.unq.po2.tp3;

public class Point {

	private int x;
	private int y;

	public Point point(int x, int y) {
		Point newPoint = new Point();

		newPoint.setBothAxis(x, y);

		return newPoint;
	}

	private int getX() {
		return this.x;
	}

	private void setX(int x) {
		this.x = x;
	}

	private int getY() {
		return this.y;
	}

	private void setY(int y) {
		this.y = y;
	}

	private void setBothAxis(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
}
