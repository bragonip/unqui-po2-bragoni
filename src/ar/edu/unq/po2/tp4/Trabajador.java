package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Trabajador {

	private ArrayList<Ingreso> ingresos;

	public Trabajador() {
		this.setIngresos(new ArrayList<Ingreso>());
	}

	public ArrayList<Ingreso> getIngresos() {
		return this.ingresos;
	}

	private void setIngresos(ArrayList<Ingreso> ingresos) {
		this.ingresos = ingresos;
	}

	public Double getTotalPercibido() {
		Double montoPercibido = 0d;
		for (Ingreso ingreso : this.getIngresos()) {
			montoPercibido += ingreso.getMontoPercibido();
		}
		return montoPercibido;
	}

	public Double getMontoImponible() {
		Double montoImponible = 0d;
		for (Ingreso ingreso : this.getIngresos()) {
			montoImponible += ingreso.montoImponible();
		}
		return montoImponible;

	}

	public Double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}

	public void agregarIngreso(Ingreso ingreso) {
		this.getIngresos().add(ingreso);
	}

}
