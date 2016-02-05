package pato;

public class Pato {

	// Propiedades de Pato
	private int Posicion;
	private String Sexo;
	

	// Constructor
	public Pato (int pos) 
	{
		this.Posicion=pos;
	}
	
	// M�todos
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
	public int DimeSexo()
	{
		return this.Sexo;
	}
}
