package ar.edu.unq.po2.tp8.composite.fileSystem;

import java.util.Date;

public interface FileSystem {
//	Retorna el total ocupado en disco del receptor. Expresado en
//	cantidad de bytes.
	public int totalSize();
//	Imprime en consola el contenido indicando el nombre del elemento
//	indentandolo con tantos espacios como profundidad en la estructura.
	public void printStructure();
//	Elemento mas nuevo
	public FileSystem lastModified();
//	Elemento mas antiguo
	public FileSystem oldestElement();
	public FileSystem lastModifiedBetween(FileSystem actual);
	public Date getFecha();
}
