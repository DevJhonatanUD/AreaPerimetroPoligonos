package figuras;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("\tCalculadora Area y Perimetro");
		

		
		int opc;
		
		do {
		
			opc = menu();
			
			
		}while(opc!=4);
		
	
	}
	
	public static int menu() {

int opc = Integer.parseInt(JOptionPane.showInputDialog(""
				+ "                Menu"
				+ "\n1. Circulo"
				+ "\n2. Poligono Regular"
				+ "\n3. Poligono Irregular"
				+ "\n4. Salir"
				+ "\n\nIngrese una opcion: ")); 
		
		switch (opc) {
		case 1:
			System.out.print("Ingrese el radio: ");
			double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio: "));
			Circulo circulo = new Circulo(radio);
			JOptionPane.showMessageDialog(null, circulo.CalculoTotal()); 

			break;
		case 2:
			int numlados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de lados [3-5]"));
			if(numlados==3) {
				System.out.print("Ingrese la longitud del primer lado: ");
				double longitudA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud A: "));
				System.out.print("Ingrese la longitud del segundo lado: ");
				double longitudB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud B: "));
				System.out.print("Ingrese la longitud del tercer lado: ");
				double longitudC = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud C: "));
				Poligono pol = new PoligonoRegular(numlados, longitudA, longitudB, longitudC);
				System.out.println(pol.CalculoTotal()); 
			}else {
				System.out.print("Ingrese la longitud del primer lado: ");
				double longitudA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud A: "));
				Poligono pol = new PoligonoRegular(numlados, longitudA);
				System.out.println(pol.CalculoTotal()); 
			}
			break;
		case 3:
			int vertices;
			
		
			do {
			vertices = Integer.parseInt(JOptionPane.showInputDialog("Cuantos vertices tiene: "));
			if (vertices<3) 
				JOptionPane.showMessageDialog(null, "Los vertices deben ser mayor a 3");
			}while(vertices <3);
			
			double [] coorX = new double[vertices+1];
			double [] coorY = new double[vertices+1]; 
			
			for (int i=0; i<vertices; i++) {
				
				coorX[i]=  Double.parseDouble(JOptionPane.showInputDialog("Ingrese la coordenada en X de el vertice "+(i+1)));
				
				coorY[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la coordenada en Y de el vertice "+(i+1)));
				 
								
			}
			
			Poligono pol2 = new PoligonoIrregular(vertices, coorX, coorY);
			JOptionPane.showMessageDialog(null, pol2.CalculoTotal());		
			break;
			
		case 4:
			System.out.println("Hasta luego...");
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Opcion no disponible, escoja de nuevo! ");
			break;
		}
		
		return opc;
	}
	


}
