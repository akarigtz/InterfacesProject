
public class Rectangulo implements Figuras{
	private String name;
	private double Base;
	private double Altura;
	
	public Rectangulo(String name, double base, double altura) {
		super();
		this.name = name;
		Base = base;
		Altura = altura;
	}//Constructor
	
	public double calcularArea() {
		return (getBase() * getAltura() );
	}

	public double calcularPerimetro() {
		return (getBase()*2 + getAltura()*2 );
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBase() {
		return Base;
	}

	public void setBase(double base) {
		Base = base;
	}

	public double getAltura() {
		return Altura;
	}

	public void setAltura(double altura) {
		Altura = altura;
	}
	
	
	
	
	
}//Rectangulo
