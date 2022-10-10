package ar.edu.unq.po2.tp8.observer.encuentrosDeportivos;

public interface IObservable {
	
	public void notificar(Partido partido);
	public void agregarSuscriptor(IObserver suscriptor);

}
