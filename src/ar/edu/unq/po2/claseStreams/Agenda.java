package ar.edu.unq.po2.claseStreams;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private List<String> nombres;

	public Agenda() {
		this.setNombres(new ArrayList<String>());
	}

	private List<String> getNombres() {
		return this.nombres;
	}

	private void setNombres(ArrayList<String> nombre) {
		this.nombres = nombre;
	}

	public void agregarElemento(String elemento) {
		this.getNombres().add(elemento);
	}

	public boolean tieneAlMenosUnNombreQueEmpiezaCon(String inicio) {
		
//		return this.getNombres().stream().anyMatch(nombre -> nombre.startsWith(inicio));

		int i = 0;

		while (this.getNombres().size() > i && !this.getNombres().get(i).startsWith(inicio)) {
			i++;
		}

		return this.getNombres().size() > i && this.getNombres().get(i).startsWith(inicio);
	}

	public boolean todosEmpiezanCon(String inicio) {

//		return this.getNombres().stream().allMatch(nombre -> nombre.startsWith(inicio));
		
		int i = 0;

		while (this.getNombres().size() < i && this.getNombres().get(i).startsWith(inicio)) {
			i++;
		}

		return this.getNombres().size() < i && this.getNombres().get(i).startsWith(inicio);

	}

	public List<String> filtrar(String inicio) {
		
//		return this.getNombres().stream().filter(nombre -> nombre.startsWith(inicio)).toList();
		
		List<String> nuevaLista = new ArrayList<String>();
		for (String nombre : this.getNombres()) {
			if (nombre.startsWith(inicio)) {
				nuevaLista.add(nombre);
			}
		}
		return nuevaLista;
	}

	public void printAll() {
		
//		this.getNombres().stream().forEach(nombre -> System.out.println(nombre));
		
		for (String nombre : this.getNombres()) {
			System.out.println(nombre);
		}
	}
}
