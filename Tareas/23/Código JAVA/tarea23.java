/*	
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
*/

import javax.swing.JOptionPane;
public class tarea23{
	public static void main (String[] args){
		String entrada ="";
		String salidaC = "";
		int i, j, c, f, b;

		entrada = JOptionPane.showInputDialog(null,"Ingrese el numero de filas:");
		c = Integer.parseInt(entrada);
		entrada = JOptionPane.showInputDialog(null,"Ingrese el numero de columnas:");
		f = Integer.parseInt(entrada);
		int[][] matrizA = new int[c][f];
		int[][] matrizB = new int[c][f];
		int[][] matrizC = new int[c][f];

		for(i=0; i<c; i++){
			for(j=0; j<f; j++){
				entrada = JOptionPane.showInputDialog(null,"Ingrese el valor de matrizA["+i+"]["+j+"]");
				matrizA[i][j] = Integer.parseInt(entrada);
			}
		}
		for(i=0; i<c; i++){
			for(j=0; j<f; j++){
				entrada = JOptionPane.showInputDialog(null,"Ingrese el valor de matrizB["+i+"]["+j+"]");
				matrizB[i][j] = Integer.parseInt(entrada);
			}
		}

		for(i=0; i<c; i++){
			for(j=0; j<f; j++){
				matrizC[i][j] = matrizA[i][j] + matrizB[i][j];

				salidaC = salidaC + matrizC[i][j] + "   ";
			}
			salidaC = salidaC + ("\n");
		}

		JOptionPane.showMessageDialog(null,"[A]+[B] = [C]\n"+salidaC);
	} //Fin de función main
} //Fin de clase tarea23