/*	
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
*/

import javax.swing.JOptionPane;
public class tarea10{
	public static void main (String[] args){
		String entrada;
		Double x,a;
		String[] options={"1","2","3","4","Salir"};
		int v = JOptionPane.showOptionDialog(null,"Convertir de Pesos a ...\n 1.- Dolares\n 2.- Euros\n 3.- Yenes\n 4.- Dolares de Hong Kong","Monedas",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);

		switch(v){
			case 0:
				entrada = JOptionPane.showInputDialog("Ingrese la cantidad a convertir: ");
				x = Double.parseDouble(entrada);
				a = x*0.05265;
				JOptionPane.showMessageDialog(null,+x+" Pesos equivalen a "+a+" Dolares\n\nTasa de cambio:\n1 MXP = 0.05265 USD");
				break;
			case 1:
				entrada = JOptionPane.showInputDialog("Ingrese la cantidad a convertir: ");
				x = Double.parseDouble(entrada);
				a = x*0.04487;
				JOptionPane.showMessageDialog(null,+x+" Pesos equivalen a "+a+" Euros\n\nTasa de cambio:\n1 MXP = 0.04487 EUR");
				break;
			case 2:
				entrada = JOptionPane.showInputDialog("Ingrese la cantidad a convertir: ");
				x = Double.parseDouble(entrada);
				a = x*5.91789;
				JOptionPane.showMessageDialog(null,+x+" Pesos equivalen a "+a+" Yenes\n\nTasa de cambio:\n1 MXP = 5.91789 JPY");
				break;
			case 3:
				entrada = JOptionPane.showInputDialog("Ingrese la cantidad a convertir: ");
				x = Double.parseDouble(entrada);
				a = x*0.40984;
				JOptionPane.showMessageDialog(null,+x+" Pesos equivalen a "+a+" Dolares de Hong Kong\n\nTasa de cambio:\n1 MXP = 0.40984 HKD");
				break;
			default:
			break;
		}//Fin de switch
	} //Fin de función main
} //Fin de clase tarea8