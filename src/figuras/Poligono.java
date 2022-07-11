package figuras;


public class Poligono extends Figura {

	int vertices;
	int[] coorX;
	int[] coorY;

	/**
	 * Creación del poligono
	 * 
	 * @param vertices
	 * @param coorX2
	 * @param coorY2
	 */
	public Poligono(int vertices, int[] coorX2, int[] coorY2) {
		super();
		this.vertices = vertices;
		this.coorX = coorX2;
		this.coorY = coorY2;

	}

	/**
	 * Calcula el área del poligono, utilizando el método numérico de Gauss
	 * 
	 * @return area;
	 */
	@Override
	protected double calcularArea() {
		double sumA = 0;
		double sumB = 0;
		int tempLocal = coorX.length;
		// Nuevo arreglo para aplicar Gauss
		coorX[tempLocal - 1] = coorX[0];
		coorY[tempLocal - 1] = coorY[0];

		for (int i = 0; i < coorX.length - 1; i++) {

			sumA += coorX[i] * coorY[i + 1];
			sumB += coorX[i + 1] * coorY[i];

		}

		area = (int) (0.5 * Math.abs(sumA - sumB));

		return Math.round(area);
	}

	/**
	 * Se calcula el perimetro del Poligono, con las distancias entre los vertices.
	 * 
	 * @return perimetro
	 */
	@Override
	protected double calcularPerimetro() {

		int lados = (coorX.length - 1);

		for (int i = 0; i < lados; i++) {

			perimetro += Math
					.sqrt((Math.pow((coorX[i + 1]) - (coorX[i]), 2) + (Math.pow((coorY[i + 1]) - (coorY[i]), 2))));

		}

		return Math.round(perimetro);
	}

	/**
	 * Obtenemos el número de los vertices del poligono
	 * 
	 * @return vertices
	 */
	public int getVertices() {
		return vertices;
	}

	/**
	 * Obtenemos el arreglo de las coordenadas en X del los vertices
	 * 
	 * @return coorX []
	 */
	public int[] getCoorX() {
		return coorX;
	}

	/**
	 * Obtenemos el arreglo de las coordenadas en Y del los vertices
	 * 
	 * @return coorY []
	 */
	public int[] getCoorY() {
		return coorY;
	}

	/**
	 * Obtenemos el valor del Area del Poligono
	 * 
	 * @return area
	 */
	public int getAreaPoligono() {
		return area;
	}

	/**
	 * Obtenemos el valor del Perimetro del Poligono.
	 * 
	 * @return perimetro
	 */
	public int getPerimetroPoligono() {
		return perimetro;
	}

}