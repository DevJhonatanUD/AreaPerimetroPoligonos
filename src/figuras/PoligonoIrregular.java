package figuras;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class PoligonoIrregular extends Poligono {

	int vertices;
	double[] coorX;
	double[] coorY;
	double Area;
	double Perimetro = 0;

	public PoligonoIrregular(int vertices, double[] coorX, double[] coorY) {
		super();
		this.vertices = vertices;
		this.coorX = coorX;
		this.coorY = coorY;
	}

	@Override
	public double calcularArea() {
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

		System.out.println(sumA);
		System.out.println(sumB);

		Area = 0.5 * Math.abs(sumA - sumB);

		return Area;
	}

	@Override
	public double calcularPerimetro() {

		System.out.println("Entro");
		int lados = (coorX.length - 1);
		double[] longitudLados = new double[lados];

		for (int i = 0; i < lados; i++) {

			Perimetro += Math
					.sqrt((Math.pow((coorX[i + 1]) - (coorX[i]), 2) + (Math.pow((coorY[i + 1]) - (coorY[i]), 2))));

		}

		return Perimetro;
	}

	@Override
	public String CalculoTotal() {

		String rt = "El perimetro de la figura es: " + calcularPerimetro() + " u" + "\nEl area de la figura es: "
				+ calcularArea() + "u^2";

		return rt;
	}

}
