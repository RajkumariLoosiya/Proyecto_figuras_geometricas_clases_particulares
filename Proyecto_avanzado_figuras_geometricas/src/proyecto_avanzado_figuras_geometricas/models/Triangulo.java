package proyecto_avanzado_figuras_geometricas.models;

import proyecto_avanzado_figuras_geometricas.interfaces.Escalable;

public class Triangulo extends FiguraGeometrica implements Escalable{
	
	private double base;
	
	private double altura; 
	

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	// Triángulo equilatero
	public Triangulo(double lado) {
		this.base = lado; 
		this.altura = Math.sqrt(3) / 2 * lado;
		
	}
	

	@Override
	double calcularArea() {
		// TODO Auto-generated method stub
		
		return 0.5 * base * altura;
	}

	@Override
	public void escalar(double factor) {
		// TODO Auto-generated method stub
		this.base *= factor;
		this.altura *= factor;
	}


	

	
	

}
