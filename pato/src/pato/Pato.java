package pato;

public class Pato {

	private int Posicion;
	public Pato (int pos)
	{
		this.Posicion=pos;
	}
	public int AndaHaciaAdelante (int pasos)
	{
		return this.Posicion+=pasos;
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
