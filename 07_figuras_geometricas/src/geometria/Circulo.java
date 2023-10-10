package geometria;

public class Circulo extends Figura {
	private double radio;
	
	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}


	@Override
	public double superficie() {
		// TODO Auto-generated method stub
		return Math.PI*radio*radio;
	}

}
