
public class testFiguras {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo("Triangulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new Triangulo("Bermudas", 82.0, 121.0, 101.0);
		Cuadrado c1 = new Cuadrado("Cuadrado1", 80.0);
		imprimirCalculo(t1); imprimirCalculo(t2); imprimirCalculo(c1);
	}//main

	public static void imprimirCalculo (Figuras f) {
		System.out.println(f);
		System.out.println("+=========================");
		System.out.println("|El área de [" + f.getName() + "] es: " + f.calcularArea() + 
				"\n" + "|El perímetro de ["  + f.getName() + "] es: " + f.calcularPerimetro() );
		System.out.println("+=========================");
		
	}//imprimirCalculo

	
}//class testFiguras
