package ar.edu.unq.po2.tp8.observer.encuentrosDeportivos;

public interface IObserver {
	
	public void suscribir(IObservable observable);
	public void serNotificado(Partido partido);
	public boolean estaInteresadoEn(Partido partido);
}
