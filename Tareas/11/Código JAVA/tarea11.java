/*	
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
*/

import javax.swing.JOptionPane;
public class tarea11{
	public static void main (String[] args){
		String entrada;
		String serie = "";
		int n,i,a,b;

		entrada = JOptionPane.showInputDialog("Ingrese el numero de terminos: ");
		n = Integer.parseInt(entrada);

		for (i=1; i<n; i++){
			a = (i*2)-1;
			b = (int)Math.pow(i,a);
			serie = serie+b+", ";
		} //Fin del ciclo for
		a = (i*2)-1;
		b = (int)Math.pow(i,a);
		serie = serie+b+".";

		JOptionPane.showMessageDialog(null,serie);
	} //Fin de función main
} //Fin de clase tarea11