/*	
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
*/

import javax.swing.JOptionPane;
public class tarea17{
	public static void main (String[] args){
		String entrada;
		int i, n, b, suma=0;
		String resultado = " . ";

		entrada = JOptionPane.showInputDialog(null,"Ingrese la magnitud del vector:");
		n = Integer.parseInt(entrada);
		int[] vector = new int[n];

		for(i=0; i<n; i++){
			entrada = JOptionPane.showInputDialog(null,"Ingrese el valor de vector["+i+"]:");
			vector[i] = Integer.parseInt(entrada);
		}

		entrada = JOptionPane.showInputDialog(null,"Ingrese el valor a buscar:");
		b = Integer.parseInt(entrada);

		for(i=0; i<n; i++){
			if(vector[i]==b){ suma = suma + 1; }
		}

		for(i=0; i<n; i++){
			resultado = resultado + vector[i] + " . ";
		}
		JOptionPane.showMessageDialog(null,"Valor a buscar: "+b+"\nEl numero aparecio "+suma+" veces en el vector\n[ "+resultado+" ]");
	} //Fin de función main
} //Fin de clase tarea17