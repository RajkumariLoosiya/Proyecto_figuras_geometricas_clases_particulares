package proyecto_avanzado_figuras_geometricas.models;

import proyecto_avanzado_figuras_geometricas.interfaces.Escalable;

public class Circulo extends FiguraGeometrica implements Escalable{
	
	private double radio; 
	
	public Circulo(double radio) {
		
		this.radio = radio; 
		
	}

	@Override
	double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radio, 2);
	}

	@Override
	public void escalar(double factor) {
		// TODO Auto-generated method stub
		this.radio = radio * factor; 
	} 
	
}
