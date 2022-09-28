
public class Rombo implements Figuras{
	private String name;
	private double lado;
	private double diagonalMayor;
	private double diagonalMenor;
	
	public Rombo(String name, double lado, double diagonalMayor, double diagonalMenor) {
		super();
		this.name = name;
		this.lado = lado;
		this.diagonalMayor = diagonalMayor;
		this.diagonalMenor = diagonalMenor;
	}//Constructor Rombo
	
	public double calcularArea() {
		return (getDiagonalMayor() * getDiagonalMenor() )/2;
	}

	public double calcularPerimetro() {
		return (getLado() * 4);
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

	public double getDiagonalMayor() {
		return diagonalMayor;
	}

	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}

	public double getDiagonalMenor() {
		return diagonalMenor;
	}

	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}
	
	
	
	

}//Rombo
