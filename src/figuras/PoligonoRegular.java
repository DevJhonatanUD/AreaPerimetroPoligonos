package figuras;

public class PoligonoRegular extends Poligono {

	private int numLados;

	private double longitudA;
	private double longitudB;
	private double longitudC;

	private double Area;
	private double Perimetro;

//Triangulos
	public PoligonoRegular(int numLados, double longitudA, double longitudB, double longitudC) {
		super();
		this.numLados = numLados;
		this.longitudA = longitudA;
		this.longitudB = longitudB;
		this.longitudC = longitudC;
	}

//Cuadrados y pentagonos
	public PoligonoRegular(int numLados, double longitudA) {
		super();
		this.numLados = numLados;
		this.longitudA = longitudA;

	}

	@Override
	public double calcularPerimetro() {
		switch (numLados) {
		case 3:
			Perimetro = longitudA + longitudB + longitudC;
			break;

		case 4:
			Perimetro = 4 * longitudA;
			break;
		case 5:
			Perimetro = 5 * longitudA;
			break;
		default:
			System.out.println("Figura con lados no disponible");
			break;
		}

		return Perimetro;
	}

	@Override
	public double calcularArea() {
		switch (numLados) {
		case 3:

			System.out.println("\nPara un triangulo");
			double s = (longitudA + longitudB + longitudC) / 2;
			Area = Math.sqrt((s * (s - longitudA) * (s - longitudB) * (s - longitudC)));
			break;

		case 4:
			System.out.println("\nPara un Cuadrado");
			Area = longitudA * longitudA;

			break;

		case 5:
			System.out.println("\nPara un pentagono:");
			double ap = (longitudA / 2) / Math.tan(Math.toRadians(36));
			// ap = Math.round(ap*10.0)/10.0;
			Area = (calcularPerimetro() * ap) / 2;
			break;
		default:
			System.out.println("Figura con lados no disponible");
			break;
		}

		return Math.round(Area * 1000.0) / 1000.0;
	}



	@Override
	public String CalculoTotal() {
	
		String rt = "El perimetro de la figura es: "+calcularPerimetro()+" u"
		+"\nEl area de la figura es: "+calcularArea() +"u^2";
		
		
		
		return rt;
	}
	
	

}