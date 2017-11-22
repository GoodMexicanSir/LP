/*	
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
*/

import javax.swing.JOptionPane;
public class tarea19{
	public static void main (String[] args){
		int fibo=1, i,a=1,b=0;
		int[] vector = new int[99];
		String serie = " . ";

		for(i=1; i<99; i++){
			fibo = a + b;
			a = b;
			b = fibo;

			vector[i] = fibo;
		}

		for(i=1; i<99; i++){
			serie = serie + vector[i] + " . ";
		}
		JOptionPane.showMessageDialog(null,"["+serie+"]");
	} //Fin de función main
} //Fin de clase tarea19