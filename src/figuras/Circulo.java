package figuras;



//2 * pi * radio = Perimetro
//pi * r^2 = Area

public class Circulo extends Figura{

	double radio;
	
	public Circulo(double radio) {
		
		this.radio = radio;
	}
	
	@Override
	public double calcularArea() {
		return Math.round(Math.PI*Math.pow(radio, 2)) ;
	}

	@Override
	public double calcularPerimetro() {
		
		return 2*Math.PI*radio;
	}

	@Override
	public String CalculoTotal() {
	
		String rt = "El perimetro de la figura es: "+calcularPerimetro()+" u"
		+"\nEl area de la figura es: "+calcularArea() +"u^2";

		return rt;
	}
	
	
	
	
}

