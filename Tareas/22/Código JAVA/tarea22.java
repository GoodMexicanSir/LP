/*	
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
*/

import javax.swing.JOptionPane;
public class tarea22{
	public static void main (String[] args){
		String entrada ="";
		String salida = "";
		int i, j, c, f, b, suma=0;

		entrada = JOptionPane.showInputDialog(null,"Ingrese el numero de filas:");
		c = Integer.parseInt(entrada);
		entrada = JOptionPane.showInputDialog(null,"Ingrese el numero de columnas:");
		f = Integer.parseInt(entrada);
		int[][] matriz = new int[c][f];

		for(i=0; i<c; i++){
			for(j=0; j<f; j++){
				entrada = JOptionPane.showInputDialog(null,"Ingrese el valor de matriz["+i+"]["+j+"]");
				matriz[i][j] = Integer.parseInt(entrada);
			}
		}

		entrada = JOptionPane.showInputDialog(null,"Ingrese el valor a buscar:");
		b = Integer.parseInt(entrada);

		for(i=0; i<c; i++){
			for(j=0; j<f; j++){
				if(matriz[i][j]==b){suma = suma + 1;}

				salida = salida + matriz[i][j] + "   ";
			}
			salida = salida + ("\n");
		}

		JOptionPane.showMessageDialog(null,"Matriz["+c+"]["+f+"]\n"+salida+"\nElemento a buscar: "+b+"\nEl "+b+" aparece "+suma+" veces");
	} //Fin de función main
} //Fin de clase tarea22