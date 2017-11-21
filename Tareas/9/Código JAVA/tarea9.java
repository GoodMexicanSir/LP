/*	
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
*/

import javax.swing.JOptionPane;
public class tarea9{
	public static void main (String[] args){
		String entrada;
		int x;
		Double a;
		String[] options={"1","2","Salir"};
		int v = JOptionPane.showOptionDialog(null,"Convertir\n 1.- De grados Celcius a Farenheit\n 2.- De grados Farenheit a Celcius","Grados",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);

		switch(v){
			case 0:
				entrada = JOptionPane.showInputDialog("Ingrese los grados a convertir: ");
				x = Integer.parseInt(entrada);
				a = (x*1.8) + 32;
				JOptionPane.showMessageDialog(null,+x+" grados Celcius equivalen a "+a+" grados Farenheit");
				break;
			case 1:
				entrada = JOptionPane.showInputDialog("Ingrese los grados a convertir: ");
				x = Integer.parseInt(entrada);
				a = (x - 32)/1.8;
				JOptionPane.showMessageDialog(null,+x+" grados Farenheit equivalen a "+a+" grados Celcius");
				break;
			default:
			break;
		}//Fin de switch
	} //Fin de función main
} //Fin de clase tarea8