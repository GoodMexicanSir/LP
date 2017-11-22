/*	
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
*/

import javax.swing.JOptionPane;
public class tarea18{
	public static void main (String[] args){
		String entrada;
		int i, n, pos=0, neg=0, nul=0;
		String resultado = " . ";

		entrada = JOptionPane.showInputDialog(null,"Ingrese la magnitud del vector:");
		n = Integer.parseInt(entrada);
		int[] vector = new int[n];

		for(i=0; i<n; i++){
			entrada = JOptionPane.showInputDialog(null,"Ingrese el valor de vector["+i+"]:");
			vector[i] = Integer.parseInt(entrada);
		}

		for(i=0; i<n; i++){
			if(vector[i]>0){ pos = pos + 1; }
			else if(vector[i]<0){ neg = neg + 1;}
			else {nul = nul + 1;}
		}

		for(i=0; i<n; i++){
			resultado = resultado + vector[i] + " . ";
		}

		JOptionPane.showMessageDialog(null,"["+resultado+"]\nValores positivos: "+pos+"\nValores negativos: "+neg+"\nValores nulos: "+nul);
	} //Fin de función main
} //Fin de clase tarea18