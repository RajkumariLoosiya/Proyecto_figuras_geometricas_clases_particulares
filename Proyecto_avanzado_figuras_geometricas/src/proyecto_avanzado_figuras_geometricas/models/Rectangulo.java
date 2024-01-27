package proyecto_avanzado_figuras_geometricas.models;

import proyecto_avanzado_figuras_geometricas.interfaces.Escalable;

public class Rectangulo extends FiguraGeometrica implements Escalable{
	
	private double base; 
	
	private double altura; 
	
	public Rectangulo(double base, double altura) {
		
		this.base = base; 
		
		this.altura = altura;
		
	}
	
	public Rectangulo(double lado) {
		
		this.altura = lado; 
		this.base = lado; 
		
	}

	@Override
	double calcularArea() {
		// TODO Auto-generated method stub
		return base * altura;
	}

	@Override
	public void escalar(double factor) {
		// TODO Auto-generated method stub
		this.base = base * factor; 
		this.altura *= factor;
	}


	

}
