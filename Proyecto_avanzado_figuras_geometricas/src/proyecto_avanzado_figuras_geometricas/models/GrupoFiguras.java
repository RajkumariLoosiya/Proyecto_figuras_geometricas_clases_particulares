package proyecto_avanzado_figuras_geometricas.models;

import proyecto_avanzado_figuras_geometricas.interfaces.Escalable;

public class GrupoFiguras <T extends FiguraGeometrica & Escalable>{

	private T [] arrayFiguras;
	
	private int count; 
	
	public GrupoFiguras(int capacidad) {
		
		arrayFiguras = (T[]) new FiguraGeometrica[capacidad];  
		
		count = 0; 
		
	}
	
	public void añadirFiguraGrupo(T figura) {
		
		if(count < arrayFiguras.length) {
			
			arrayFiguras[count++] = figura;
			
		}
		else {
			System.err.println("Lo siento, no se puede agregar la figura. Capacidad máxima excedida");
		}
		
		
		
	}
	
	public double calcularAreaTotal() {
		
		double areaTotal = 0; 
		
		for(FiguraGeometrica i : arrayFiguras) {
			
			if(i != null) {
				
				areaTotal += i.calcularArea();
				
			}
			
		}
		
		return areaTotal;
		
	}	
	
	public void escalarGrupo(double factor) {
		
		for(FiguraGeometrica i: arrayFiguras) {
				
			if(i != null && i instanceof Escalable) {
				
				((Escalable) i).escalar(factor);
				
			}
		
		}
		
		
	}
	
}
