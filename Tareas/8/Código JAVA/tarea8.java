/*	
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
*/

import javax.swing.JOptionPane;
public class tarea8{
	public static void main (String[] args){
		String entrada;
		int x,y,z;
		Double a,b;
		String[] options={"1","2","3","4","Salir"};
		int v = JOptionPane.showOptionDialog(null,"Selecciona el numero de la figura cuya area quieres calcular\n 1.- Cuadrado\n 2.- Rectangulo\n 3.- Triangulo\n 4.- Circulo","Numeros",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);

		switch(v){
			case 0:
				entrada = JOptionPane.showInputDialog("Ingrese la longitud del lado: ");
				x = Integer.parseInt(entrada);
				y = x*x;
				JOptionPane.showMessageDialog(null,"El area del cuadrado es "+y);
				break;
			case 1:
				entrada = JOptionPane.showInputDialog("Ingrese la longitud de la base: ");
				x = Integer.parseInt(entrada);
				entrada = JOptionPane.showInputDialog("Ingrese la longitud de la altura: ");
				y = Integer.parseInt(entrada);
				z = x*y;
				JOptionPane.showMessageDialog(null,"El area del rectangulo es "+z);
				break;
			case 2:
				entrada = JOptionPane.showInputDialog("Ingrese la longitud de la base: ");
				x = Integer.parseInt(entrada);
				entrada = JOptionPane.showInputDialog("Ingrese la longitud de la altura: ");
				y = Integer.parseInt(entrada);
				z = (x*y)/2;
				JOptionPane.showMessageDialog(null,"El area del triangulo es "+z);
				break;
			case 3:
				entrada = JOptionPane.showInputDialog("Ingrese la longitud del radio: ");
				a = Double.parseDouble(entrada);
				b = (3.1416*a)/2.0;
				JOptionPane.showMessageDialog(null,"El area del circulo es "+b);
				break;
			default:
			break;
		}//Fin de switch
	} //Fin de función main
} //Fin de clase tarea8