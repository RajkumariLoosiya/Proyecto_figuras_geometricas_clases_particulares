package proyecto_avanzado_figuras_geometricas;

import proyecto_avanzado_figuras_geometricas.models.Circulo;
import proyecto_avanzado_figuras_geometricas.models.Cuadrado;
import proyecto_avanzado_figuras_geometricas.models.FiguraGeometrica;
import proyecto_avanzado_figuras_geometricas.models.GrupoFiguras;
import proyecto_avanzado_figuras_geometricas.models.Rectangulo;
import proyecto_avanzado_figuras_geometricas.models.Triangulo;

public class Proyecto_avanzado_figuras_geometricas {
	
	public static void main (String [] args) {

		Triangulo triangulo = new Triangulo(3.0,4.0);
		
		Circulo circulo = new Circulo(2.0);
		
		Rectangulo rectangulo = new Rectangulo(4.0,6.0);
		
		Cuadrado cuadrado = new Cuadrado(5.0);
		
		GrupoFiguras grupoFiguras = new GrupoFiguras(4);
		
//		grupoFiguras.añadirFiguraGrupo(triangulo);
//		grupoFiguras.añadirFiguraGrupo(circulo);
//		grupoFiguras.añadirFiguraGrupo(rectangulo);
		grupoFiguras.añadirFiguraGrupo(cuadrado);
		
		System.out.println("El area total de las figuras es de :" + grupoFiguras.calcularAreaTotal());
		grupoFiguras.escalarGrupo(2.0);
		System.out.println("El area total después de escalar las figuras es de :" + grupoFiguras.calcularAreaTotal());
		
		System.out.println();
	}

}
