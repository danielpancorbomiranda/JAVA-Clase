package pato;

public class Pato {

	// Propiedades de Pato
	private int Posicion;
	
	// Constructor
	public Pato (int pos) 
	{
		this.Posicion=pos;
	}
	
	// Métodos
	public int AndaHaciaAdelante (int pasos)
	{
		return this.Posicion+=pasos; // this.Posicion=Posicion + pasos
	}
	public int AndaHaciaDetras (int pasos)
	{
		return this.Posicion-=pasos;
	}
	public int DimePosicion()
	{
		return this.Posicion;
	}
}
