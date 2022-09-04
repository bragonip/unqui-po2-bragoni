package ar.edu.unq.po2.tp3;

public class Point {

	private int x;
	private int y;

	public Point point() {
		Point newPoint = new Point();
		newPoint.movePoint(0, 0);
		return newPoint;
	}

	public Point point(int x, int y) {
		Point newPoint = new Point();
		newPoint.movePoint(x, y);
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

	private void movePoint(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public Point addPoint(Point aPoint) {
		
		return this.point(this.getX() + aPoint.getX(), this.getX() + aPoint.getX());
//		Point newPoint = new Point();
//
//		newPoint.setX(this.getX() + aPoint.getX());
//		newPoint.setY(this.getX() + aPoint.getX());
//
//		return newPoint;
	}
}
