
public class Romboide implements Figuras{
	private String name;
	private double base;
	private double altura;
	
	public Romboide(String name, double base, double altura) {
		super();
		this.name = name;
		this.base = base;
		this.altura = altura;
	}//Constructor
	
	public double calcularArea() {
		return (getBase() * getAltura() );
	}

	public double calcularPerimetro() {
		return (2* getBase() + 2*getAltura() );
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	

}//class Romboide
