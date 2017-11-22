/*	
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
*/

import javax.swing.JOptionPane;
public class tarea15{
	public static void main (String[] args){
		int i, n;
		double a;
		String entrada;
		String serie = "";

		entrada = JOptionPane.showInputDialog("Ingrese el numero de terminos: ");
		n = Integer.parseInt(entrada);

		for(i=1; i<n; i++){
			a = 3.1416*i;
			serie = serie + a + ", ";
		}
		a = 3.1416*i;
		serie = serie + a + ".";
		JOptionPane.showMessageDialog(null,serie);
	} //Fin de función main
} //Fin de clase tarea15