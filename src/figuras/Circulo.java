package figuras;

public class Circulo extends Figura {

	double radio;

	/**
	 * Se crea el circulo con un radio específico
	 * 
	 * @param radio
	 */
	public Circulo(double radio) {

		this.radio = radio;
	}

	/**
	 * Se calcula el area del circulo, Pi*r^2
	 * 
	 * @return area
	 */
	@Override
	protected double calcularArea() {
		area = (int) Math.round(Math.PI * Math.pow(radio, 2));

		return area;
	}

	/**
	 * Se calcula el perimetro del circulo, 2*Pi*r
	 * 
	 * @return perimetro
	 */
	@Override
	protected double calcularPerimetro() {
		perimetro = (int) Math.round(2 * Math.PI * radio);

		return perimetro;
	}

	/**
	 * Obtenemos el valor del area del circulo previamente calculado.
	 * 
	 * @return area
	 */
	public int getAreaCirculo() {
		return area;
	}

	/**
	 * Obtenemos el valor del perimetro del circulo previamente calculado.
	 * 
	 * @return perimetro
	 */
	public int getPerimetroCirculo() {
		return perimetro;
	}

}
