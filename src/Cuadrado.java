
public class Cuadrado implements Figuras{
	private String name;
	private double lado;
	
	public Cuadrado(String name, double lado) {
		super();
		this.name = name;
		this.lado = lado;
	}//Constructor
	
	public double calcularArea() {
		return (getLado() * getLado() );
	}

	public double calcularPerimetro() {
		return (getLado() * 4  );
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	

	}//Cuadrado
