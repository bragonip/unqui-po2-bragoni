package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.OptionalDouble;

public class EquipoDeTrabajo {

	private String nombre;
	private ArrayList<Persona> integrantes;

	public EquipoDeTrabajo(String nombre) {
		this.setNombre(nombre);
		this.setIntegrantes(new ArrayList<Persona>());
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Persona> getIntegrantes() {
		return integrantes;
	}

	private void setIntegrantes(ArrayList<Persona> integrantes) {
		this.integrantes = integrantes;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double promedioDeEdadDeIntegrantes() {
		return this.getIntegrantes().stream().mapToInt(persona -> persona.edad()).average().getAsDouble();
	}

	public void agregarIntegrante(Persona nuevoIntegrante) {
		this.getIntegrantes().add(nuevoIntegrante);
	}

	public static void main(String[] args) {

		EquipoDeTrabajo elRejunte;
		Persona pablo = new Persona("Pablo", LocalDate.of(1989, 7, 2));
		Persona ornella = new Persona("Ornella", LocalDate.of(1993, 5, 30));
		Persona alberto = new Persona("Alberto", LocalDate.of(1989, 9, 6));
		Persona nico = new Persona("Nicolás", LocalDate.of(1989, 9, 14));
		Persona martin = new Persona("Pablo", LocalDate.of(1992, 9, 2));

		elRejunte = new EquipoDeTrabajo("El Rejunte");

		elRejunte.agregarIntegrante(pablo);
		elRejunte.agregarIntegrante(ornella);
		elRejunte.agregarIntegrante(alberto);
		elRejunte.agregarIntegrante(nico);
		elRejunte.agregarIntegrante(martin);
		
		System.out.println(elRejunte.promedioDeEdadDeIntegrantes());
	}

}
