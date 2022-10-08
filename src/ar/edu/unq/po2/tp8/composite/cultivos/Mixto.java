package ar.edu.unq.po2.tp8.composite.cultivos;

import java.util.ArrayList;
import java.util.List;

public class Mixto extends Cultivo {

	private List<Cultivo> cultivos;

	public Mixto() {
		this.setCultivos(new ArrayList<Cultivo>());
	}

	private List<Cultivo> getCultivos() {
		return cultivos;
	}

	private void setCultivos(List<Cultivo> cultivos) {
		this.cultivos = cultivos;
	}

	@Override
	public int getGanacia() {
		return this.getCultivos().stream().mapToInt(cultivo -> cultivo.getGanacia()).sum();
	}

	@Override
	public void addCultivo(Cultivo cultivo) {
		this.getCultivos().add(cultivo);
	}

	@Override
	public void deleteCultivo(Cultivo cultivo) {
		this.getCultivos().remove(cultivo);

	}


}
