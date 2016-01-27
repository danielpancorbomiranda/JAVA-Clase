package pato;

public class Principal_ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pato donals=new Pato(10); //posicion 10 inicial
		
		donals.AndaHaciaAdelante(15);
		
		donals.AndaHaciaDetras(5);
		
		System.out.println("La posición de mi pato es "+donals.DimePosicion()); //posicion 20 final
	}

}
