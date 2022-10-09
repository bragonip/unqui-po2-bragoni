package ar.edu.unq.po2.tpobserver.encuentrosDeportivos;

import java.util.List;

public class Partido {

	private String resultado;
	private List<String> contrincantes;
	private Deporte deporte;
	
	public Partido(String resultado, List<String> contrincantes,Deporte deporte) {
		this.setResultado(resultado);
		this.setContrincantes(contrincantes);
		this.setDeporte(deporte);
	}

	private String getResultado() {
		return this.resultado;
	}

	private void setResultado(String resultado) {
		this.resultado = resultado;
	}

	private List<String> getContrincantes() {
		return this.contrincantes;
	}

	private void setContrincantes(List<String> contrincantes) {
		this.contrincantes = contrincantes;
	}

	public Deporte getDeporte() {
		return this.deporte;
	}

	private void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

}
